package org.example;

import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticVisitor extends MyGrammarBaseVisitor {

    private final SemanticChecker semanticChecker = new SemanticChecker();
    private ParseTree tree;

    @Override
    public Object visit(ParseTree tree) {
        this.tree = tree;
        return super.visit(tree);
    }

    @Override
    public Object visitDecl(MyGrammarParser.DeclContext ctx) {
        semanticChecker.visitDecl(ctx);
        return super.visitDecl(ctx);
    }

    @Override
    public Object visitStmt(MyGrammarParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitStmt_let(MyGrammarParser.Stmt_letContext ctx) {
        semanticChecker.visitStmt_let(ctx);
        return super.visitStmt_let(ctx);
    }

    @Override
    public Object visitAdd_expr(MyGrammarParser.Add_exprContext ctx) {
        semanticChecker.visitExpr(ctx);
        return super.visitAdd_expr(ctx);
    }
}
