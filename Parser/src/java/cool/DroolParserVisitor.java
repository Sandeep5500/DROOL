// Generated from DroolParser.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DroolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DroolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DroolParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(DroolParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(DroolParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(DroolParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DroolParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DroolParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(DroolParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#countExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountExpression(DroolParser.CountExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#addrcExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddrcExpression(DroolParser.AddrcExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#questionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionExpression(DroolParser.QuestionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DroolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DroolParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DroolParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(DroolParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DroolParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(DroolParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DroolParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DroolParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(DroolParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(DroolParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(DroolParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(DroolParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DroolParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DroolParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(DroolParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DroolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(DroolParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DroolParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(DroolParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(DroolParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(DroolParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DroolParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(DroolParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(DroolParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(DroolParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(DroolParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DroolParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(DroolParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(DroolParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DroolParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(DroolParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(DroolParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(DroolParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(DroolParser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(DroolParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(DroolParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DroolParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(DroolParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(DroolParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(DroolParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(DroolParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(DroolParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(DroolParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(DroolParser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(DroolParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(DroolParser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(DroolParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(DroolParser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(DroolParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(DroolParser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(DroolParser.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(DroolParser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(DroolParser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(DroolParser.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(DroolParser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(DroolParser.MeminitializeridContext ctx);
}