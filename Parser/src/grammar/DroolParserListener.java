// Generated from DroolParser.g4 by ANTLR 4.8

	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DroolParser}.
 */
public interface DroolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DroolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DroolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DroolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(DroolParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(DroolParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(DroolParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(DroolParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(DroolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(DroolParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(DroolParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(DroolParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#unaryOpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpr(DroolParser.UnaryOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#unaryOpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpr(DroolParser.UnaryOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#addrcExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddrcExpr(DroolParser.AddrcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#addrcExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddrcExpr(DroolParser.AddrcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#multiplicationExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(DroolParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#multiplicationExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(DroolParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(DroolParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(DroolParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(DroolParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(DroolParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(DroolParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(DroolParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#binAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinAndExpr(DroolParser.BinAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#binAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinAndExpr(DroolParser.BinAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#binXorExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinXorExpr(DroolParser.BinXorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#binXorExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinXorExpr(DroolParser.BinXorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#binOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinOrExpr(DroolParser.BinOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#binOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinOrExpr(DroolParser.BinOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(DroolParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(DroolParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(DroolParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(DroolParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(DroolParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(DroolParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#assignOpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignOpr(DroolParser.AssignOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#assignOpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignOpr(DroolParser.AssignOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(DroolParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(DroolParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#pushpullExpr}.
	 * @param ctx the parse tree
	 */
	void enterPushpullExpr(DroolParser.PushpullExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#pushpullExpr}.
	 * @param ctx the parse tree
	 */
	void exitPushpullExpr(DroolParser.PushpullExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#pushpullOpr}.
	 * @param ctx the parse tree
	 */
	void enterPushpullOpr(DroolParser.PushpullOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#pushpullOpr}.
	 * @param ctx the parse tree
	 */
	void exitPushpullOpr(DroolParser.PushpullOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#graphMemberArrayInit}.
	 * @param ctx the parse tree
	 */
	void enterGraphMemberArrayInit(DroolParser.GraphMemberArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#graphMemberArrayInit}.
	 * @param ctx the parse tree
	 */
	void exitGraphMemberArrayInit(DroolParser.GraphMemberArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DroolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DroolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#constexpr}.
	 * @param ctx the parse tree
	 */
	void enterConstexpr(DroolParser.ConstexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#constexpr}.
	 * @param ctx the parse tree
	 */
	void exitConstexpr(DroolParser.ConstexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(DroolParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(DroolParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(DroolParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(DroolParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DroolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DroolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(DroolParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(DroolParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(DroolParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(DroolParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(DroolParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(DroolParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(DroolParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(DroolParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(DroolParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(DroolParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(DroolParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(DroolParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DroolParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DroolParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterStatement(DroolParser.IterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#iterStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterStatement(DroolParser.IterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(DroolParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(DroolParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(DroolParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(DroolParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#declarseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarseq(DroolParser.DeclarseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#declarseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarseq(DroolParser.DeclarseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DroolParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DroolParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(DroolParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(DroolParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(DroolParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(DroolParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(DroolParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(DroolParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initDeclaratorSeq}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorSeq(DroolParser.InitDeclaratorSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initDeclaratorSeq}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorSeq(DroolParser.InitDeclaratorSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(DroolParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(DroolParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(DroolParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(DroolParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DroolParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DroolParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#parameterDeclarationSeq}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationSeq(DroolParser.ParameterDeclarationSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parameterDeclarationSeq}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationSeq(DroolParser.ParameterDeclarationSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(DroolParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(DroolParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefn(DroolParser.FunctionDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#functionDefn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefn(DroolParser.FunctionDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(DroolParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(DroolParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(DroolParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(DroolParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(DroolParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(DroolParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initializationClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializationClause(DroolParser.InitializationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initializationClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializationClause(DroolParser.InitializationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#bracedInitSeq}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitSeq(DroolParser.BracedInitSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#bracedInitSeq}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitSeq(DroolParser.BracedInitSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initializationseq}.
	 * @param ctx the parse tree
	 */
	void enterInitializationseq(DroolParser.InitializationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initializationseq}.
	 * @param ctx the parse tree
	 */
	void exitInitializationseq(DroolParser.InitializationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(DroolParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(DroolParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void enterClassDefn(DroolParser.ClassDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#classDefn}.
	 * @param ctx the parse tree
	 */
	void exitClassDefn(DroolParser.ClassDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(DroolParser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(DroolParser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memberlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberlist(DroolParser.MemberlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memberlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberlist(DroolParser.MemberlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(DroolParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(DroolParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(DroolParser.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(DroolParser.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(DroolParser.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(DroolParser.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#inheritanceClause}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceClause(DroolParser.InheritanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#inheritanceClause}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceClause(DroolParser.InheritanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#inheriterList}.
	 * @param ctx the parse tree
	 */
	void enterInheriterList(DroolParser.InheriterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#inheriterList}.
	 * @param ctx the parse tree
	 */
	void exitInheriterList(DroolParser.InheriterListContext ctx);
}