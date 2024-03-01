// Generated from C:/Users/Danil/IdeaProjects/CCLab/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MyGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(MyGrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(MyGrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_let}.
	 * @param ctx the parse tree
	 */
	void enterStmt_let(MyGrammarParser.Stmt_letContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_let}.
	 * @param ctx the parse tree
	 */
	void exitStmt_let(MyGrammarParser.Stmt_letContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void enterStmt_if(MyGrammarParser.Stmt_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void exitStmt_if(MyGrammarParser.Stmt_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void enterStmt_for(MyGrammarParser.Stmt_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void exitStmt_for(MyGrammarParser.Stmt_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void enterStmt_while(MyGrammarParser.Stmt_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void exitStmt_while(MyGrammarParser.Stmt_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 */
	void enterStmt_input(MyGrammarParser.Stmt_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_input}.
	 * @param ctx the parse tree
	 */
	void exitStmt_input(MyGrammarParser.Stmt_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 */
	void enterStmt_output(MyGrammarParser.Stmt_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt_output}.
	 * @param ctx the parse tree
	 */
	void exitStmt_output(MyGrammarParser.Stmt_outputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(MyGrammarParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(MyGrammarParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPar_expr(MyGrammarParser.Par_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPar_expr(MyGrammarParser.Par_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(MyGrammarParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(MyGrammarParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(MyGrammarParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(MyGrammarParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(MyGrammarParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(MyGrammarParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdt_expr(MyGrammarParser.Idt_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idt_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdt_expr(MyGrammarParser.Idt_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expr(MyGrammarParser.Number_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expr(MyGrammarParser.Number_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(MyGrammarParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_expr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(MyGrammarParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#idt}.
	 * @param ctx the parse tree
	 */
	void enterIdt(MyGrammarParser.IdtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#idt}.
	 * @param ctx the parse tree
	 */
	void exitIdt(MyGrammarParser.IdtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(MyGrammarParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(MyGrammarParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(MyGrammarParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(MyGrammarParser.Real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(MyGrammarParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(MyGrammarParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(MyGrammarParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(MyGrammarParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(MyGrammarParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(MyGrammarParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(MyGrammarParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(MyGrammarParser.Mul_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(MyGrammarParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(MyGrammarParser.Unary_opContext ctx);
}