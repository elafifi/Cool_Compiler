// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Cool_compilerParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(Cool_compilerParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Cool_compilerParser.ExprContext ctx);
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