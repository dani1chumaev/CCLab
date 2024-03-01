// Generated from C:/Users/Danil/IdeaProjects/CCLab/src/main/java/org/example/MyGrammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_VALUE=1, TRUE=2, FALSE=3, BEGIN=4, END=5, LET=6, IF=7, THEN=8, ELSE=9, 
		END_ELSE=10, FOR=11, DO=12, WHILE=13, LOOP=14, INPUT=15, OUTPUT=16, DIM=17, 
		INT=18, FLOAT=19, BOOL=20, NE=21, EQ=22, LT=23, LE=24, GT=25, GE=26, ADD=27, 
		SUB=28, OR=29, MUL=30, DIV=31, AND=32, NOT=33, ID=34, LETTER=35, COMMA=36, 
		COLON=37, SEMICOLON=38, DOT=39, LPAR=40, RPAR=41, LBR=42, RBR=43, REAL_NUMBER=44, 
		EXP=45, INT_NUMBER=46, BIN_NUMBER=47, OCT_NUMBER=48, DEX_NUMBER=49, HEX_NUMBER=50, 
		DIGIT=51, WS=52, COMMENT=53;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_type = 2, RULE_stmt = 3, RULE_stmt_let = 4, 
		RULE_stmt_if = 5, RULE_stmt_for = 6, RULE_stmt_while = 7, RULE_stmt_input = 8, 
		RULE_stmt_output = 9, RULE_expr = 10, RULE_idt = 11, RULE_number = 12, 
		RULE_int_number = 13, RULE_real_number = 14, RULE_bool_value = 15, RULE_rel_op = 16, 
		RULE_add_op = 17, RULE_mul_op = 18, RULE_unary_op = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "var_type", "stmt", "stmt_let", "stmt_if", "stmt_for", 
			"stmt_while", "stmt_input", "stmt_output", "expr", "idt", "number", "int_number", 
			"real_number", "bool_value", "rel_op", "add_op", "mul_op", "unary_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'true'", "'false'", "'begin'", "'end'", "'let'", "'if'", 
			"'then'", "'else'", "'end_else'", "'for'", "'do'", "'while'", "'loop'", 
			"'input'", "'output'", "'dim'", "'%'", "'!'", "'$'", "'<>'", "'='", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'or'", "'*'", "'/'", "'and'", "'not'", 
			null, null, "','", "':'", "';'", "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_VALUE", "TRUE", "FALSE", "BEGIN", "END", "LET", "IF", "THEN", 
			"ELSE", "END_ELSE", "FOR", "DO", "WHILE", "LOOP", "INPUT", "OUTPUT", 
			"DIM", "INT", "FLOAT", "BOOL", "NE", "EQ", "LT", "LE", "GT", "GE", "ADD", 
			"SUB", "OR", "MUL", "DIV", "AND", "NOT", "ID", "LETTER", "COMMA", "COLON", 
			"SEMICOLON", "DOT", "LPAR", "RPAR", "LBR", "RBR", "REAL_NUMBER", "EXP", 
			"INT_NUMBER", "BIN_NUMBER", "OCT_NUMBER", "DEX_NUMBER", "HEX_NUMBER", 
			"DIGIT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MyGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MyGrammarParser.END, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MyGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MyGrammarParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(BEGIN);
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIM:
				{
				setState(41);
				decl();
				}
				break;
			case LET:
			case IF:
			case FOR:
			case DO:
			case INPUT:
			case OUTPUT:
			case ID:
				{
				setState(42);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(45);
				match(SEMICOLON);
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIM:
					{
					setState(46);
					decl();
					}
					break;
				case LET:
				case IF:
				case FOR:
				case DO:
				case INPUT:
				case OUTPUT:
				case ID:
					{
					setState(47);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(MyGrammarParser.DIM, 0); }
		public List<IdtContext> idt() {
			return getRuleContexts(IdtContext.class);
		}
		public IdtContext idt(int i) {
			return getRuleContext(IdtContext.class,i);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyGrammarParser.COMMA, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DIM);
			setState(58);
			idt();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				idt();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			var_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyGrammarParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Stmt_letContext stmt_let() {
			return getRuleContext(Stmt_letContext.class,0);
		}
		public Stmt_inputContext stmt_input() {
			return getRuleContext(Stmt_inputContext.class,0);
		}
		public Stmt_outputContext stmt_output() {
			return getRuleContext(Stmt_outputContext.class,0);
		}
		public Stmt_ifContext stmt_if() {
			return getRuleContext(Stmt_ifContext.class,0);
		}
		public Stmt_forContext stmt_for() {
			return getRuleContext(Stmt_forContext.class,0);
		}
		public Stmt_whileContext stmt_while() {
			return getRuleContext(Stmt_whileContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case ID:
				{
				setState(70);
				stmt_let();
				}
				break;
			case INPUT:
				{
				setState(71);
				stmt_input();
				}
				break;
			case OUTPUT:
				{
				setState(72);
				stmt_output();
				}
				break;
			case IF:
				{
				setState(73);
				stmt_if();
				}
				break;
			case FOR:
				{
				setState(74);
				stmt_for();
				}
				break;
			case DO:
				{
				setState(75);
				stmt_while();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_letContext extends ParserRuleContext {
		public IdtContext idt() {
			return getRuleContext(IdtContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MyGrammarParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(MyGrammarParser.LET, 0); }
		public Stmt_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_letContext stmt_let() throws RecognitionException {
		Stmt_letContext _localctx = new Stmt_letContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(78);
				match(LET);
				}
			}

			setState(81);
			idt();
			setState(82);
			match(EQ);
			setState(83);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MyGrammarParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode END_ELSE() { return getToken(MyGrammarParser.END_ELSE, 0); }
		public TerminalNode ELSE() { return getToken(MyGrammarParser.ELSE, 0); }
		public Stmt_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_ifContext stmt_if() throws RecognitionException {
		Stmt_ifContext _localctx = new Stmt_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IF);
			setState(86);
			expr(0);
			setState(87);
			match(THEN);
			setState(88);
			stmt();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(89);
				match(ELSE);
				setState(90);
				stmt();
				}
			}

			setState(93);
			match(END_ELSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyGrammarParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MyGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MyGrammarParser.SEMICOLON, i);
		}
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_forContext stmt_for() throws RecognitionException {
		Stmt_forContext _localctx = new Stmt_forContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FOR);
			setState(96);
			match(LPAR);
			setState(97);
			expr(0);
			setState(98);
			match(SEMICOLON);
			setState(99);
			expr(0);
			setState(100);
			match(SEMICOLON);
			setState(101);
			expr(0);
			setState(102);
			match(RPAR);
			setState(103);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MyGrammarParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(MyGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(MyGrammarParser.LOOP, 0); }
		public Stmt_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_whileContext stmt_while() throws RecognitionException {
		Stmt_whileContext _localctx = new Stmt_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DO);
			setState(106);
			match(WHILE);
			setState(107);
			expr(0);
			setState(108);
			stmt();
			setState(109);
			match(LOOP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_inputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(MyGrammarParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public List<IdtContext> idt() {
			return getRuleContexts(IdtContext.class);
		}
		public IdtContext idt(int i) {
			return getRuleContext(IdtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public Stmt_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_inputContext stmt_input() throws RecognitionException {
		Stmt_inputContext _localctx = new Stmt_inputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(INPUT);
			setState(112);
			match(LPAR);
			setState(113);
			idt();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(114);
				idt();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stmt_outputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(MyGrammarParser.OUTPUT, 0); }
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public Stmt_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStmt_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStmt_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStmt_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_outputContext stmt_output() throws RecognitionException {
		Stmt_outputContext _localctx = new Stmt_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(OUTPUT);
			setState(123);
			match(LPAR);
			setState(124);
			expr(0);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 89086211653634L) != 0)) {
				{
				{
				setState(125);
				expr(0);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_exprContext extends ExprContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Par_exprContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(MyGrammarParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MyGrammarParser.RPAR, 0); }
		public Par_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPar_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Add_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ExprContext {
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Bool_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rel_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Rel_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRel_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Idt_exprContext extends ExprContext {
		public IdtContext idt() {
			return getRuleContext(IdtContext.class,0);
		}
		public Idt_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIdt_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_exprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Number_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumber_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumber_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNumber_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public Mul_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMul_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMul_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMul_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new Par_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134);
				match(LPAR);
				setState(135);
				expr(0);
				setState(136);
				match(RPAR);
				}
				break;
			case NOT:
				{
				_localctx = new Unary_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				unary_op();
				setState(139);
				expr(7);
				}
				break;
			case BOOL_VALUE:
				{
				_localctx = new Bool_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				bool_value();
				}
				break;
			case ID:
				{
				_localctx = new Idt_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				idt();
				}
				break;
			case REAL_NUMBER:
			case INT_NUMBER:
				{
				_localctx = new Number_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(147);
						mul_op();
						setState(148);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						add_op();
						setState(152);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Rel_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(155);
						rel_op();
						setState(156);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public IdtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdtContext idt() throws RecognitionException {
		IdtContext _localctx = new IdtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				int_number();
				}
				break;
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				real_number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(MyGrammarParser.INT_NUMBER, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(INT_NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(MyGrammarParser.REAL_NUMBER, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReal_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitReal_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_real_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(REAL_NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_valueContext extends ParserRuleContext {
		public TerminalNode BOOL_VALUE() { return getToken(MyGrammarParser.BOOL_VALUE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(BOOL_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(MyGrammarParser.NE, 0); }
		public TerminalNode EQ() { return getToken(MyGrammarParser.EQ, 0); }
		public TerminalNode LT() { return getToken(MyGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(MyGrammarParser.LE, 0); }
		public TerminalNode GT() { return getToken(MyGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(MyGrammarParser.GE, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MyGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMul_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMul_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MyGrammarParser.NOT, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(NOT);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000\u0005"+
		"\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001"+
		"\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003M\b\u0003\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u007f\b\t\n\t\f\t\u0082\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0091\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009f\b\n\n"+
		"\n\f\n\u00a2\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00a8"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u0014\u0014\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&\u0000\u0004\u0001\u0000\u0012\u0014\u0001\u0000\u0015\u001a\u0001\u0000"+
		"\u001b\u001d\u0001\u0000\u001e \u00b8\u0000(\u0001\u0000\u0000\u0000\u0002"+
		"9\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006L\u0001"+
		"\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000"+
		"\f_\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010o\u0001"+
		"\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000"+
		"\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000"+
		"\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000"+
		"\u0000\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000"+
		"\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000\u0000"+
		"&\u00b5\u0001\u0000\u0000\u0000(+\u0005\u0004\u0000\u0000),\u0003\u0002"+
		"\u0001\u0000*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,4\u0001\u0000\u0000\u0000-0\u0005&\u0000\u0000.1\u0003"+
		"\u0002\u0001\u0000/1\u0003\u0006\u0003\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u00002-\u0001\u0000\u0000"+
		"\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0005"+
		"\u0005\u0000\u00008\u0001\u0001\u0000\u0000\u00009:\u0005\u0011\u0000"+
		"\u0000:?\u0003\u0016\u000b\u0000;<\u0005$\u0000\u0000<>\u0003\u0016\u000b"+
		"\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BC\u0003\u0004\u0002\u0000C\u0003\u0001\u0000\u0000"+
		"\u0000DE\u0007\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FM\u0003"+
		"\b\u0004\u0000GM\u0003\u0010\b\u0000HM\u0003\u0012\t\u0000IM\u0003\n\u0005"+
		"\u0000JM\u0003\f\u0006\u0000KM\u0003\u000e\u0007\u0000LF\u0001\u0000\u0000"+
		"\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0007"+
		"\u0001\u0000\u0000\u0000NP\u0005\u0006\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0003\u0016"+
		"\u000b\u0000RS\u0005\u0016\u0000\u0000ST\u0003\u0014\n\u0000T\t\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u0003\u0014\n\u0000WX\u0005"+
		"\b\u0000\u0000X[\u0003\u0006\u0003\u0000YZ\u0005\t\u0000\u0000Z\\\u0003"+
		"\u0006\u0003\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0005\n\u0000\u0000^\u000b\u0001\u0000\u0000"+
		"\u0000_`\u0005\u000b\u0000\u0000`a\u0005(\u0000\u0000ab\u0003\u0014\n"+
		"\u0000bc\u0005&\u0000\u0000cd\u0003\u0014\n\u0000de\u0005&\u0000\u0000"+
		"ef\u0003\u0014\n\u0000fg\u0005)\u0000\u0000gh\u0003\u0006\u0003\u0000"+
		"h\r\u0001\u0000\u0000\u0000ij\u0005\f\u0000\u0000jk\u0005\r\u0000\u0000"+
		"kl\u0003\u0014\n\u0000lm\u0003\u0006\u0003\u0000mn\u0005\u000e\u0000\u0000"+
		"n\u000f\u0001\u0000\u0000\u0000op\u0005\u000f\u0000\u0000pq\u0005(\u0000"+
		"\u0000qu\u0003\u0016\u000b\u0000rt\u0003\u0016\u000b\u0000sr\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0005)\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0005\u0010\u0000"+
		"\u0000{|\u0005(\u0000\u0000|\u0080\u0003\u0014\n\u0000}\u007f\u0003\u0014"+
		"\n\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005)\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0006\n\uffff\uffff\u0000\u0086\u0087\u0005(\u0000\u0000\u0087\u0088"+
		"\u0003\u0014\n\u0000\u0088\u0089\u0005)\u0000\u0000\u0089\u0091\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003&\u0013\u0000\u008b\u008c\u0003\u0014"+
		"\n\u0007\u008c\u0091\u0001\u0000\u0000\u0000\u008d\u0091\u0003\u001e\u000f"+
		"\u0000\u008e\u0091\u0003\u0016\u000b\u0000\u008f\u0091\u0003\u0018\f\u0000"+
		"\u0090\u0085\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000"+
		"\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u00a0\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\n\u0006\u0000\u0000\u0093\u0094\u0003$\u0012\u0000\u0094"+
		"\u0095\u0003\u0014\n\u0007\u0095\u009f\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\n\u0005\u0000\u0000\u0097\u0098\u0003\"\u0011\u0000\u0098\u0099\u0003"+
		"\u0014\n\u0006\u0099\u009f\u0001\u0000\u0000\u0000\u009a\u009b\n\u0004"+
		"\u0000\u0000\u009b\u009c\u0003 \u0010\u0000\u009c\u009d\u0003\u0014\n"+
		"\u0005\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000"+
		"\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0015\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\"\u0000\u0000"+
		"\u00a4\u0017\u0001\u0000\u0000\u0000\u00a5\u00a8\u0003\u001a\r\u0000\u00a6"+
		"\u00a8\u0003\u001c\u000e\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005.\u0000\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005,\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0001\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af\u00b0\u0007"+
		"\u0001\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0002"+
		"\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0003\u0000"+
		"\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005!\u0000\u0000\u00b6"+
		"\'\u0001\u0000\u0000\u0000\r+04?LO[u\u0080\u0090\u009e\u00a0\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}