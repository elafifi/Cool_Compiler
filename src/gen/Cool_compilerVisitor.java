package gen;// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cool_compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Cool_compilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Cool_compilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(Cool_compilerParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Cool_compilerParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(Cool_compilerParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Cool_compilerParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#formalParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamList(Cool_compilerParser.FormalParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Cool_compilerParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#actualParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamList(Cool_compilerParser.ActualParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(Cool_compilerParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new_obj_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_obj_stmt(Cool_compilerParser.New_obj_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(Cool_compilerParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(Cool_compilerParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracExprStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracExprStmt(Cool_compilerParser.BracExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueStmt(Cool_compilerParser.ValueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(Cool_compilerParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stmt(Cool_compilerParser.Case_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStmt(Cool_compilerParser.MethodCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivStmt(Cool_compilerParser.MulDivStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_expr_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr_stmt(Cool_compilerParser.Not_expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOpStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOpStmt(Cool_compilerParser.RelOpStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(Cool_compilerParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_void_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_void_stmt(Cool_compilerParser.Is_void_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusStmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusStmt(Cool_compilerParser.PlusMinusStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inv_expr_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInv_expr_stmt(Cool_compilerParser.Inv_expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_stmt(Cool_compilerParser.Let_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code feature_access_stmt}
	 * labeled alternative in {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_access_stmt(Cool_compilerParser.Feature_access_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(Cool_compilerParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Cool_compilerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Cool_compilerParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(Cool_compilerParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(Cool_compilerParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmt(Cool_compilerParser.CaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(Cool_compilerParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(Cool_compilerParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(Cool_compilerParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#newObjStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjStmt(Cool_compilerParser.NewObjStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#isvoidStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidStmt(Cool_compilerParser.IsvoidStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#notExprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExprStmt(Cool_compilerParser.NotExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#invExprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvExprStmt(Cool_compilerParser.InvExprStmtContext ctx);
}