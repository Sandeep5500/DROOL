// Generated from DroolParser.g4 by ANTLR 4.8

	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DroolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, Literal=2, LeftParen=3, RightParen=4, LeftBrace=5, RightBrace=6, 
		LeftBracket=7, RightBracket=8, Or=9, Star=10, And=11, Plus=12, Minus=13, 
		Tildae=14, Not=15, Div=16, Mod=17, Less=18, Greater=19, LessEqual=20, 
		GreaterEqual=21, Equal=22, NotEqual=23, Caret=24, AndAnd=25, OrOr=26, 
		Assign=27, StarAssign=28, DivAssign=29, ModAssign=30, PlusAssign=31, MinusAssign=32, 
		AndAssign=33, XorAssign=34, OrAssign=35, PlusPlus=36, MinusMinus=37, Dot=38, 
		Arrow=39, Sizeof=40, Hashtag=41, Addc=42, Addr=43, Delr=44, Delc=45, Questionmark=46, 
		Inv=47, Trans=48, Det=49, Vsizeof=50, Esizeof=51, Val=52, RightShift=53, 
		LeftShift=54, If=55, Else=56, Switch=57, While=58, For=59, Case=60, Default=61, 
		Comma=62, Colon=63, Semi=64, SingleQuote=65, DoubleQuote=66, Class=67, 
		Void=68, Bool=69, Int=70, Float=71, String=72, Graph=73, Edge=74, Matrix=75, 
		Vertex=76, Long=77, Unsigned=78, Delete=79, Continue=80, Break=81, Return=82, 
		Input=83, Output=84, Const=85, False_=86, True_=87, Identifier=88, IntegerLiteral=89, 
		DecimalLiteral=90, Integersuffix=91, FloatingLiteral=92, StringLiteral=93, 
		BooleanLiteral=94, VertexLiteral=95, Newline=96, WHITESPACE=97, ESC=98, 
		UNTERM_STR=99, NULL_STR=100, ESC_NULL_STR=101, EOF_BCKSLSH_STR=102, EOF_STR=103, 
		EOF_COMMENT_0=104, OPEN_COMMENT=105, SINGLE_LINE_COMMENT=106, MULTI_LINE_COMMENT=107, 
		EOF_COMMENT_1=108, EOF_COMMENT_2=109, IN_NEST_MLC_0=110, CLOSE_MLC_0=111, 
		CONTENT_MLC_0=112, EOF_COMMENT_3=113, EOF_COMMENT_4=114, EOF_COMMENT_5=115, 
		IN_NEST_MLC_1=116, CLOSE_MLC_1=117, CONTENT_MLC_1=118, OTHER=119;
	public static final int
		RULE_program = 0, RULE_primaryExpression = 1, RULE_postfixExpression = 2, 
		RULE_expressionList = 3, RULE_unaryExpression = 4, RULE_unaryOperator = 5, 
		RULE_countExpression = 6, RULE_addrcExpression = 7, RULE_questionExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_shiftOperator = 12, RULE_relationalExpression = 13, RULE_equalityExpression = 14, 
		RULE_andExpression = 15, RULE_exclusiveOrExpression = 16, RULE_inclusiveOrExpression = 17, 
		RULE_logicalAndExpression = 18, RULE_logicalOrExpression = 19, RULE_assignmentExpression = 20, 
		RULE_assignmentOperator = 21, RULE_expression = 22, RULE_constantExpression = 23, 
		RULE_statement = 24, RULE_inputStatement = 25, RULE_outputStatement = 26, 
		RULE_jumpStatement = 27, RULE_caseStatement = 28, RULE_expressionStatement = 29, 
		RULE_compoundStatement = 30, RULE_statementSeq = 31, RULE_selectionStatement = 32, 
		RULE_condition = 33, RULE_iterationStatement = 34, RULE_forInitStatement = 35, 
		RULE_declarationStatement = 36, RULE_declarationseq = 37, RULE_declaration = 38, 
		RULE_blockDeclaration = 39, RULE_simpleDeclaration = 40, RULE_dataType = 41, 
		RULE_initDeclaratorList = 42, RULE_initDeclarator = 43, RULE_declarator = 44, 
		RULE_parametersAndQualifiers = 45, RULE_parameterDeclarationClause = 46, 
		RULE_parameterDeclarationList = 47, RULE_parameterDeclaration = 48, RULE_functionDefinition = 49, 
		RULE_functionBody = 50, RULE_initializer = 51, RULE_braceOrEqualInitializer = 52, 
		RULE_initializerClause = 53, RULE_initializerList = 54, RULE_bracedInitList = 55, 
		RULE_className = 56, RULE_classSpecifier = 57, RULE_classHead = 58, RULE_memberSpecification = 59, 
		RULE_memberdeclaration = 60, RULE_memberDeclaratorList = 61, RULE_memberDeclarator = 62, 
		RULE_baseClause = 63, RULE_baseSpecifierList = 64, RULE_memInitializerList = 65, 
		RULE_memInitializer = 66, RULE_meminitializerid = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "primaryExpression", "postfixExpression", "expressionList", 
			"unaryExpression", "unaryOperator", "countExpression", "addrcExpression", 
			"questionExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "statement", "inputStatement", "outputStatement", 
			"jumpStatement", "caseStatement", "expressionStatement", "compoundStatement", 
			"statementSeq", "selectionStatement", "condition", "iterationStatement", 
			"forInitStatement", "declarationStatement", "declarationseq", "declaration", 
			"blockDeclaration", "simpleDeclaration", "dataType", "initDeclaratorList", 
			"initDeclarator", "declarator", "parametersAndQualifiers", "parameterDeclarationClause", 
			"parameterDeclarationList", "parameterDeclaration", "functionDefinition", 
			"functionBody", "initializer", "braceOrEqualInitializer", "initializerClause", 
			"initializerList", "bracedInitList", "className", "classSpecifier", "classHead", 
			"memberSpecification", "memberdeclaration", "memberDeclaratorList", "memberDeclarator", 
			"baseClause", "baseSpecifierList", "memInitializerList", "memInitializer", 
			"meminitializerid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'|'", "'*'", 
			"'&'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'^'", "'&&'", "'||'", "'='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'++'", "'--'", "'.'", 
			"'->'", null, "'#'", null, null, null, null, "'?'", null, null, null, 
			null, null, null, "'>>'", "'<<'", null, null, null, null, null, null, 
			null, "','", "':'", "';'", "'''", "'\"'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "Literal", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"LeftBracket", "RightBracket", "Or", "Star", "And", "Plus", "Minus", 
			"Tildae", "Not", "Div", "Mod", "Less", "Greater", "LessEqual", "GreaterEqual", 
			"Equal", "NotEqual", "Caret", "AndAnd", "OrOr", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "AndAssign", "XorAssign", 
			"OrAssign", "PlusPlus", "MinusMinus", "Dot", "Arrow", "Sizeof", "Hashtag", 
			"Addc", "Addr", "Delr", "Delc", "Questionmark", "Inv", "Trans", "Det", 
			"Vsizeof", "Esizeof", "Val", "RightShift", "LeftShift", "If", "Else", 
			"Switch", "While", "For", "Case", "Default", "Comma", "Colon", "Semi", 
			"SingleQuote", "DoubleQuote", "Class", "Void", "Bool", "Int", "Float", 
			"String", "Graph", "Edge", "Matrix", "Vertex", "Long", "Unsigned", "Delete", 
			"Continue", "Break", "Return", "Input", "Output", "Const", "False_", 
			"True_", "Identifier", "IntegerLiteral", "DecimalLiteral", "Integersuffix", 
			"FloatingLiteral", "StringLiteral", "BooleanLiteral", "VertexLiteral", 
			"Newline", "WHITESPACE", "ESC", "UNTERM_STR", "NULL_STR", "ESC_NULL_STR", 
			"EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", "OPEN_COMMENT", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "EOF_COMMENT_1", "EOF_COMMENT_2", "IN_NEST_MLC_0", 
			"CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", "EOF_COMMENT_4", "EOF_COMMENT_5", 
			"IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DroolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		String filename;
		public void setFilename(String f){
			filename = f;
		}

	/*
		DO NOT EDIT THE FILE ABOVE THIS LINE
		Add member functions, variables below.
	*/


	public DroolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DroolParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Class - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(136);
				declarationseq();
				}
			}

			setState(139);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(DroolParser.Literal, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(DroolParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(DroolParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(DroolParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(DroolParser.RightBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Literal);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(LeftParen);
				setState(143);
				expression();
				setState(144);
				match(RightParen);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(Identifier);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(147);
					match(LeftBracket);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
						{
						setState(148);
						constantExpression();
						}
					}

					setState(151);
					match(RightBracket);
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(152);
						match(LeftBracket);
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
							{
							setState(153);
							constantExpression();
							}
						}

						setState(156);
						match(RightBracket);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(DroolParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(DroolParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(DroolParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(DroolParser.MinusMinus, 0); }
		public TerminalNode Delr() { return getToken(DroolParser.Delr, 0); }
		public TerminalNode Delc() { return getToken(DroolParser.Delc, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(167);
						match(LeftParen);
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
							{
							setState(168);
							expressionList();
							}
						}

						setState(171);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173);
						_la = _input.LA(1);
						if ( !(_la==Dot || _la==Arrow) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						match(Identifier);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(175);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(176);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PlusPlus) | (1L << MinusMinus) | (1L << Delr) | (1L << Delc))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(DroolParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(DroolParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Sizeof() { return getToken(DroolParser.Sizeof, 0); }
		public TerminalNode Esizeof() { return getToken(DroolParser.Esizeof, 0); }
		public TerminalNode Vsizeof() { return getToken(DroolParser.Vsizeof, 0); }
		public TerminalNode Val() { return getToken(DroolParser.Val, 0); }
		public TerminalNode Inv() { return getToken(DroolParser.Inv, 0); }
		public TerminalNode Det() { return getToken(DroolParser.Det, 0); }
		public TerminalNode Trans() { return getToken(DroolParser.Trans, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
			case LeftParen:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				postfixExpression(0);
				}
				break;
			case Or:
			case Star:
			case And:
			case Plus:
			case Minus:
			case Tildae:
			case Not:
			case PlusPlus:
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(185);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(186);
					match(MinusMinus);
					}
					break;
				case Or:
				case Star:
				case And:
				case Plus:
				case Minus:
				case Tildae:
				case Not:
					{
					setState(187);
					unaryOperator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190);
				unaryExpression();
				}
				break;
			case Sizeof:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(LeftParen);
				setState(193);
				match(Identifier);
				setState(194);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(DroolParser.Or, 0); }
		public TerminalNode Star() { return getToken(DroolParser.Star, 0); }
		public TerminalNode And() { return getToken(DroolParser.And, 0); }
		public TerminalNode Plus() { return getToken(DroolParser.Plus, 0); }
		public TerminalNode Tildae() { return getToken(DroolParser.Tildae, 0); }
		public TerminalNode Minus() { return getToken(DroolParser.Minus, 0); }
		public TerminalNode Not() { return getToken(DroolParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public TerminalNode Hashtag() { return getToken(DroolParser.Hashtag, 0); }
		public CountExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterCountExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitCountExpression(this);
		}
	}

	public final CountExpressionContext countExpression() throws RecognitionException {
		CountExpressionContext _localctx = new CountExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_countExpression);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
			case LeftParen:
			case Or:
			case Star:
			case And:
			case Plus:
			case Minus:
			case Tildae:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Sizeof:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				unaryExpression();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(200);
					match(Hashtag);
					setState(201);
					unaryExpression();
					}
					break;
				}
				}
				break;
			case Hashtag:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(Hashtag);
				setState(205);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrcExpressionContext extends ParserRuleContext {
		public List<CountExpressionContext> countExpression() {
			return getRuleContexts(CountExpressionContext.class);
		}
		public CountExpressionContext countExpression(int i) {
			return getRuleContext(CountExpressionContext.class,i);
		}
		public TerminalNode Addc() { return getToken(DroolParser.Addc, 0); }
		public TerminalNode Addr() { return getToken(DroolParser.Addr, 0); }
		public AddrcExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrcExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterAddrcExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitAddrcExpression(this);
		}
	}

	public final AddrcExpressionContext addrcExpression() throws RecognitionException {
		AddrcExpressionContext _localctx = new AddrcExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addrcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			countExpression();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Addc || _la==Addr) {
				{
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==Addc || _la==Addr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				countExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuestionExpressionContext extends ParserRuleContext {
		public List<AddrcExpressionContext> addrcExpression() {
			return getRuleContexts(AddrcExpressionContext.class);
		}
		public AddrcExpressionContext addrcExpression(int i) {
			return getRuleContext(AddrcExpressionContext.class,i);
		}
		public TerminalNode Questionmark() { return getToken(DroolParser.Questionmark, 0); }
		public QuestionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterQuestionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitQuestionExpression(this);
		}
	}

	public final QuestionExpressionContext questionExpression() throws RecognitionException {
		QuestionExpressionContext _localctx = new QuestionExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			addrcExpression();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Questionmark) {
				{
				setState(214);
				match(Questionmark);
				setState(215);
				addrcExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<QuestionExpressionContext> questionExpression() {
			return getRuleContexts(QuestionExpressionContext.class);
		}
		public QuestionExpressionContext questionExpression(int i) {
			return getRuleContext(QuestionExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(DroolParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(DroolParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(DroolParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(DroolParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(DroolParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(DroolParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			questionExpression();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(220);
					questionExpression();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(DroolParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(DroolParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(DroolParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(DroolParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			multiplicativeExpression();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(228);
					multiplicativeExpression();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			additiveExpression();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RightShift || _la==LeftShift) {
				{
				{
				setState(235);
				shiftOperator();
				setState(236);
				additiveExpression();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(DroolParser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(DroolParser.LeftShift, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitShiftOperator(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==RightShift || _la==LeftShift) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(DroolParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(DroolParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(DroolParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(DroolParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(DroolParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(DroolParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(DroolParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(DroolParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			shiftExpression();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(246);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				shiftExpression();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(DroolParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(DroolParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(DroolParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(DroolParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			relationalExpression();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				relationalExpression();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(DroolParser.And); }
		public TerminalNode And(int i) {
			return getToken(DroolParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			equalityExpression();
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					match(And);
					setState(263);
					equalityExpression();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(DroolParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(DroolParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			andExpression();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(270);
				match(Caret);
				setState(271);
				andExpression();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(DroolParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(DroolParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			exclusiveOrExpression();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(Or);
					setState(279);
					exclusiveOrExpression();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(DroolParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(DroolParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			inclusiveOrExpression();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(286);
				match(AndAnd);
				setState(287);
				inclusiveOrExpression();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(DroolParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(DroolParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			logicalAndExpression();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(294);
				match(OrOr);
				setState(295);
				logicalAndExpression();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				logicalOrExpression();
				setState(303);
				assignmentOperator();
				setState(304);
				initializerClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(DroolParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(DroolParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(DroolParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(DroolParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(DroolParser.MinusAssign, 0); }
		public TerminalNode AndAssign() { return getToken(DroolParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(DroolParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(DroolParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << AndAssign) | (1L << XorAssign) | (1L << OrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			assignmentExpression();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(311);
				match(Comma);
				setState(312);
				assignmentExpression();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				caseStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				declarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				jumpStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(327);
				inputStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(328);
				outputStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode Input() { return getToken(DroolParser.Input, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInputStatement(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(Input);
			setState(332);
			match(LeftParen);
			setState(333);
			expressionList();
			setState(334);
			match(RightParen);
			setState(335);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode Output() { return getToken(DroolParser.Output, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitOutputStatement(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Output);
			setState(338);
			match(LeftParen);
			setState(339);
			expressionList();
			setState(340);
			match(RightParen);
			setState(341);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public TerminalNode Break() { return getToken(DroolParser.Break, 0); }
		public TerminalNode Continue() { return getToken(DroolParser.Continue, 0); }
		public TerminalNode Return() { return getToken(DroolParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(343);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(344);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(345);
				match(Return);
				setState(348);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Literal:
				case LeftParen:
				case Or:
				case Star:
				case And:
				case Plus:
				case Minus:
				case Tildae:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Sizeof:
				case Hashtag:
				case Inv:
				case Trans:
				case Det:
				case Vsizeof:
				case Esizeof:
				case Val:
				case Identifier:
					{
					setState(346);
					expression();
					}
					break;
				case LeftBrace:
					{
					setState(347);
					bracedInitList();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(352);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(DroolParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(DroolParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(DroolParser.Default, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				{
				setState(354);
				match(Case);
				setState(355);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(356);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			match(Colon);
			setState(360);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(362);
				expression();
				}
			}

			setState(365);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LeftBrace);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Continue - 64)) | (1L << (Break - 64)) | (1L << (Return - 64)) | (1L << (Input - 64)) | (1L << (Output - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(368);
				statementSeq();
				}
			}

			setState(371);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitStatementSeq(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(373);
				statement();
				}
				}
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Continue - 64)) | (1L << (Break - 64)) | (1L << (Return - 64)) | (1L << (Input - 64)) | (1L << (Output - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(DroolParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(DroolParser.Else, 0); }
		public TerminalNode Switch() { return getToken(DroolParser.Switch, 0); }
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectionStatement);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(If);
				setState(379);
				match(LeftParen);
				setState(380);
				condition();
				setState(381);
				match(RightParen);
				setState(382);
				statement();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(383);
					match(Else);
					setState(384);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(Switch);
				setState(388);
				match(LeftParen);
				setState(389);
				condition();
				setState(390);
				match(RightParen);
				setState(391);
				match(LeftBrace);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(392);
					caseStatement();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				declarator();
				setState(407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(404);
					match(Assign);
					setState(405);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(406);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(DroolParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(DroolParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iterationStatement);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(While);
				setState(412);
				match(LeftParen);
				setState(413);
				condition();
				setState(414);
				match(RightParen);
				setState(415);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(For);
				setState(418);
				match(LeftParen);
				{
				setState(419);
				forInitStatement();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(420);
					condition();
					}
				}

				setState(423);
				match(Semi);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(424);
					expression();
					}
				}

				}
				setState(427);
				match(RightParen);
				setState(428);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitForInitStatement(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forInitStatement);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				simpleDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438);
				declaration();
				}
				}
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Class - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declaration);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				classSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitBlockDeclaration(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			simpleDeclaration();
			setState(449);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitSimpleDeclaration(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(451);
				initDeclaratorList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(DroolParser.Bool, 0); }
		public TerminalNode Int() { return getToken(DroolParser.Int, 0); }
		public TerminalNode Float() { return getToken(DroolParser.Float, 0); }
		public TerminalNode Void() { return getToken(DroolParser.Void, 0); }
		public TerminalNode String() { return getToken(DroolParser.String, 0); }
		public TerminalNode Graph() { return getToken(DroolParser.Graph, 0); }
		public TerminalNode Edge() { return getToken(DroolParser.Edge, 0); }
		public TerminalNode Matrix() { return getToken(DroolParser.Matrix, 0); }
		public TerminalNode Vertex() { return getToken(DroolParser.Vertex, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataType);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(Float);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				match(Void);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				match(String);
				}
				break;
			case Graph:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				match(Graph);
				}
				break;
			case Edge:
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(Edge);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 8);
				{
				setState(461);
				match(Matrix);
				}
				break;
			case Vertex:
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
				match(Vertex);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(463);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			dataType();
			setState(467);
			initDeclarator();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(468);
				match(Comma);
				setState(469);
				initDeclarator();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_initDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			declarator();
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(476);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(DroolParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(DroolParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(DroolParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(DroolParser.RightBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Identifier);
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(480);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(481);
				match(LeftBracket);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(482);
					constantExpression();
					}
				}

				setState(485);
				match(RightBracket);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(486);
					match(LeftBracket);
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
						{
						setState(487);
						constantExpression();
						}
					}

					setState(490);
					match(RightBracket);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitParametersAndQualifiers(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parametersAndQualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(LeftParen);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(496);
				parameterDeclarationClause();
				}
				break;
			}
			setState(499);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitParameterDeclarationClause(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterDeclarationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			parameterDeclarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitParameterDeclarationList(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			parameterDeclaration();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(504);
				match(Comma);
				setState(505);
				parameterDeclaration();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(511);
				dataType();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(512);
					declarator();
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Assign))) != 0)) {
						{
						setState(513);
						initializer();
						}
					}

					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			dataType();
			setState(521);
			match(Identifier);
			setState(522);
			match(LeftParen);
			setState(523);
			parameterDeclarationClause();
			setState(524);
			match(RightParen);
			setState(525);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public TerminalNode Default() { return getToken(DroolParser.Default, 0); }
		public TerminalNode Delete() { return getToken(DroolParser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionBody);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				compoundStatement();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(Assign);
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializer);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(LeftParen);
				setState(535);
				expressionList();
				setState(536);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitBraceOrEqualInitializer(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_braceOrEqualInitializer);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(Assign);
				setState(541);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerClauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInitializerClause(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initializerClause);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
			case LeftParen:
			case Or:
			case Star:
			case And:
			case Plus:
			case Minus:
			case Tildae:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Sizeof:
			case Hashtag:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			initializerClause();
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					match(Comma);
					setState(551);
					initializerClause();
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DroolParser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitBracedInitList(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LeftBrace);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(558);
				initializerList();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(559);
					match(Comma);
					}
				}

				}
			}

			setState(564);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitClassSpecifier(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			classHead();
			setState(569);
			match(LeftBrace);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(570);
				memberSpecification();
				}
			}

			setState(573);
			match(RightBrace);
			setState(574);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(DroolParser.Class, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public BaseClauseContext baseClause() {
			return getRuleContext(BaseClauseContext.class,0);
		}
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitClassHead(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_classHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(Class);
			setState(577);
			className();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(578);
				baseClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberSpecificationContext extends ParserRuleContext {
		public List<MemberdeclarationContext> memberdeclaration() {
			return getRuleContexts(MemberdeclarationContext.class);
		}
		public MemberdeclarationContext memberdeclaration(int i) {
			return getRuleContext(MemberdeclarationContext.class,i);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemberSpecification(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(581);
				memberdeclaration();
				}
				}
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_memberdeclaration);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(586);
					memberDeclaratorList();
					}
				}

				setState(589);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemberDeclaratorList(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			dataType();
			setState(594);
			memberDeclarator();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(595);
				match(Comma);
				setState(596);
				memberDeclarator();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemberDeclarator(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_memberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			initDeclarator();
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrace || _la==Assign) {
					{
					setState(604);
					braceOrEqualInitializer();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseClauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(DroolParser.Colon, 0); }
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitBaseClause(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Colon);
			setState(610);
			baseSpecifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseSpecifierListContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitBaseSpecifierList(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			className();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(613);
				match(Comma);
				setState(614);
				className();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemInitializerListContext extends ParserRuleContext {
		public List<MemInitializerContext> memInitializer() {
			return getRuleContexts(MemInitializerContext.class);
		}
		public MemInitializerContext memInitializer(int i) {
			return getRuleContext(MemInitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemInitializerList(this);
		}
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			memInitializer();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(621);
				match(Comma);
				setState(622);
				memInitializer();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemInitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMemInitializer(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			meminitializerid();
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(629);
				match(LeftParen);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(630);
					expressionList();
					}
				}

				setState(633);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(634);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroolParserListener ) ((DroolParserListener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_meminitializerid);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u0284\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\5\2\u008c\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0098\n\3\3\3\3\3\3\3\5\3\u009d"+
		"\n\3\3\3\5\3\u00a0\n\3\5\3\u00a2\n\3\5\3\u00a4\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00ac\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00b4\n\4\f\4\16\4\u00b7"+
		"\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c6"+
		"\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00cd\n\b\3\b\3\b\5\b\u00d1\n\b\3\t\3\t\3"+
		"\t\5\t\u00d6\n\t\3\n\3\n\3\n\5\n\u00db\n\n\3\13\3\13\3\13\7\13\u00e0\n"+
		"\13\f\13\16\13\u00e3\13\13\3\f\3\f\3\f\7\f\u00e8\n\f\f\f\16\f\u00eb\13"+
		"\f\3\r\3\r\3\r\3\r\7\r\u00f1\n\r\f\r\16\r\u00f4\13\r\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00fb\n\17\f\17\16\17\u00fe\13\17\3\20\3\20\3\20\7\20\u0103"+
		"\n\20\f\20\16\20\u0106\13\20\3\21\3\21\3\21\7\21\u010b\n\21\f\21\16\21"+
		"\u010e\13\21\3\22\3\22\3\22\7\22\u0113\n\22\f\22\16\22\u0116\13\22\3\23"+
		"\3\23\3\23\7\23\u011b\n\23\f\23\16\23\u011e\13\23\3\24\3\24\3\24\7\24"+
		"\u0123\n\24\f\24\16\24\u0126\13\24\3\25\3\25\3\25\7\25\u012b\n\25\f\25"+
		"\16\25\u012e\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u0135\n\26\3\27\3\27"+
		"\3\30\3\30\3\30\7\30\u013c\n\30\f\30\16\30\u013f\13\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014c\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u015f\n\35\5\35\u0161\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0168\n"+
		"\36\3\36\3\36\3\36\3\37\5\37\u016e\n\37\3\37\3\37\3 \3 \5 \u0174\n \3"+
		" \3 \3!\6!\u0179\n!\r!\16!\u017a\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0184"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u018c\n\"\f\"\16\"\u018f\13\"\3\"\3\""+
		"\5\"\u0193\n\"\3#\3#\3#\3#\3#\5#\u019a\n#\5#\u019c\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u01a8\n$\3$\3$\5$\u01ac\n$\3$\3$\3$\5$\u01b1\n$\3%\3"+
		"%\5%\u01b5\n%\3&\3&\3\'\6\'\u01ba\n\'\r\'\16\'\u01bb\3(\3(\3(\5(\u01c1"+
		"\n(\3)\3)\3)\3*\5*\u01c7\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d3\n+"+
		"\3,\3,\3,\3,\7,\u01d9\n,\f,\16,\u01dc\13,\3-\3-\5-\u01e0\n-\3.\3.\3.\3"+
		".\5.\u01e6\n.\3.\3.\3.\5.\u01eb\n.\3.\5.\u01ee\n.\5.\u01f0\n.\3/\3/\5"+
		"/\u01f4\n/\3/\3/\3\60\3\60\3\61\3\61\3\61\7\61\u01fd\n\61\f\61\16\61\u0200"+
		"\13\61\3\62\3\62\3\62\5\62\u0205\n\62\5\62\u0207\n\62\5\62\u0209\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0216\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u021d\n\65\3\66\3\66\3\66\5\66\u0222\n"+
		"\66\3\67\3\67\5\67\u0226\n\67\38\38\38\78\u022b\n8\f8\168\u022e\138\3"+
		"9\39\39\59\u0233\n9\59\u0235\n9\39\39\3:\3:\3;\3;\3;\5;\u023e\n;\3;\3"+
		";\3;\3<\3<\3<\5<\u0246\n<\3=\6=\u0249\n=\r=\16=\u024a\3>\5>\u024e\n>\3"+
		">\3>\5>\u0252\n>\3?\3?\3?\3?\7?\u0258\n?\f?\16?\u025b\13?\3@\3@\3@\5@"+
		"\u0260\n@\5@\u0262\n@\3A\3A\3A\3B\3B\3B\7B\u026a\nB\fB\16B\u026d\13B\3"+
		"C\3C\3C\7C\u0272\nC\fC\16C\u0275\13C\3D\3D\3D\5D\u027a\nD\3D\3D\5D\u027e"+
		"\nD\3E\3E\5E\u0282\nE\3E\2\3\6F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\2\16\3\2()\4\2&\'./\4\2**\61\66\3\2\13\21\3\2,-\4\2"+
		"\f\f\22\23\3\2\16\17\3\2\678\3\2\24\27\3\2\30\31\3\2\35%\4\2??QQ\2\u02a4"+
		"\2\u008b\3\2\2\2\4\u00a3\3\2\2\2\6\u00a5\3\2\2\2\b\u00b8\3\2\2\2\n\u00c5"+
		"\3\2\2\2\f\u00c7\3\2\2\2\16\u00d0\3\2\2\2\20\u00d2\3\2\2\2\22\u00d7\3"+
		"\2\2\2\24\u00dc\3\2\2\2\26\u00e4\3\2\2\2\30\u00ec\3\2\2\2\32\u00f5\3\2"+
		"\2\2\34\u00f7\3\2\2\2\36\u00ff\3\2\2\2 \u0107\3\2\2\2\"\u010f\3\2\2\2"+
		"$\u0117\3\2\2\2&\u011f\3\2\2\2(\u0127\3\2\2\2*\u0134\3\2\2\2,\u0136\3"+
		"\2\2\2.\u0138\3\2\2\2\60\u0140\3\2\2\2\62\u014b\3\2\2\2\64\u014d\3\2\2"+
		"\2\66\u0153\3\2\2\28\u0160\3\2\2\2:\u0167\3\2\2\2<\u016d\3\2\2\2>\u0171"+
		"\3\2\2\2@\u0178\3\2\2\2B\u0192\3\2\2\2D\u019b\3\2\2\2F\u01b0\3\2\2\2H"+
		"\u01b4\3\2\2\2J\u01b6\3\2\2\2L\u01b9\3\2\2\2N\u01c0\3\2\2\2P\u01c2\3\2"+
		"\2\2R\u01c6\3\2\2\2T\u01d2\3\2\2\2V\u01d4\3\2\2\2X\u01dd\3\2\2\2Z\u01e1"+
		"\3\2\2\2\\\u01f1\3\2\2\2^\u01f7\3\2\2\2`\u01f9\3\2\2\2b\u0208\3\2\2\2"+
		"d\u020a\3\2\2\2f\u0215\3\2\2\2h\u021c\3\2\2\2j\u0221\3\2\2\2l\u0225\3"+
		"\2\2\2n\u0227\3\2\2\2p\u022f\3\2\2\2r\u0238\3\2\2\2t\u023a\3\2\2\2v\u0242"+
		"\3\2\2\2x\u0248\3\2\2\2z\u0251\3\2\2\2|\u0253\3\2\2\2~\u025c\3\2\2\2\u0080"+
		"\u0263\3\2\2\2\u0082\u0266\3\2\2\2\u0084\u026e\3\2\2\2\u0086\u0276\3\2"+
		"\2\2\u0088\u0281\3\2\2\2\u008a\u008c\5L\'\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\2\2\3\u008e\3\3\2\2\2"+
		"\u008f\u00a4\7\4\2\2\u0090\u0091\7\5\2\2\u0091\u0092\5.\30\2\u0092\u0093"+
		"\7\6\2\2\u0093\u00a4\3\2\2\2\u0094\u00a1\7Z\2\2\u0095\u0097\7\t\2\2\u0096"+
		"\u0098\5\60\31\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009f\7\n\2\2\u009a\u009c\7\t\2\2\u009b\u009d\5\60\31\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\n"+
		"\2\2\u009f\u009a\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0095\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u008f\3\2"+
		"\2\2\u00a3\u0090\3\2\2\2\u00a3\u0094\3\2\2\2\u00a4\5\3\2\2\2\u00a5\u00a6"+
		"\b\4\1\2\u00a6\u00a7\5\4\3\2\u00a7\u00b5\3\2\2\2\u00a8\u00a9\f\5\2\2\u00a9"+
		"\u00ab\7\5\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\7\6\2\2\u00ae\u00af\f\4\2\2\u00af"+
		"\u00b0\t\2\2\2\u00b0\u00b4\7Z\2\2\u00b1\u00b2\f\3\2\2\u00b2\u00b4\t\3"+
		"\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\7\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5n8\2\u00b9\t\3\2\2\2\u00ba\u00c6\5\6"+
		"\4\2\u00bb\u00bf\7&\2\2\u00bc\u00bf\7\'\2\2\u00bd\u00bf\5\f\7\2\u00be"+
		"\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c6\5\n\6\2\u00c1\u00c2\t\4\2\2\u00c2\u00c3\7\5\2\2\u00c3"+
		"\u00c4\7Z\2\2\u00c4\u00c6\7\6\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00be\3\2"+
		"\2\2\u00c5\u00c1\3\2\2\2\u00c6\13\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8\r"+
		"\3\2\2\2\u00c9\u00cc\5\n\6\2\u00ca\u00cb\7+\2\2\u00cb\u00cd\5\n\6\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7+"+
		"\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00c9\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\17\3\2\2\2\u00d2\u00d5\5\16\b\2\u00d3\u00d4\t\6\2\2\u00d4\u00d6\5\16"+
		"\b\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00da"+
		"\5\20\t\2\u00d8\u00d9\7\60\2\2\u00d9\u00db\5\20\t\2\u00da\u00d8\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00e1\5\22\n\2\u00dd\u00de"+
		"\t\7\2\2\u00de\u00e0\5\22\n\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e9\5\24\13\2\u00e5\u00e6\t\b\2\2\u00e6\u00e8\5\24\13"+
		"\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f2\5\26\f\2\u00ed"+
		"\u00ee\5\32\16\2\u00ee\u00ef\5\26\f\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\31\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6\33\3\2\2\2\u00f7"+
		"\u00fc\5\30\r\2\u00f8\u00f9\t\n\2\2\u00f9\u00fb\5\30\r\2\u00fa\u00f8\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\35\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0104\5\34\17\2\u0100\u0101\t\13"+
		"\2\2\u0101\u0103\5\34\17\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\37\3\2\2\2\u0106\u0104\3\2\2"+
		"\2\u0107\u010c\5\36\20\2\u0108\u0109\7\r\2\2\u0109\u010b\5\36\20\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d!\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0114\5 \21\2\u0110\u0111"+
		"\7\32\2\2\u0111\u0113\5 \21\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115#\3\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0117\u011c\5\"\22\2\u0118\u0119\7\13\2\2\u0119\u011b\5\"\22\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d%\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0124\5$\23\2\u0120"+
		"\u0121\7\33\2\2\u0121\u0123\5$\23\2\u0122\u0120\3\2\2\2\u0123\u0126\3"+
		"\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\'\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u012c\5&\24\2\u0128\u0129\7\34\2\2\u0129\u012b\5&\24\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d)\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0135\5(\25\2\u0130"+
		"\u0131\5(\25\2\u0131\u0132\5,\27\2\u0132\u0133\5l\67\2\u0133\u0135\3\2"+
		"\2\2\u0134\u012f\3\2\2\2\u0134\u0130\3\2\2\2\u0135+\3\2\2\2\u0136\u0137"+
		"\t\f\2\2\u0137-\3\2\2\2\u0138\u013d\5*\26\2\u0139\u013a\7@\2\2\u013a\u013c"+
		"\5*\26\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e/\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5(\25\2"+
		"\u0141\61\3\2\2\2\u0142\u014c\5:\36\2\u0143\u014c\5<\37\2\u0144\u014c"+
		"\5> \2\u0145\u014c\5B\"\2\u0146\u014c\5F$\2\u0147\u014c\5J&\2\u0148\u014c"+
		"\58\35\2\u0149\u014c\5\64\33\2\u014a\u014c\5\66\34\2\u014b\u0142\3\2\2"+
		"\2\u014b\u0143\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146"+
		"\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\63\3\2\2\2\u014d\u014e\7U\2\2\u014e\u014f\7\5\2\2"+
		"\u014f\u0150\5\b\5\2\u0150\u0151\7\6\2\2\u0151\u0152\7B\2\2\u0152\65\3"+
		"\2\2\2\u0153\u0154\7V\2\2\u0154\u0155\7\5\2\2\u0155\u0156\5\b\5\2\u0156"+
		"\u0157\7\6\2\2\u0157\u0158\7B\2\2\u0158\67\3\2\2\2\u0159\u0161\7S\2\2"+
		"\u015a\u0161\7R\2\2\u015b\u015e\7T\2\2\u015c\u015f\5.\30\2\u015d\u015f"+
		"\5p9\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015b\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7B\2\2\u01639\3\2\2\2\u0164\u0165"+
		"\7>\2\2\u0165\u0168\5\60\31\2\u0166\u0168\7?\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7A\2\2\u016a\u016b\5\62"+
		"\32\2\u016b;\3\2\2\2\u016c\u016e\5.\30\2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7B\2\2\u0170=\3\2\2\2\u0171\u0173"+
		"\7\7\2\2\u0172\u0174\5@!\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7\b\2\2\u0176?\3\2\2\2\u0177\u0179\5\62\32"+
		"\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017bA\3\2\2\2\u017c\u017d\79\2\2\u017d\u017e\7\5\2\2\u017e\u017f"+
		"\5D#\2\u017f\u0180\7\6\2\2\u0180\u0183\5\62\32\2\u0181\u0182\7:\2\2\u0182"+
		"\u0184\5\62\32\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0193\3"+
		"\2\2\2\u0185\u0186\7;\2\2\u0186\u0187\7\5\2\2\u0187\u0188\5D#\2\u0188"+
		"\u0189\7\6\2\2\u0189\u018d\7\7\2\2\u018a\u018c\5:\36\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\b\2\2\u0191\u0193\3\2"+
		"\2\2\u0192\u017c\3\2\2\2\u0192\u0185\3\2\2\2\u0193C\3\2\2\2\u0194\u019c"+
		"\5.\30\2\u0195\u0199\5Z.\2\u0196\u0197\7\35\2\2\u0197\u019a\5l\67\2\u0198"+
		"\u019a\5p9\2\u0199\u0196\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019c\3\2\2"+
		"\2\u019b\u0194\3\2\2\2\u019b\u0195\3\2\2\2\u019cE\3\2\2\2\u019d\u019e"+
		"\7<\2\2\u019e\u019f\7\5\2\2\u019f\u01a0\5D#\2\u01a0\u01a1\7\6\2\2\u01a1"+
		"\u01a2\5\62\32\2\u01a2\u01b1\3\2\2\2\u01a3\u01a4\7=\2\2\u01a4\u01a5\7"+
		"\5\2\2\u01a5\u01a7\5H%\2\u01a6\u01a8\5D#\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\7B\2\2\u01aa\u01ac\5.\30\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\6"+
		"\2\2\u01ae\u01af\5\62\32\2\u01af\u01b1\3\2\2\2\u01b0\u019d\3\2\2\2\u01b0"+
		"\u01a3\3\2\2\2\u01b1G\3\2\2\2\u01b2\u01b5\5<\37\2\u01b3\u01b5\5R*\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5I\3\2\2\2\u01b6\u01b7\5P)\2\u01b7"+
		"K\3\2\2\2\u01b8\u01ba\5N(\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcM\3\2\2\2\u01bd\u01c1\5P)\2\u01be"+
		"\u01c1\5d\63\2\u01bf\u01c1\5t;\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c0\u01bf\3\2\2\2\u01c1O\3\2\2\2\u01c2\u01c3\5R*\2\u01c3\u01c4\7"+
		"B\2\2\u01c4Q\3\2\2\2\u01c5\u01c7\5V,\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7S\3\2\2\2\u01c8\u01d3\7G\2\2\u01c9\u01d3\7H\2\2\u01ca\u01d3"+
		"\7I\2\2\u01cb\u01d3\7F\2\2\u01cc\u01d3\7J\2\2\u01cd\u01d3\7K\2\2\u01ce"+
		"\u01d3\7L\2\2\u01cf\u01d3\7M\2\2\u01d0\u01d3\7N\2\2\u01d1\u01d3\5r:\2"+
		"\u01d2\u01c8\3\2\2\2\u01d2\u01c9\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cb"+
		"\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3U\3\2\2\2"+
		"\u01d4\u01d5\5T+\2\u01d5\u01da\5X-\2\u01d6\u01d7\7@\2\2\u01d7\u01d9\5"+
		"X-\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01dbW\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df\5Z.\2\u01de"+
		"\u01e0\5h\65\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0Y\3\2\2\2"+
		"\u01e1\u01ef\7Z\2\2\u01e2\u01f0\5\\/\2\u01e3\u01e5\7\t\2\2\u01e4\u01e6"+
		"\5\60\31\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2"+
		"\u01e7\u01ed\7\n\2\2\u01e8\u01ea\7\t\2\2\u01e9\u01eb\5\60\31\2\u01ea\u01e9"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\7\n\2\2\u01ed"+
		"\u01e8\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e2\3\2"+
		"\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0[\3\2\2\2\u01f1\u01f3"+
		"\7\5\2\2\u01f2\u01f4\5^\60\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\7\6\2\2\u01f6]\3\2\2\2\u01f7\u01f8\5`\61\2"+
		"\u01f8_\3\2\2\2\u01f9\u01fe\5b\62\2\u01fa\u01fb\7@\2\2\u01fb\u01fd\5b"+
		"\62\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ffa\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0206\5T+\2\u0202"+
		"\u0204\5Z.\2\u0203\u0205\5h\65\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2"+
		"\2\u0205\u0207\3\2\2\2\u0206\u0202\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209"+
		"\3\2\2\2\u0208\u0201\3\2\2\2\u0208\u0209\3\2\2\2\u0209c\3\2\2\2\u020a"+
		"\u020b\5T+\2\u020b\u020c\7Z\2\2\u020c\u020d\7\5\2\2\u020d\u020e\5^\60"+
		"\2\u020e\u020f\7\6\2\2\u020f\u0210\5f\64\2\u0210e\3\2\2\2\u0211\u0216"+
		"\5> \2\u0212\u0213\7\35\2\2\u0213\u0214\t\r\2\2\u0214\u0216\7B\2\2\u0215"+
		"\u0211\3\2\2\2\u0215\u0212\3\2\2\2\u0216g\3\2\2\2\u0217\u021d\5j\66\2"+
		"\u0218\u0219\7\5\2\2\u0219\u021a\5\b\5\2\u021a\u021b\7\6\2\2\u021b\u021d"+
		"\3\2\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2\u021di\3\2\2\2\u021e"+
		"\u021f\7\35\2\2\u021f\u0222\5l\67\2\u0220\u0222\5p9\2\u0221\u021e\3\2"+
		"\2\2\u0221\u0220\3\2\2\2\u0222k\3\2\2\2\u0223\u0226\5*\26\2\u0224\u0226"+
		"\5p9\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226m\3\2\2\2\u0227\u022c"+
		"\5l\67\2\u0228\u0229\7@\2\2\u0229\u022b\5l\67\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022do\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0234\7\7\2\2\u0230\u0232\5n8\2\u0231\u0233"+
		"\7@\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u0230\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7\b"+
		"\2\2\u0237q\3\2\2\2\u0238\u0239\7Z\2\2\u0239s\3\2\2\2\u023a\u023b\5v<"+
		"\2\u023b\u023d\7\7\2\2\u023c\u023e\5x=\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\b\2\2\u0240\u0241\7B\2\2\u0241"+
		"u\3\2\2\2\u0242\u0243\7E\2\2\u0243\u0245\5r:\2\u0244\u0246\5\u0080A\2"+
		"\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246w\3\2\2\2\u0247\u0249\5"+
		"z>\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024by\3\2\2\2\u024c\u024e\5|?\2\u024d\u024c\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\7B\2\2\u0250\u0252\5d\63"+
		"\2\u0251\u024d\3\2\2\2\u0251\u0250\3\2\2\2\u0252{\3\2\2\2\u0253\u0254"+
		"\5T+\2\u0254\u0259\5~@\2\u0255\u0256\7@\2\2\u0256\u0258\5~@\2\u0257\u0255"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"}\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0261\5X-\2\u025d\u0262\3\2\2\2\u025e"+
		"\u0260\5j\66\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2"+
		"\2\2\u0261\u025d\3\2\2\2\u0261\u025f\3\2\2\2\u0262\177\3\2\2\2\u0263\u0264"+
		"\7A\2\2\u0264\u0265\5\u0082B\2\u0265\u0081\3\2\2\2\u0266\u026b\5r:\2\u0267"+
		"\u0268\7@\2\2\u0268\u026a\5r:\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2"+
		"\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0083\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026e\u0273\5\u0086D\2\u026f\u0270\7@\2\2\u0270\u0272\5\u0086"+
		"D\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0085\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u027d\5\u0088"+
		"E\2\u0277\u0279\7\5\2\2\u0278\u027a\5\b\5\2\u0279\u0278\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027e\7\6\2\2\u027c\u027e\5p"+
		"9\2\u027d\u0277\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u0087\3\2\2\2\u027f"+
		"\u0282\5r:\2\u0280\u0282\7Z\2\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2"+
		"\2\u0282\u0089\3\2\2\2P\u008b\u0097\u009c\u009f\u00a1\u00a3\u00ab\u00b3"+
		"\u00b5\u00be\u00c5\u00cc\u00d0\u00d5\u00da\u00e1\u00e9\u00f2\u00fc\u0104"+
		"\u010c\u0114\u011c\u0124\u012c\u0134\u013d\u014b\u015e\u0160\u0167\u016d"+
		"\u0173\u017a\u0183\u018d\u0192\u0199\u019b\u01a7\u01ab\u01b0\u01b4\u01bb"+
		"\u01c0\u01c6\u01d2\u01da\u01df\u01e5\u01ea\u01ed\u01ef\u01f3\u01fe\u0204"+
		"\u0206\u0208\u0215\u021c\u0221\u0225\u022c\u0232\u0234\u023d\u0245\u024a"+
		"\u024d\u0251\u0259\u025f\u0261\u026b\u0273\u0279\u027d\u0281";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}