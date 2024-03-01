// Generated from C:/Users/Danil/IdeaProjects/CCLab/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(MyGrammarParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_let(MyGrammarParser.Stmt_letContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if(MyGrammarParser.Stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for(MyGrammarParser.Stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_while(MyGrammarParser.Stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_input(MyGrammarParser.Stmt_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_output(MyGrammarParser.Stmt_outputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(MyGrammarParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_expr(MyGrammarParser.Par_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(MyGrammarParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(MyGrammarParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_expr(MyGrammarParser.Rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt_expr(MyGrammarParser.Idt_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expr(MyGrammarParser.Number_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(MyGrammarParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#idt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdt(MyGrammarParser.IdtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(MyGrammarParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(MyGrammarParser.Real_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(MyGrammarParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(MyGrammarParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(MyGrammarParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(MyGrammarParser.Mul_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(MyGrammarParser.Unary_opContext ctx);
}