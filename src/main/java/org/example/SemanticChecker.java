package org.example;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SemanticChecker {

    private final Map<String, String> variables = new HashMap<>();

    public static final List<String> ADD_OPERATIONS = Arrays.asList("+", "-", "or");
    public static final List<String> REL_OPERATIONS = Arrays.asList("<>", "=", "<", "<=", ">", ">=");
    public static final List<String> MUL_OPERATIONS = Arrays.asList("*", "/", "and");
    public static final List<String> UNARY_OPERATIONS = Arrays.asList("not");

    public void visitDecl(MyGrammarParser.DeclContext ctx) {
        String variableType = ctx.var_type().getText();

        for (int i = 0;  i < ctx.idt().size(); i++) {
            String variableName = ctx.idt(i).getText();

            if (variables.get(variableName) == null) {
                variables.put(variableName, variableType);
            } else {
                throw new RuntimeException(String.format("Variable %s is already declared", variableName));
            }
        }
    }

    public void visitStmt(MyGrammarParser.StmtContext ctx) {

    }

    public void visitStmt_let(MyGrammarParser.Stmt_letContext ctx) {
        checkVariable(ctx, ctx.idt().getText());
        String type = visitExpr(ctx.expr()).get(0);

        if (!type.equals(variables.get(ctx.idt().getText()))) {
            throw new RuntimeException(String.format("Invalid type assignment %s (%s) = %s",
                    ctx.idt().getText(),
                    variables.get(ctx.idt().getText()),
                    type));
        }
    }

    public  List<String> visitExpr(MyGrammarParser.ExprContext ctx) {

        List<String> stack = new ArrayList<>();

        if (ctx instanceof MyGrammarParser.Par_exprContext) {
            return visitPar_expr((MyGrammarParser.Par_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Unary_exprContext) {
            return visitUnary_expr((MyGrammarParser.Unary_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Mul_exprContext) {
            return visitMul_expr((MyGrammarParser.Mul_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Add_exprContext) {
            return visitAdd_expr((MyGrammarParser.Add_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Rel_exprContext) {
            return visitRel_expr((MyGrammarParser.Rel_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Bool_exprContext) {
            return visitBool_expr((MyGrammarParser.Bool_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Idt_exprContext) {
            return visitIdt_expr((MyGrammarParser.Idt_exprContext) ctx);
        } else if (ctx instanceof MyGrammarParser.Number_exprContext) {
            return visitNumber_expr((MyGrammarParser.Number_exprContext) ctx);
        }
        return stack;
    }

    public List<String> visitPar_expr(MyGrammarParser.Par_exprContext ctx) {
        return new ArrayList<>(visitExpr(ctx));
    }

    public List<String> visitUnary_expr(MyGrammarParser.Unary_exprContext ctx) {
        return new ArrayList<>(visitExpr(ctx));
    }

    public List<String> visitMul_expr(MyGrammarParser.Mul_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.mul_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitAdd_expr(MyGrammarParser.Add_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.add_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitRel_expr(MyGrammarParser.Rel_exprContext ctx) {
        List<String> stack = new ArrayList<>();

        stack.addAll(visitExpr(ctx.expr(0)));
        stack.add(ctx.rel_op().getText());
        stack.addAll(visitExpr(ctx.expr(1)));

        normalizeStack(ctx, stack);

        return stack;
    }

    public List<String> visitBool_expr(MyGrammarParser.Bool_exprContext ctx) {
        if (ctx.bool_value() != null) {
            return Collections.singletonList("$");
        }
        throw new RuntimeException("Unknown Bool type");
    }

    public List<String> visitIdt_expr(MyGrammarParser.Idt_exprContext ctx) {
        checkVariable(ctx, ctx.idt().getText());
        return Collections.singletonList(variables.get(ctx.idt().getText()));
    }

    public List<String> visitNumber_expr(MyGrammarParser.Number_exprContext ctx) {
        if (ctx.number().int_number() != null) {
            return Collections.singletonList("%");
        }
        if (ctx.number().real_number() != null) {
            return Collections.singletonList("!");
        }
        throw new RuntimeException("Unknown Number type");
    }

    public void normalizeStack(ParserRuleContext ctx, List<String> stack) {
        while (stack.size() >= 3) {
            String el1 = stack.get(0);
            String op = stack.get(1);
            String el2 = stack.get(2);

            if (el1.equals("%") && el2.equals("%")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (ADD_OPERATIONS.contains(op) || MUL_OPERATIONS.contains(op)) {
                    stack.add(0, "%");
                } else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            if (el1.equals("!") && el2.equals("!")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (ADD_OPERATIONS.contains(op) || MUL_OPERATIONS.contains(op)) {
                    stack.add(0, "!");
                } else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            if (el1.equals("$") && el2.equals("$")) {
                stack.remove(el1);
                stack.remove(op);
                stack.remove(el2);

                if (REL_OPERATIONS.contains(op)) {
                    stack.add(0, "$");
                } else {
                    throw  new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
                }

                continue;
            }

            throw new RuntimeException(String.format("Invalid expression %s %s %s", el1, op, el2));
        }
    }

    private void checkVariable(ParserRuleContext ctx, String idt) {
        if (variables.get(idt) == null) {
            throw new RuntimeException(String.format("Variable %s non exist", idt));
        }
    }

}
