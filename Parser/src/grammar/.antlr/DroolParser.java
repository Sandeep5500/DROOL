// Generated from /home/manya/Desktop/COMPILERS2/DROOL/Parser/src/grammar/DroolParser.g4 by ANTLR 4.8

	import cool.AST;
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
		Arrow=39, Sizeof=40, Hashtag=41, Addc=42, Addr=43, Delr=44, Questionmark=45, 
		Inv=46, Trans=47, Det=48, Vsizeof=49, Esizeof=50, Val=51, RightShift=52, 
		LeftShift=53, If=54, Else=55, Switch=56, While=57, For=58, Case=59, Default=60, 
		Comma=61, Colon=62, Semi=63, Ellipsis=64, SingleQuote=65, DoubleQuote=66, 
		Class=67, Void=68, Bool=69, Int=70, Float=71, String=72, Graph=73, Edge=74, 
		Matrix=75, Vertex=76, Long=77, Unsigned=78, Delete=79, Operator=80, Return=81, 
		Const=82, False_=83, True_=84, Identifier=85, IntegerLiteral=86, DecimalLiteral=87, 
		Integersuffix=88, FloatingLiteral=89, StringLiteral=90, BooleanLiteral=91, 
		VertexLiteral=92, Newline=93, WHITESPACE=94, ESC=95, UNTERM_STR=96, NULL_STR=97, 
		ESC_NULL_STR=98, EOF_BCKSLSH_STR=99, EOF_STR=100, EOF_COMMENT_0=101, OPEN_COMMENT=102, 
		SINGLE_LINE_COMMENT=103, MULTI_LINE_COMMENT=104, EOF_COMMENT_1=105, EOF_COMMENT_2=106, 
		IN_NEST_MLC_0=107, CLOSE_MLC_0=108, CONTENT_MLC_0=109, EOF_COMMENT_3=110, 
		EOF_COMMENT_4=111, EOF_COMMENT_5=112, IN_NEST_MLC_1=113, CLOSE_MLC_1=114, 
		CONTENT_MLC_1=115, OTHER=116;
	public static final int
		RULE_translationUnit = 0, RULE_primaryExpression = 1, RULE_postfixExpression = 2, 
		RULE_expressionList = 3, RULE_unaryExpression = 4, RULE_unaryOperator = 5, 
		RULE_countExpression = 6, RULE_addrcExpression = 7, RULE_questionExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_shiftOperator = 12, RULE_relationalExpression = 13, RULE_equalityExpression = 14, 
		RULE_andExpression = 15, RULE_exclusiveOrExpression = 16, RULE_inclusiveOrExpression = 17, 
		RULE_logicalAndExpression = 18, RULE_logicalOrExpression = 19, RULE_assignmentExpression = 20, 
		RULE_assignmentOperator = 21, RULE_expression = 22, RULE_constantExpression = 23, 
		RULE_statement = 24, RULE_caseStatement = 25, RULE_expressionStatement = 26, 
		RULE_compoundStatement = 27, RULE_statementSeq = 28, RULE_selectionStatement = 29, 
		RULE_condition = 30, RULE_iterationStatement = 31, RULE_forInitStatement = 32, 
		RULE_declarationStatement = 33, RULE_declarationseq = 34, RULE_declaration = 35, 
		RULE_blockDeclaration = 36, RULE_simpleDeclaration = 37, RULE_dataType = 38, 
		RULE_initDeclaratorList = 39, RULE_initDeclarator = 40, RULE_declarator = 41, 
		RULE_parametersAndQualifiers = 42, RULE_parameterDeclarationClause = 43, 
		RULE_parameterDeclarationList = 44, RULE_parameterDeclaration = 45, RULE_functionDefinition = 46, 
		RULE_functionBody = 47, RULE_initializer = 48, RULE_braceOrEqualInitializer = 49, 
		RULE_initializerClause = 50, RULE_initializerList = 51, RULE_bracedInitList = 52, 
		RULE_className = 53, RULE_classSpecifier = 54, RULE_classHead = 55, RULE_memberSpecification = 56, 
		RULE_memberdeclaration = 57, RULE_memberDeclaratorList = 58, RULE_memberDeclarator = 59, 
		RULE_baseClause = 60, RULE_baseSpecifierList = 61, RULE_memInitializerList = 62, 
		RULE_memInitializer = 63, RULE_meminitializerid = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "primaryExpression", "postfixExpression", "expressionList", 
			"unaryExpression", "unaryOperator", "countExpression", "addrcExpression", 
			"questionExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "statement", "caseStatement", "expressionStatement", 
			"compoundStatement", "statementSeq", "selectionStatement", "condition", 
			"iterationStatement", "forInitStatement", "declarationStatement", "declarationseq", 
			"declaration", "blockDeclaration", "simpleDeclaration", "dataType", "initDeclaratorList", 
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
			"'->'", null, "'#'", null, null, null, "'?'", null, null, null, null, 
			null, null, "'>>'", "'<<'", null, null, null, null, null, null, null, 
			"','", "':'", "';'", "'...'", "'''", "'\"'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'false'", "'true'"
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
			"Addc", "Addr", "Delr", "Questionmark", "Inv", "Trans", "Det", "Vsizeof", 
			"Esizeof", "Val", "RightShift", "LeftShift", "If", "Else", "Switch", 
			"While", "For", "Case", "Default", "Comma", "Colon", "Semi", "Ellipsis", 
			"SingleQuote", "DoubleQuote", "Class", "Void", "Bool", "Int", "Float", 
			"String", "Graph", "Edge", "Matrix", "Vertex", "Long", "Unsigned", "Delete", 
			"Operator", "Return", "Const", "False_", "True_", "Identifier", "IntegerLiteral", 
			"DecimalLiteral", "Integersuffix", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "VertexLiteral", "Newline", "WHITESPACE", "ESC", "UNTERM_STR", 
			"NULL_STR", "ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", 
			"OPEN_COMMENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "EOF_COMMENT_1", 
			"EOF_COMMENT_2", "IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", 
			"EOF_COMMENT_4", "EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1", 
			"OTHER"
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DroolParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Semi - 63)) | (1L << (Void - 63)) | (1L << (Bool - 63)) | (1L << (Int - 63)) | (1L << (Float - 63)) | (1L << (String - 63)) | (1L << (Graph - 63)) | (1L << (Edge - 63)) | (1L << (Matrix - 63)) | (1L << (Vertex - 63)) | (1L << (Identifier - 63)))) != 0)) {
				{
				setState(130);
				declarationseq();
				}
			}

			setState(133);
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
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(Literal);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(LeftParen);
				setState(137);
				expression();
				setState(138);
				match(RightParen);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(Identifier);
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
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
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
			setState(144);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						match(LeftParen);
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
							{
							setState(148);
							expressionList();
							}
						}

						setState(151);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==Dot || _la==Arrow) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						match(Identifier);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(155);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
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
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode Sizeof() { return getToken(DroolParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(165);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(166);
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
					setState(167);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(168);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				match(LeftParen);
				setState(174);
				dataType();
				setState(175);
				match(RightParen);
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
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
	}

	public final CountExpressionContext countExpression() throws RecognitionException {
		CountExpressionContext _localctx = new CountExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_countExpression);
		int _la;
		try {
			setState(188);
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
				setState(181);
				unaryExpression();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(182);
					match(Hashtag);
					setState(183);
					unaryExpression();
					}
				}

				}
				break;
			case Hashtag:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(Hashtag);
				setState(187);
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
	}

	public final AddrcExpressionContext addrcExpression() throws RecognitionException {
		AddrcExpressionContext _localctx = new AddrcExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addrcExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			countExpression();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Addc || _la==Addr) {
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==Addc || _la==Addr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
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
	}

	public final QuestionExpressionContext questionExpression() throws RecognitionException {
		QuestionExpressionContext _localctx = new QuestionExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			addrcExpression();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Questionmark) {
				{
				setState(196);
				match(Questionmark);
				setState(197);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			questionExpression();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(201);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				questionExpression();
				}
				}
				setState(207);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			multiplicativeExpression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				multiplicativeExpression();
				}
				}
				setState(215);
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
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			additiveExpression();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RightShift || _la==LeftShift) {
				{
				{
				setState(217);
				shiftOperator();
				setState(218);
				additiveExpression();
				}
				}
				setState(224);
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
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			shiftExpression();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(228);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				shiftExpression();
				}
				}
				setState(234);
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
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			relationalExpression();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				relationalExpression();
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
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			equalityExpression();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(244);
				match(And);
				setState(245);
				equalityExpression();
				}
				}
				setState(250);
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
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			andExpression();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(252);
				match(Caret);
				setState(253);
				andExpression();
				}
				}
				setState(258);
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
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			exclusiveOrExpression();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(260);
				match(Or);
				setState(261);
				exclusiveOrExpression();
				}
				}
				setState(266);
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
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			inclusiveOrExpression();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(268);
				match(AndAnd);
				setState(269);
				inclusiveOrExpression();
				}
				}
				setState(274);
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
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			logicalAndExpression();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(276);
				match(OrOr);
				setState(277);
				logicalAndExpression();
				}
				}
				setState(282);
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
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				logicalOrExpression();
				setState(285);
				assignmentOperator();
				setState(286);
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
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			assignmentExpression();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(293);
				match(Comma);
				setState(294);
				assignmentExpression();
				}
				}
				setState(299);
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				caseStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				declarationStatement();
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
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				{
				setState(310);
				match(Case);
				setState(311);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(312);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			match(Colon);
			setState(316);
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
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(318);
				expression();
				}
			}

			setState(321);
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
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LeftBrace);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default) | (1L << Semi))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(324);
				statementSeq();
				}
			}

			setState(327);
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
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				statement();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default) | (1L << Semi))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0) );
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
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectionStatement);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(If);
				setState(335);
				match(LeftParen);
				setState(336);
				condition();
				setState(337);
				match(RightParen);
				setState(338);
				statement();
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(339);
					match(Else);
					setState(340);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(Switch);
				setState(344);
				match(LeftParen);
				setState(345);
				condition();
				setState(346);
				match(RightParen);
				setState(347);
				match(LeftBrace);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(348);
					caseStatement();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condition);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				declarator();
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(360);
					match(Assign);
					setState(361);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(362);
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
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_iterationStatement);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(While);
				setState(368);
				match(LeftParen);
				setState(369);
				condition();
				setState(370);
				match(RightParen);
				setState(371);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(For);
				setState(374);
				match(LeftParen);
				{
				setState(375);
				forInitStatement();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(376);
					condition();
					}
				}

				setState(379);
				match(Semi);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(380);
					expression();
					}
				}

				}
				setState(383);
				match(RightParen);
				setState(384);
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
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forInitStatement);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
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
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394);
				declaration();
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Semi - 63)) | (1L << (Void - 63)) | (1L << (Bool - 63)) | (1L << (Int - 63)) | (1L << (Float - 63)) | (1L << (String - 63)) | (1L << (Graph - 63)) | (1L << (Edge - 63)) | (1L << (Matrix - 63)) | (1L << (Vertex - 63)) | (1L << (Identifier - 63)))) != 0) );
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declaration);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_blockDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			simpleDeclaration();
			setState(404);
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
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simpleDeclaration);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(406);
					initDeclaratorList();
					}
				}

				setState(409);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				initDeclaratorList();
				setState(411);
				match(Semi);
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
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dataType);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(Float);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(Void);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(String);
				}
				break;
			case Graph:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				match(Graph);
				}
				break;
			case Edge:
				enterOuterAlt(_localctx, 7);
				{
				setState(421);
				match(Edge);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				match(Matrix);
				}
				break;
			case Vertex:
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				match(Vertex);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(424);
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
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			initDeclarator();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(428);
				match(Comma);
				setState(429);
				initDeclarator();
				}
				}
				setState(434);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
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
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			dataType();
			setState(436);
			declarator();
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(437);
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
		public TerminalNode LeftBracket() { return getToken(DroolParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(DroolParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Identifier);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(441);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(442);
				match(LeftBracket);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(443);
					constantExpression();
					}
				}

				setState(446);
				match(RightBracket);
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
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parametersAndQualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(LeftParen);
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(450);
				parameterDeclarationClause();
				}
				break;
			}
			setState(453);
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
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameterDeclarationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parameterDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			parameterDeclaration();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(458);
				match(Comma);
				setState(459);
				parameterDeclaration();
				}
				}
				setState(464);
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
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(465);
				initDeclarator();
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
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			dataType();
			setState(469);
			match(Identifier);
			setState(470);
			match(LeftParen);
			setState(471);
			parameterDeclarationClause();
			setState(472);
			match(RightParen);
			setState(473);
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
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionBody);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				compoundStatement();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(Assign);
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
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
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_initializer);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LeftParen);
				setState(483);
				expressionList();
				setState(484);
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
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_braceOrEqualInitializer);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(Assign);
				setState(489);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
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
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_initializerClause);
		try {
			setState(495);
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
				setState(493);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			initializerClause();
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(Comma);
					setState(499);
					initializerClause();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LeftBrace);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(506);
				initializerList();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(507);
					match(Comma);
					}
				}

				}
			}

			setState(512);
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
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			classHead();
			setState(517);
			match(LeftBrace);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Semi - 63)) | (1L << (Void - 63)) | (1L << (Bool - 63)) | (1L << (Int - 63)) | (1L << (Float - 63)) | (1L << (String - 63)) | (1L << (Graph - 63)) | (1L << (Edge - 63)) | (1L << (Matrix - 63)) | (1L << (Vertex - 63)) | (1L << (Identifier - 63)))) != 0)) {
				{
				setState(518);
				memberSpecification();
				}
			}

			setState(521);
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
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(Class);
			setState(524);
			className();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(525);
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
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(528);
				memberdeclaration();
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Semi - 63)) | (1L << (Void - 63)) | (1L << (Bool - 63)) | (1L << (Int - 63)) | (1L << (Float - 63)) | (1L << (String - 63)) | (1L << (Graph - 63)) | (1L << (Edge - 63)) | (1L << (Matrix - 63)) | (1L << (Vertex - 63)) | (1L << (Identifier - 63)))) != 0) );
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
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_memberdeclaration);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(533);
					memberDeclaratorList();
					}
				}

				setState(536);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			memberDeclarator();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(541);
				match(Comma);
				setState(542);
				memberDeclarator();
				}
				}
				setState(547);
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
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_memberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			initDeclarator();
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrace || _la==Assign) {
					{
					setState(550);
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
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(Colon);
			setState(556);
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
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			className();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(559);
				match(Comma);
				setState(560);
				className();
				}
				}
				setState(565);
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
		public List<TerminalNode> Ellipsis() { return getTokens(DroolParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(DroolParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			memInitializer();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(567);
				match(Ellipsis);
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(570);
				match(Comma);
				setState(571);
				memInitializer();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(572);
					match(Ellipsis);
					}
				}

				}
				}
				setState(579);
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
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			meminitializerid();
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(581);
				match(LeftParen);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(582);
					expressionList();
					}
				}

				setState(585);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(586);
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
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_meminitializerid);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u0254\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\5\2\u0086\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u0090\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0098\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u00a0\n\4\f\4\16\4\u00a3\13\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u00bb\n\b\3\b\3\b\5\b\u00bf\n\b\3\t\3\t\3\t\5\t\u00c4\n"+
		"\t\3\n\3\n\3\n\5\n\u00c9\n\n\3\13\3\13\3\13\7\13\u00ce\n\13\f\13\16\13"+
		"\u00d1\13\13\3\f\3\f\3\f\7\f\u00d6\n\f\f\f\16\f\u00d9\13\f\3\r\3\r\3\r"+
		"\3\r\7\r\u00df\n\r\f\r\16\r\u00e2\13\r\3\16\3\16\3\17\3\17\3\17\7\17\u00e9"+
		"\n\17\f\17\16\17\u00ec\13\17\3\20\3\20\3\20\7\20\u00f1\n\20\f\20\16\20"+
		"\u00f4\13\20\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\22"+
		"\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\23\3\23\3\23\7\23"+
		"\u0109\n\23\f\23\16\23\u010c\13\23\3\24\3\24\3\24\7\24\u0111\n\24\f\24"+
		"\16\24\u0114\13\24\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3\27\3\27\3\30\3\30\3\30"+
		"\7\30\u012a\n\30\f\30\16\30\u012d\13\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0137\n\32\3\33\3\33\3\33\5\33\u013c\n\33\3\33\3\33\3"+
		"\33\3\34\5\34\u0142\n\34\3\34\3\34\3\35\3\35\5\35\u0148\n\35\3\35\3\35"+
		"\3\36\6\36\u014d\n\36\r\36\16\36\u014e\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0158\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0160\n\37\f\37"+
		"\16\37\u0163\13\37\3\37\3\37\5\37\u0167\n\37\3 \3 \3 \3 \3 \5 \u016e\n"+
		" \5 \u0170\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017c\n!\3!\3!\5!\u0180"+
		"\n!\3!\3!\3!\5!\u0185\n!\3\"\3\"\5\"\u0189\n\"\3#\3#\3$\6$\u018e\n$\r"+
		"$\16$\u018f\3%\3%\5%\u0194\n%\3&\3&\3&\3\'\5\'\u019a\n\'\3\'\3\'\3\'\3"+
		"\'\5\'\u01a0\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01ac\n(\3)\3)\3)\7"+
		")\u01b1\n)\f)\16)\u01b4\13)\3*\3*\3*\5*\u01b9\n*\3+\3+\3+\3+\5+\u01bf"+
		"\n+\3+\5+\u01c2\n+\3,\3,\5,\u01c6\n,\3,\3,\3-\3-\3.\3.\3.\7.\u01cf\n."+
		"\f.\16.\u01d2\13.\3/\5/\u01d5\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\5\61\u01e2\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u01e9"+
		"\n\62\3\63\3\63\3\63\5\63\u01ee\n\63\3\64\3\64\5\64\u01f2\n\64\3\65\3"+
		"\65\3\65\7\65\u01f7\n\65\f\65\16\65\u01fa\13\65\3\66\3\66\3\66\5\66\u01ff"+
		"\n\66\5\66\u0201\n\66\3\66\3\66\3\67\3\67\38\38\38\58\u020a\n8\38\38\3"+
		"9\39\39\59\u0211\n9\3:\6:\u0214\n:\r:\16:\u0215\3;\5;\u0219\n;\3;\3;\5"+
		";\u021d\n;\3<\3<\3<\7<\u0222\n<\f<\16<\u0225\13<\3=\3=\3=\5=\u022a\n="+
		"\5=\u022c\n=\3>\3>\3>\3?\3?\3?\7?\u0234\n?\f?\16?\u0237\13?\3@\3@\5@\u023b"+
		"\n@\3@\3@\3@\5@\u0240\n@\7@\u0242\n@\f@\16@\u0245\13@\3A\3A\3A\5A\u024a"+
		"\nA\3A\3A\5A\u024e\nA\3B\3B\5B\u0252\nB\3B\2\3\6C\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\2\16\3\2()\3\2&\'\4\2**\60\65\3\2\13\21\3\2,-\4\2"+
		"\f\f\22\23\3\2\16\17\3\2\66\67\3\2\24\27\3\2\30\31\3\2\35%\4\2>>QQ\2\u026b"+
		"\2\u0085\3\2\2\2\4\u008f\3\2\2\2\6\u0091\3\2\2\2\b\u00a4\3\2\2\2\n\u00b3"+
		"\3\2\2\2\f\u00b5\3\2\2\2\16\u00be\3\2\2\2\20\u00c0\3\2\2\2\22\u00c5\3"+
		"\2\2\2\24\u00ca\3\2\2\2\26\u00d2\3\2\2\2\30\u00da\3\2\2\2\32\u00e3\3\2"+
		"\2\2\34\u00e5\3\2\2\2\36\u00ed\3\2\2\2 \u00f5\3\2\2\2\"\u00fd\3\2\2\2"+
		"$\u0105\3\2\2\2&\u010d\3\2\2\2(\u0115\3\2\2\2*\u0122\3\2\2\2,\u0124\3"+
		"\2\2\2.\u0126\3\2\2\2\60\u012e\3\2\2\2\62\u0136\3\2\2\2\64\u013b\3\2\2"+
		"\2\66\u0141\3\2\2\28\u0145\3\2\2\2:\u014c\3\2\2\2<\u0166\3\2\2\2>\u016f"+
		"\3\2\2\2@\u0184\3\2\2\2B\u0188\3\2\2\2D\u018a\3\2\2\2F\u018d\3\2\2\2H"+
		"\u0193\3\2\2\2J\u0195\3\2\2\2L\u019f\3\2\2\2N\u01ab\3\2\2\2P\u01ad\3\2"+
		"\2\2R\u01b5\3\2\2\2T\u01ba\3\2\2\2V\u01c3\3\2\2\2X\u01c9\3\2\2\2Z\u01cb"+
		"\3\2\2\2\\\u01d4\3\2\2\2^\u01d6\3\2\2\2`\u01e1\3\2\2\2b\u01e8\3\2\2\2"+
		"d\u01ed\3\2\2\2f\u01f1\3\2\2\2h\u01f3\3\2\2\2j\u01fb\3\2\2\2l\u0204\3"+
		"\2\2\2n\u0206\3\2\2\2p\u020d\3\2\2\2r\u0213\3\2\2\2t\u021c\3\2\2\2v\u021e"+
		"\3\2\2\2x\u0226\3\2\2\2z\u022d\3\2\2\2|\u0230\3\2\2\2~\u0238\3\2\2\2\u0080"+
		"\u0246\3\2\2\2\u0082\u0251\3\2\2\2\u0084\u0086\5F$\2\u0085\u0084\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\2\2\3\u0088\3"+
		"\3\2\2\2\u0089\u0090\7\4\2\2\u008a\u008b\7\5\2\2\u008b\u008c\5.\30\2\u008c"+
		"\u008d\7\6\2\2\u008d\u0090\3\2\2\2\u008e\u0090\7W\2\2\u008f\u0089\3\2"+
		"\2\2\u008f\u008a\3\2\2\2\u008f\u008e\3\2\2\2\u0090\5\3\2\2\2\u0091\u0092"+
		"\b\4\1\2\u0092\u0093\5\4\3\2\u0093\u00a1\3\2\2\2\u0094\u0095\f\5\2\2\u0095"+
		"\u0097\7\5\2\2\u0096\u0098\5\b\5\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u00a0\7\6\2\2\u009a\u009b\f\4\2\2\u009b"+
		"\u009c\t\2\2\2\u009c\u00a0\7W\2\2\u009d\u009e\f\3\2\2\u009e\u00a0\t\3"+
		"\2\2\u009f\u0094\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\7\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5h\65\2\u00a5\t\3\2\2\2\u00a6\u00b4\5"+
		"\6\4\2\u00a7\u00ac\7&\2\2\u00a8\u00ac\7\'\2\2\u00a9\u00ac\5\f\7\2\u00aa"+
		"\u00ac\7*\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\5\n\6\2\u00ae"+
		"\u00af\t\4\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5N(\2\u00b1\u00b2\7\6\2"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\t\5\2\2\u00b6\r\3\2\2\2\u00b7\u00ba"+
		"\5\n\6\2\u00b8\u00b9\7+\2\2\u00b9\u00bb\5\n\6\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd\u00bf\5\n"+
		"\6\2\u00be\u00b7\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\17\3\2\2\2\u00c0\u00c3"+
		"\5\16\b\2\u00c1\u00c2\t\6\2\2\u00c2\u00c4\5\16\b\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\21\3\2\2\2\u00c5\u00c8\5\20\t\2\u00c6\u00c7"+
		"\7/\2\2\u00c7\u00c9\5\20\t\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\23\3\2\2\2\u00ca\u00cf\5\22\n\2\u00cb\u00cc\t\7\2\2\u00cc\u00ce\5\22"+
		"\n\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\5\24\13"+
		"\2\u00d3\u00d4\t\b\2\2\u00d4\u00d6\5\24\13\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\27\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00da\u00e0\5\26\f\2\u00db\u00dc\5\32\16\2\u00dc"+
		"\u00dd\5\26\f\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\31\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\t\t\2\2\u00e4\33\3\2\2\2\u00e5\u00ea\5\30\r"+
		"\2\u00e6\u00e7\t\n\2\2\u00e7\u00e9\5\30\r\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\35\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2\5\34\17\2\u00ee\u00ef\t\13\2\2\u00ef"+
		"\u00f1\5\34\17\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00fa\5\36\20\2\u00f6\u00f7\7\r\2\2\u00f7\u00f9\5\36\20\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"!\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\5 \21\2\u00fe\u00ff\7\32\2\2"+
		"\u00ff\u0101\5 \21\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103#\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u010a\5\"\22\2\u0106\u0107\7\13\2\2\u0107\u0109\5\"\22\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"%\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0112\5$\23\2\u010e\u010f\7\33\2\2"+
		"\u010f\u0111\5$\23\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\'\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u011a\5&\24\2\u0116\u0117\7\34\2\2\u0117\u0119\5&\24\2\u0118\u0116\3"+
		"\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		")\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0123\5(\25\2\u011e\u011f\5(\25\2"+
		"\u011f\u0120\5,\27\2\u0120\u0121\5f\64\2\u0121\u0123\3\2\2\2\u0122\u011d"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0123+\3\2\2\2\u0124\u0125\t\f\2\2\u0125"+
		"-\3\2\2\2\u0126\u012b\5*\26\2\u0127\u0128\7?\2\2\u0128\u012a\5*\26\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c/\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5(\25\2\u012f\61\3"+
		"\2\2\2\u0130\u0137\5\64\33\2\u0131\u0137\5\66\34\2\u0132\u0137\58\35\2"+
		"\u0133\u0137\5<\37\2\u0134\u0137\5@!\2\u0135\u0137\5D#\2\u0136\u0130\3"+
		"\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\63\3\2\2\2\u0138\u0139\7=\2\2"+
		"\u0139\u013c\5\60\31\2\u013a\u013c\7>\2\2\u013b\u0138\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7@\2\2\u013e\u013f\5\62\32\2"+
		"\u013f\65\3\2\2\2\u0140\u0142\5.\30\2\u0141\u0140\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7A\2\2\u0144\67\3\2\2\2\u0145"+
		"\u0147\7\7\2\2\u0146\u0148\5:\36\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\b\2\2\u014a9\3\2\2\2\u014b\u014d"+
		"\5\62\32\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f;\3\2\2\2\u0150\u0151\78\2\2\u0151\u0152\7\5"+
		"\2\2\u0152\u0153\5> \2\u0153\u0154\7\6\2\2\u0154\u0157\5\62\32\2\u0155"+
		"\u0156\79\2\2\u0156\u0158\5\62\32\2\u0157\u0155\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0167\3\2\2\2\u0159\u015a\7:\2\2\u015a\u015b\7\5\2\2\u015b"+
		"\u015c\5> \2\u015c\u015d\7\6\2\2\u015d\u0161\7\7\2\2\u015e\u0160\5\64"+
		"\33\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\b"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u0150\3\2\2\2\u0166\u0159\3\2\2\2\u0167"+
		"=\3\2\2\2\u0168\u0170\5.\30\2\u0169\u016d\5T+\2\u016a\u016b\7\35\2\2\u016b"+
		"\u016e\5f\64\2\u016c\u016e\5j\66\2\u016d\u016a\3\2\2\2\u016d\u016c\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u0168\3\2\2\2\u016f\u0169\3\2\2\2\u0170"+
		"?\3\2\2\2\u0171\u0172\7;\2\2\u0172\u0173\7\5\2\2\u0173\u0174\5> \2\u0174"+
		"\u0175\7\6\2\2\u0175\u0176\5\62\32\2\u0176\u0185\3\2\2\2\u0177\u0178\7"+
		"<\2\2\u0178\u0179\7\5\2\2\u0179\u017b\5B\"\2\u017a\u017c\5> \2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7A\2\2\u017e"+
		"\u0180\5.\30\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\7\6\2\2\u0182\u0183\5\62\32\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0171\3\2\2\2\u0184\u0177\3\2\2\2\u0185A\3\2\2\2\u0186\u0189\5\66\34"+
		"\2\u0187\u0189\5L\'\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189C\3"+
		"\2\2\2\u018a\u018b\5J&\2\u018bE\3\2\2\2\u018c\u018e\5H%\2\u018d\u018c"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"G\3\2\2\2\u0191\u0194\5J&\2\u0192\u0194\5^\60\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194I\3\2\2\2\u0195\u0196\5L\'\2\u0196\u0197\7A\2\2\u0197"+
		"K\3\2\2\2\u0198\u019a\5P)\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u01a0\7A\2\2\u019c\u019d\5P)\2\u019d\u019e\7A\2\2"+
		"\u019e\u01a0\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019c\3\2\2\2\u01a0M\3"+
		"\2\2\2\u01a1\u01ac\7G\2\2\u01a2\u01ac\7H\2\2\u01a3\u01ac\7I\2\2\u01a4"+
		"\u01ac\7F\2\2\u01a5\u01ac\7J\2\2\u01a6\u01ac\7K\2\2\u01a7\u01ac\7L\2\2"+
		"\u01a8\u01ac\7M\2\2\u01a9\u01ac\7N\2\2\u01aa\u01ac\5l\67\2\u01ab\u01a1"+
		"\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab"+
		"\u01a5\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acO\3\2\2\2\u01ad\u01b2"+
		"\5R*\2\u01ae\u01af\7?\2\2\u01af\u01b1\5R*\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3Q\3\2\2\2"+
		"\u01b4\u01b2\3\2\2\2\u01b5\u01b6\5N(\2\u01b6\u01b8\5T+\2\u01b7\u01b9\5"+
		"b\62\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9S\3\2\2\2\u01ba\u01c1"+
		"\7W\2\2\u01bb\u01c2\5V,\2\u01bc\u01be\7\t\2\2\u01bd\u01bf\5\60\31\2\u01be"+
		"\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7\n"+
		"\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"U\3\2\2\2\u01c3\u01c5\7\5\2\2\u01c4\u01c6\5X-\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8W\3\2\2\2"+
		"\u01c9\u01ca\5Z.\2\u01caY\3\2\2\2\u01cb\u01d0\5\\/\2\u01cc\u01cd\7?\2"+
		"\2\u01cd\u01cf\5\\/\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1[\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d5\5R*\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5]\3\2\2\2\u01d6"+
		"\u01d7\5N(\2\u01d7\u01d8\7W\2\2\u01d8\u01d9\7\5\2\2\u01d9\u01da\5X-\2"+
		"\u01da\u01db\7\6\2\2\u01db\u01dc\5`\61\2\u01dc_\3\2\2\2\u01dd\u01e2\5"+
		"8\35\2\u01de\u01df\7\35\2\2\u01df\u01e0\t\r\2\2\u01e0\u01e2\7A\2\2\u01e1"+
		"\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e2a\3\2\2\2\u01e3\u01e9\5d\63\2"+
		"\u01e4\u01e5\7\5\2\2\u01e5\u01e6\5\b\5\2\u01e6\u01e7\7\6\2\2\u01e7\u01e9"+
		"\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e9c\3\2\2\2\u01ea"+
		"\u01eb\7\35\2\2\u01eb\u01ee\5f\64\2\u01ec\u01ee\5j\66\2\u01ed\u01ea\3"+
		"\2\2\2\u01ed\u01ec\3\2\2\2\u01eee\3\2\2\2\u01ef\u01f2\5*\26\2\u01f0\u01f2"+
		"\5j\66\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2g\3\2\2\2\u01f3"+
		"\u01f8\5f\64\2\u01f4\u01f5\7?\2\2\u01f5\u01f7\5f\64\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"i\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u0200\7\7\2\2\u01fc\u01fe\5h\65\2"+
		"\u01fd\u01ff\7?\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201"+
		"\3\2\2\2\u0200\u01fc\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\7\b\2\2\u0203k\3\2\2\2\u0204\u0205\7W\2\2\u0205m\3\2\2\2\u0206"+
		"\u0207\5p9\2\u0207\u0209\7\7\2\2\u0208\u020a\5r:\2\u0209\u0208\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7\b\2\2\u020co\3"+
		"\2\2\2\u020d\u020e\7E\2\2\u020e\u0210\5l\67\2\u020f\u0211\5z>\2\u0210"+
		"\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211q\3\2\2\2\u0212\u0214\5t;\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216s\3\2\2\2\u0217\u0219\5v<\2\u0218\u0217\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021d\7A\2\2\u021b\u021d\5^\60\2\u021c"+
		"\u0218\3\2\2\2\u021c\u021b\3\2\2\2\u021du\3\2\2\2\u021e\u0223\5x=\2\u021f"+
		"\u0220\7?\2\2\u0220\u0222\5x=\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2"+
		"\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224w\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u022b\5R*\2\u0227\u022c\3\2\2\2\u0228\u022a\5d\63\2\u0229"+
		"\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0227\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022cy\3\2\2\2\u022d\u022e\7@\2\2\u022e\u022f"+
		"\5|?\2\u022f{\3\2\2\2\u0230\u0235\5l\67\2\u0231\u0232\7?\2\2\u0232\u0234"+
		"\5l\67\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236}\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\5\u0080"+
		"A\2\u0239\u023b\7B\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0243"+
		"\3\2\2\2\u023c\u023d\7?\2\2\u023d\u023f\5\u0080A\2\u023e\u0240\7B\2\2"+
		"\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023c"+
		"\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\177\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u024d\5\u0082B\2\u0247\u0249\7"+
		"\5\2\2\u0248\u024a\5\b\5\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024e\7\6\2\2\u024c\u024e\5j\66\2\u024d\u0247\3\2"+
		"\2\2\u024d\u024c\3\2\2\2\u024e\u0081\3\2\2\2\u024f\u0252\5l\67\2\u0250"+
		"\u0252\7W\2\2\u0251\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u0083\3\2"+
		"\2\2I\u0085\u008f\u0097\u009f\u00a1\u00ab\u00b3\u00ba\u00be\u00c3\u00c8"+
		"\u00cf\u00d7\u00e0\u00ea\u00f2\u00fa\u0102\u010a\u0112\u011a\u0122\u012b"+
		"\u0136\u013b\u0141\u0147\u014e\u0157\u0161\u0166\u016d\u016f\u017b\u017f"+
		"\u0184\u0188\u018f\u0193\u0199\u019f\u01ab\u01b2\u01b8\u01be\u01c1\u01c5"+
		"\u01d0\u01d4\u01e1\u01e8\u01ed\u01f1\u01f8\u01fe\u0200\u0209\u0210\u0215"+
		"\u0218\u021c\u0223\u0229\u022b\u0235\u023a\u023f\u0243\u0249\u024d\u0251";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}