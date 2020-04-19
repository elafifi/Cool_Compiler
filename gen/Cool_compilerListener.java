// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cool_compilerParser}.
 */
public interface Cool_compilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Cool_compilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Cool_compilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(Cool_compilerParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(Cool_compilerParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Cool_compilerParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Cool_compilerParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(Cool_compilerParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(Cool_compilerParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(Cool_compilerParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(Cool_compilerParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(Cool_compilerParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(Cool_compilerParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Cool_compilerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Cool_compilerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void enterActualParamList(Cool_compilerParser.ActualParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void exitActualParamList(Cool_compilerParser.ActualParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(Cool_compilerParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(Cool_compilerParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Cool_compilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Cool_compilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(Cool_compilerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(Cool_compilerParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Cool_compilerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Cool_compilerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Cool_compilerParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Cool_compilerParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(Cool_compilerParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(Cool_compilerParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(Cool_compilerParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(Cool_compilerParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(Cool_compilerParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(Cool_compilerParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(Cool_compilerParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(Cool_compilerParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(Cool_compilerParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(Cool_compilerParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(Cool_compilerParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(Cool_compilerParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#newObjStmt}.
	 * @param ctx the parse tree
	 */
	void enterNewObjStmt(Cool_compilerParser.NewObjStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#newObjStmt}.
	 * @param ctx the parse tree
	 */
	void exitNewObjStmt(Cool_compilerParser.NewObjStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#isvoidStmt}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidStmt(Cool_compilerParser.IsvoidStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#isvoidStmt}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidStmt(Cool_compilerParser.IsvoidStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#notExprStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotExprStmt(Cool_compilerParser.NotExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#notExprStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotExprStmt(Cool_compilerParser.NotExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cool_compilerParser#invExprStmt}.
	 * @param ctx the parse tree
	 */
	void enterInvExprStmt(Cool_compilerParser.InvExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cool_compilerParser#invExprStmt}.
	 * @param ctx the parse tree
	 */
	void exitInvExprStmt(Cool_compilerParser.InvExprStmtContext ctx);
}