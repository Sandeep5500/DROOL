// Generated from DroolParser.g4 by ANTLR 4.8

	import java.util.List;

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
	 * Visit a parse tree produced by {@link DroolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DroolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(DroolParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(DroolParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(DroolParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(DroolParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#unaryOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpr(DroolParser.UnaryOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#addrcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddrcExpr(DroolParser.AddrcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#multiplicationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(DroolParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(DroolParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(DroolParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(DroolParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#binAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinAndExpr(DroolParser.BinAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#binXorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinXorExpr(DroolParser.BinXorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#binOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOrExpr(DroolParser.BinOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(DroolParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(DroolParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(DroolParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#assignOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOpr(DroolParser.AssignOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(DroolParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#pushpullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushpullExpr(DroolParser.PushpullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#pushpullOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushpullOpr(DroolParser.PushpullOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#graphMemberArrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphMemberArrayInit(DroolParser.GraphMemberArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DroolParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#constexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstexpr(DroolParser.ConstexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(DroolParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(DroolParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DroolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(DroolParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(DroolParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(DroolParser.ExprStatementContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(DroolParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DroolParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#iterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterStatement(DroolParser.IterStatementContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#declarseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarseq(DroolParser.DeclarseqContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#initDeclaratorSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorSeq(DroolParser.InitDeclaratorSeqContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DroolParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parameterDeclarationSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationSeq(DroolParser.ParameterDeclarationSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DroolParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#functionDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefn(DroolParser.FunctionDefnContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#initializationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationClause(DroolParser.InitializationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#bracedInitSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitSeq(DroolParser.BracedInitSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#initializationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationseq(DroolParser.InitializationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(DroolParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#classDefn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefn(DroolParser.ClassDefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(DroolParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#memberlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberlist(DroolParser.MemberlistContext ctx);
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
	 * Visit a parse tree produced by {@link DroolParser#inheritanceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceClause(DroolParser.InheritanceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroolParser#inheriterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheriterList(DroolParser.InheriterListContext ctx);
}