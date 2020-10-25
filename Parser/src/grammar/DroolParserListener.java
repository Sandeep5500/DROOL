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
	 * Enter a parse tree produced by {@link DroolParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(DroolParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(DroolParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(DroolParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(DroolParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DroolParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DroolParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DroolParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DroolParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(DroolParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(DroolParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#countExpression}.
	 * @param ctx the parse tree
	 */
	void enterCountExpression(DroolParser.CountExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#countExpression}.
	 * @param ctx the parse tree
	 */
	void exitCountExpression(DroolParser.CountExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#addrcExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddrcExpression(DroolParser.AddrcExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#addrcExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddrcExpression(DroolParser.AddrcExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#questionExpression}.
	 * @param ctx the parse tree
	 */
	void enterQuestionExpression(DroolParser.QuestionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#questionExpression}.
	 * @param ctx the parse tree
	 */
	void exitQuestionExpression(DroolParser.QuestionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(DroolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(DroolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(DroolParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(DroolParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(DroolParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(DroolParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(DroolParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(DroolParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(DroolParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(DroolParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(DroolParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(DroolParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(DroolParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(DroolParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(DroolParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(DroolParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(DroolParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(DroolParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(DroolParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(DroolParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(DroolParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(DroolParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(DroolParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(DroolParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DroolParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DroolParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DroolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DroolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(DroolParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(DroolParser.ConstantExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(DroolParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(DroolParser.ExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(DroolParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(DroolParser.SelectionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(DroolParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(DroolParser.IterationStatementContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(DroolParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(DroolParser.DeclarationseqContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(DroolParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(DroolParser.InitDeclaratorListContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(DroolParser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(DroolParser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(DroolParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(DroolParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(DroolParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(DroolParser.ParameterDeclarationListContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(DroolParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(DroolParser.FunctionDefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(DroolParser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(DroolParser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(DroolParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(DroolParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(DroolParser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(DroolParser.BracedInitListContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(DroolParser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(DroolParser.ClassSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(DroolParser.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(DroolParser.MemberSpecificationContext ctx);
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
	 * Enter a parse tree produced by {@link DroolParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(DroolParser.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(DroolParser.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(DroolParser.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(DroolParser.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(DroolParser.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(DroolParser.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(DroolParser.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(DroolParser.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroolParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(DroolParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroolParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(DroolParser.MeminitializeridContext ctx);
}