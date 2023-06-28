package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLAY=1, LISTEN=2, L_PAR=3, R_PAR=4, VARENT=5, VARACO=6, VARBOL=7, SUMA=8, 
		RESTA=9, MULTIPLICACION=10, DIVISION=11, COMA=12, ASIG=13, STATE=14, RAIZ_CUAD=15, 
		ELEVADO=16, SIN=17, CIE=18, NULO=19, PI=20, DO=21, RE=22, MI=23, SI_PRIMERA=24, 
		SI_SEGUNDA=25, SINO=26, O=27, Y=28, RELACION=29, MAYOR=30, MAYOR_IGUAL=31, 
		MENOR=32, MENOR_IGUAL=33, IGUAL=34, DISTINTO=35, PARIZQ=36, PARDER=37, 
		MIENTRAS=38, PARA_1=39, PARA_2=40, COR_1=41, COR_2=42, DOS_P=43, TEMPO=44, 
		ACORDE=45, VARIABLE=46, WS=47;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_play = 2, RULE_listen = 3, 
		RULE_declaracion = 4, RULE_son_dison = 5, RULE_condicion = 6, RULE_mientras = 7, 
		RULE_para = 8, RULE_oper_arit = 9;
	public static final String[] ruleNames = {
		"program", "statement", "play", "listen", "declaracion", "son_dison", 
		"condicion", "mientras", "para", "oper_arit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'play'", "'listen'", "'('", "')'", "'TEMPO'", "'ACORDE'", "'STATE'", 
		"'mf'", "'mp'", "'f'", "'p'", "','", "'::'", null, "'pp'", "'ff'", "'Onda Sinusoide'", 
		"'Onda Cierra'", "'mute'", "'3.141592'", "'261.63'", "'293.66'", "'329.63'", 
		"'Si'", "'es Consonante'", "'No ser Disonante'", "'dd'", "'d_d'", null, 
		"'M'", "'Me'", "'m'", "'me'", "'e'", "'ne'", "'<'", "'>'", "'|:|'", "'*'", 
		"'$'", "'['", "']'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLAY", "LISTEN", "L_PAR", "R_PAR", "VARENT", "VARACO", "VARBOL", 
		"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "COMA", "ASIG", "STATE", 
		"RAIZ_CUAD", "ELEVADO", "SIN", "CIE", "NULO", "PI", "DO", "RE", "MI", 
		"SI_PRIMERA", "SI_SEGUNDA", "SINO", "O", "Y", "RELACION", "MAYOR", "MAYOR_IGUAL", 
		"MENOR", "MENOR_IGUAL", "IGUAL", "DISTINTO", "PARIZQ", "PARDER", "MIENTRAS", 
		"PARA_1", "PARA_2", "COR_1", "COR_2", "DOS_P", "TEMPO", "ACORDE", "VARIABLE", 
		"WS"
	};
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLAY) | (1L << LISTEN) | (1L << VARENT) | (1L << VARACO) | (1L << VARBOL) | (1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION) | (1L << RAIZ_CUAD) | (1L << ELEVADO) | (1L << SIN) | (1L << CIE) | (1L << SI_PRIMERA) | (1L << MIENTRAS) | (1L << PARA_1) | (1L << TEMPO) | (1L << VARIABLE))) != 0) );
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
		public PlayContext play() {
			return getRuleContext(PlayContext.class,0);
		}
		public ListenContext listen() {
			return getRuleContext(ListenContext.class,0);
		}
		public Oper_aritContext oper_arit() {
			return getRuleContext(Oper_aritContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Son_disonContext son_dison() {
			return getRuleContext(Son_disonContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				play();
				}
				break;
			case LISTEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				listen();
				}
				break;
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
			case RAIZ_CUAD:
			case ELEVADO:
			case SIN:
			case CIE:
			case TEMPO:
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				oper_arit();
				}
				break;
			case VARENT:
			case VARACO:
			case VARBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				declaracion();
				}
				break;
			case SI_PRIMERA:
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				son_dison();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(30);
				mientras();
				}
				break;
			case PARA_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(31);
				para();
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

	public static class PlayContext extends ParserRuleContext {
		public TerminalNode PLAY() { return getToken(ParserTParser.PLAY, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public List<TerminalNode> TEMPO() { return getTokens(ParserTParser.TEMPO); }
		public TerminalNode TEMPO(int i) {
			return getToken(ParserTParser.TEMPO, i);
		}
		public List<TerminalNode> ACORDE() { return getTokens(ParserTParser.ACORDE); }
		public TerminalNode ACORDE(int i) {
			return getToken(ParserTParser.ACORDE, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ParserTParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ParserTParser.VARIABLE, i);
		}
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public List<TerminalNode> STATE() { return getTokens(ParserTParser.STATE); }
		public TerminalNode STATE(int i) {
			return getToken(ParserTParser.STATE, i);
		}
		public PlayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPlay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayContext play() throws RecognitionException {
		PlayContext _localctx = new PlayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_play);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PLAY);
			setState(35);
			match(L_PAR);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(36);
					match(TEMPO);
					}
					break;
				case 2:
					{
					setState(37);
					match(ACORDE);
					}
					break;
				case 3:
					{
					setState(38);
					match(VARIABLE);
					}
					break;
				case 4:
					{
					setState(39);
					oper_arit();
					}
					break;
				case 5:
					{
					setState(40);
					match(STATE);
					}
					break;
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION) | (1L << STATE) | (1L << RAIZ_CUAD) | (1L << ELEVADO) | (1L << SIN) | (1L << CIE) | (1L << TEMPO) | (1L << ACORDE) | (1L << VARIABLE))) != 0) );
			setState(45);
			match(R_PAR);
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

	public static class ListenContext extends ParserRuleContext {
		public TerminalNode LISTEN() { return getToken(ParserTParser.LISTEN, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public TerminalNode VARIABLE() { return getToken(ParserTParser.VARIABLE, 0); }
		public TerminalNode VARENT() { return getToken(ParserTParser.VARENT, 0); }
		public TerminalNode VARACO() { return getToken(ParserTParser.VARACO, 0); }
		public TerminalNode VARBOL() { return getToken(ParserTParser.VARBOL, 0); }
		public ListenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor )
				try {
					return ((ParserTVisitor<? extends T>)visitor).visitListen(this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return visitor.visitChildren(this);
		}
	}

	public final ListenContext listen() throws RecognitionException {
		ListenContext _localctx = new ListenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LISTEN);
			setState(48);
			match(L_PAR);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARENT) | (1L << VARACO) | (1L << VARBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(VARIABLE);
			}
			setState(52);
			match(R_PAR);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarAcoContext extends DeclaracionContext {
		public TerminalNode VARACO() { return getToken(ParserTParser.VARACO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(ParserTParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ParserTParser.VARIABLE, i);
		}
		public TerminalNode ASIG() { return getToken(ParserTParser.ASIG, 0); }
		public TerminalNode ACORDE() { return getToken(ParserTParser.ACORDE, 0); }
		public DeclarAcoContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarAco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarEntContext extends DeclaracionContext {
		public TerminalNode VARENT() { return getToken(ParserTParser.VARENT, 0); }
		public TerminalNode VARIABLE() { return getToken(ParserTParser.VARIABLE, 0); }
		public TerminalNode ASIG() { return getToken(ParserTParser.ASIG, 0); }
		public Oper_aritContext oper_arit() {
			return getRuleContext(Oper_aritContext.class,0);
		}
		public DeclarEntContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarBolContext extends DeclaracionContext {
		public TerminalNode VARBOL() { return getToken(ParserTParser.VARBOL, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(ParserTParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ParserTParser.VARIABLE, i);
		}
		public TerminalNode ASIG() { return getToken(ParserTParser.ASIG, 0); }
		public TerminalNode STATE() { return getToken(ParserTParser.STATE, 0); }
		public DeclarBolContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarBol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARENT:
				_localctx = new DeclarEntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(VARENT);
				setState(55);
				match(VARIABLE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIG) {
					{
					setState(56);
					match(ASIG);
					{
					setState(57);
					oper_arit();
					}
					}
				}

				}
				break;
			case VARACO:
				_localctx = new DeclarAcoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(VARACO);
				setState(61);
				match(VARIABLE);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIG) {
					{
					setState(62);
					match(ASIG);
					setState(63);
					_la = _input.LA(1);
					if ( !(_la==ACORDE || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case VARBOL:
				_localctx = new DeclarBolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(VARBOL);
				setState(67);
				match(VARIABLE);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIG) {
					{
					setState(68);
					match(ASIG);
					setState(69);
					_la = _input.LA(1);
					if ( !(_la==STATE || _la==VARIABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
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

	public static class Son_disonContext extends ParserRuleContext {
		public TerminalNode SI_PRIMERA() { return getToken(ParserTParser.SI_PRIMERA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode SI_SEGUNDA() { return getToken(ParserTParser.SI_SEGUNDA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SINO() { return getToken(ParserTParser.SINO, 0); }
		public Son_disonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_son_dison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSon_dison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Son_disonContext son_dison() throws RecognitionException {
		Son_disonContext _localctx = new Son_disonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_son_dison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SI_PRIMERA);
			setState(75);
			condicion(0);
			setState(76);
			match(SI_SEGUNDA);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(82);
				match(SINO);
				setState(84); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(83);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOperYContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode Y() { return getToken(ParserTParser.Y, 0); }
		public CondOperYContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondOperY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBolSiNoContext extends CondicionContext {
		public TerminalNode VARBOL() { return getToken(ParserTParser.VARBOL, 0); }
		public TerminalNode VARIABLE() { return getToken(ParserTParser.VARIABLE, 0); }
		public VarBolSiNoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVarBolSiNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StateSiNoContext extends CondicionContext {
		public TerminalNode STATE() { return getToken(ParserTParser.STATE, 0); }
		public StateSiNoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStateSiNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOperOContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode O() { return getToken(ParserTParser.O, 0); }
		public CondOperOContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondOperO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondCadSiNoContext extends CondicionContext {
		public TerminalNode PARIZQ() { return getToken(ParserTParser.PARIZQ, 0); }
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode PARDER() { return getToken(ParserTParser.PARDER, 0); }
		public List<TerminalNode> ACORDE() { return getTokens(ParserTParser.ACORDE); }
		public TerminalNode ACORDE(int i) {
			return getToken(ParserTParser.ACORDE, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ParserTParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ParserTParser.VARIABLE, i);
		}
		public CondCadSiNoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondCadSiNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperAritSINOContext extends CondicionContext {
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode RELACION() { return getToken(ParserTParser.RELACION, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public OperAritSINOContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperAritSINO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARBOL:
				{
				_localctx = new VarBolSiNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(VARBOL);
				setState(92);
				match(VARIABLE);
				}
				break;
			case PARIZQ:
				{
				_localctx = new CondCadSiNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(PARIZQ);
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==ACORDE || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				match(COMA);
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==ACORDE || _la==VARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				match(PARDER);
				}
				break;
			case L_PAR:
				{
				_localctx = new OperAritSINOContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(L_PAR);
				setState(99);
				oper_arit();
				setState(100);
				match(RELACION);
				setState(101);
				oper_arit();
				setState(102);
				match(R_PAR);
				}
				break;
			case STATE:
				{
				_localctx = new StateSiNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(STATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new CondOperYContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(Y);
						setState(109);
						condicion(3);
						}
						break;
					case 2:
						{
						_localctx = new CondOperOContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(111);
						match(O);
						setState(112);
						condicion(2);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MientrasContext extends ParserRuleContext {
		public List<TerminalNode> MIENTRAS() { return getTokens(ParserTParser.MIENTRAS); }
		public TerminalNode MIENTRAS(int i) {
			return getToken(ParserTParser.MIENTRAS, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mientras);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(MIENTRAS);
			setState(119);
			condicion(0);
			setState(120);
			match(MIENTRAS);
			setState(122); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(121);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(126);
			match(MIENTRAS);
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

	public static class ParaContext extends ParserRuleContext {
		public List<TerminalNode> PARA_1() { return getTokens(ParserTParser.PARA_1); }
		public TerminalNode PARA_1(int i) {
			return getToken(ParserTParser.PARA_1, i);
		}
		public TerminalNode VARIABLE() { return getToken(ParserTParser.VARIABLE, 0); }
		public TerminalNode PARA_2() { return getToken(ParserTParser.PARA_2, 0); }
		public TerminalNode COR_1() { return getToken(ParserTParser.COR_1, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public List<TerminalNode> DOS_P() { return getTokens(ParserTParser.DOS_P); }
		public TerminalNode DOS_P(int i) {
			return getToken(ParserTParser.DOS_P, i);
		}
		public TerminalNode COR_2() { return getToken(ParserTParser.COR_2, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_para);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(PARA_1);
			setState(129);
			match(VARIABLE);
			setState(130);
			match(PARA_2);
			setState(131);
			match(COR_1);
			setState(132);
			oper_arit();
			setState(133);
			match(DOS_P);
			setState(134);
			oper_arit();
			setState(135);
			match(DOS_P);
			setState(136);
			oper_arit();
			setState(137);
			match(COR_2);
			setState(138);
			match(PARA_1);
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(144);
			match(PARA_1);
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

	public static class Oper_aritContext extends ParserRuleContext {
		public Oper_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_arit; }
	 
		public Oper_aritContext() { }
		public void copyFrom(Oper_aritContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Oper_aritContext {
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public DivContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends Oper_aritContext {
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public MulContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends Oper_aritContext {
		public TerminalNode VARIABLE() { return getToken(ParserTParser.VARIABLE, 0); }
		public VarContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaizContext extends Oper_aritContext {
		public TerminalNode RAIZ_CUAD() { return getToken(ParserTParser.RAIZ_CUAD, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public Oper_aritContext oper_arit() {
			return getRuleContext(Oper_aritContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public RaizContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends Oper_aritContext {
		public TerminalNode CIE() { return getToken(ParserTParser.CIE, 0); }
		public Oper_aritContext oper_arit() {
			return getRuleContext(Oper_aritContext.class,0);
		}
		public CosContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends Oper_aritContext {
		public TerminalNode TEMPO() { return getToken(ParserTParser.TEMPO, 0); }
		public NumContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElevContext extends Oper_aritContext {
		public TerminalNode ELEVADO() { return getToken(ParserTParser.ELEVADO, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public ElevContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitElev(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends Oper_aritContext {
		public TerminalNode SIN() { return getToken(ParserTParser.SIN, 0); }
		public Oper_aritContext oper_arit() {
			return getRuleContext(Oper_aritContext.class,0);
		}
		public SinContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends Oper_aritContext {
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public SumContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestaContext extends Oper_aritContext {
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public TerminalNode L_PAR() { return getToken(ParserTParser.L_PAR, 0); }
		public List<Oper_aritContext> oper_arit() {
			return getRuleContexts(Oper_aritContext.class);
		}
		public Oper_aritContext oper_arit(int i) {
			return getRuleContext(Oper_aritContext.class,i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode R_PAR() { return getToken(ParserTParser.R_PAR, 0); }
		public RestaContext(Oper_aritContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_aritContext oper_arit() throws RecognitionException {
		Oper_aritContext _localctx = new Oper_aritContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oper_arit);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(SUMA);
				setState(147);
				match(L_PAR);
				setState(148);
				oper_arit();
				setState(149);
				match(COMA);
				setState(150);
				oper_arit();
				setState(151);
				match(R_PAR);
				}
				break;
			case RESTA:
				_localctx = new RestaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(RESTA);
				setState(154);
				match(L_PAR);
				setState(155);
				oper_arit();
				setState(156);
				match(COMA);
				setState(157);
				oper_arit();
				setState(158);
				match(R_PAR);
				}
				break;
			case MULTIPLICACION:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(MULTIPLICACION);
				setState(161);
				match(L_PAR);
				setState(162);
				oper_arit();
				setState(163);
				match(COMA);
				setState(164);
				oper_arit();
				setState(165);
				match(R_PAR);
				}
				break;
			case DIVISION:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(DIVISION);
				setState(168);
				match(L_PAR);
				setState(169);
				oper_arit();
				setState(170);
				match(COMA);
				setState(171);
				oper_arit();
				setState(172);
				match(R_PAR);
				}
				break;
			case TEMPO:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(TEMPO);
				}
				break;
			case VARIABLE:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(VARIABLE);
				}
				break;
			case RAIZ_CUAD:
				_localctx = new RaizContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(RAIZ_CUAD);
				setState(177);
				match(L_PAR);
				setState(178);
				oper_arit();
				setState(179);
				match(R_PAR);
				}
				break;
			case SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(SIN);
				setState(182);
				oper_arit();
				}
				break;
			case CIE:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				match(CIE);
				setState(184);
				oper_arit();
				}
				break;
			case ELEVADO:
				_localctx = new ElevContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				match(ELEVADO);
				setState(186);
				match(L_PAR);
				setState(187);
				oper_arit();
				setState(188);
				match(COMA);
				setState(189);
				oper_arit();
				setState(190);
				match(R_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4,\n\4\r\4\16\4-\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6\3"+
		"\6\3\6\3\6\5\6I\n\6\5\6K\n\6\3\7\3\7\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\7\3"+
		"\7\6\7W\n\7\r\7\16\7X\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16"+
		"\bw\13\b\3\t\3\t\3\t\3\t\6\t}\n\t\r\t\16\t~\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u008f\n\n\r\n\16\n\u0090\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c3\n\13\3\13\2\3\16\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\5\3\2\7\t\3\2/\60\4\2\20\20\60\60\2\u00de\2\27\3\2\2\2\4\"\3\2\2"+
		"\2\6$\3\2\2\2\b\61\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16k\3\2\2\2\20x\3\2\2"+
		"\2\22\u0082\3\2\2\2\24\u00c2\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33#\5\6\4\2\34#\5\b"+
		"\5\2\35#\5\24\13\2\36#\5\n\6\2\37#\5\f\7\2 #\5\20\t\2!#\5\22\n\2\"\33"+
		"\3\2\2\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2"+
		"\2\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%+\7\5\2\2&,\7.\2\2\',\7/\2\2(,\7\60"+
		"\2\2),\5\24\13\2*,\7\20\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+"+
		"*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\6\2\2\60\7\3\2"+
		"\2\2\61\62\7\4\2\2\62\63\7\5\2\2\63\64\t\2\2\2\64\65\7\60\2\2\65\66\3"+
		"\2\2\2\66\67\7\6\2\2\67\t\3\2\2\289\7\7\2\29<\7\60\2\2:;\7\17\2\2;=\5"+
		"\24\13\2<:\3\2\2\2<=\3\2\2\2=K\3\2\2\2>?\7\b\2\2?B\7\60\2\2@A\7\17\2\2"+
		"AC\t\3\2\2B@\3\2\2\2BC\3\2\2\2CK\3\2\2\2DE\7\t\2\2EH\7\60\2\2FG\7\17\2"+
		"\2GI\t\4\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J8\3\2\2\2J>\3\2\2\2JD\3\2\2"+
		"\2K\13\3\2\2\2LM\7\32\2\2MN\5\16\b\2NP\7\33\2\2OQ\5\4\3\2PO\3\2\2\2QR"+
		"\3\2\2\2RP\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TV\7\34\2\2UW\5\4\3\2VU\3\2\2\2"+
		"WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZT\3\2\2\2Z[\3\2\2\2[\r\3\2\2"+
		"\2\\]\b\b\1\2]^\7\t\2\2^l\7\60\2\2_`\7&\2\2`a\t\3\2\2ab\7\16\2\2bc\t\3"+
		"\2\2cl\7\'\2\2de\7\5\2\2ef\5\24\13\2fg\7\37\2\2gh\5\24\13\2hi\7\6\2\2"+
		"il\3\2\2\2jl\7\20\2\2k\\\3\2\2\2k_\3\2\2\2kd\3\2\2\2kj\3\2\2\2lu\3\2\2"+
		"\2mn\f\4\2\2no\7\36\2\2ot\5\16\b\5pq\f\3\2\2qr\7\35\2\2rt\5\16\b\4sm\3"+
		"\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2x"+
		"y\7(\2\2yz\5\16\b\2z|\7(\2\2{}\5\4\3\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7(\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0083\7)\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7*\2\2\u0085\u0086\7+\2"+
		"\2\u0086\u0087\5\24\13\2\u0087\u0088\7-\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u008a\7-\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7,\2\2\u008c\u008e\7)"+
		"\2\2\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7)"+
		"\2\2\u0093\23\3\2\2\2\u0094\u0095\7\n\2\2\u0095\u0096\7\5\2\2\u0096\u0097"+
		"\5\24\13\2\u0097\u0098\7\16\2\2\u0098\u0099\5\24\13\2\u0099\u009a\7\6"+
		"\2\2\u009a\u00c3\3\2\2\2\u009b\u009c\7\13\2\2\u009c\u009d\7\5\2\2\u009d"+
		"\u009e\5\24\13\2\u009e\u009f\7\16\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1"+
		"\7\6\2\2\u00a1\u00c3\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7\5\2\2\u00a4"+
		"\u00a5\5\24\13\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8"+
		"\7\6\2\2\u00a8\u00c3\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\7\5\2\2\u00ab"+
		"\u00ac\5\24\13\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af"+
		"\7\6\2\2\u00af\u00c3\3\2\2\2\u00b0\u00c3\7.\2\2\u00b1\u00c3\7\60\2\2\u00b2"+
		"\u00b3\7\21\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6"+
		"\7\6\2\2\u00b6\u00c3\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00c3\5\24\13"+
		"\2\u00b9\u00ba\7\24\2\2\u00ba\u00c3\5\24\13\2\u00bb\u00bc\7\22\2\2\u00bc"+
		"\u00bd\7\5\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7\16\2\2\u00bf\u00c0"+
		"\5\24\13\2\u00c0\u00c1\7\6\2\2\u00c1\u00c3\3\2\2\2\u00c2\u0094\3\2\2\2"+
		"\u00c2\u009b\3\2\2\2\u00c2\u00a2\3\2\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00b0"+
		"\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c2"+
		"\u00b9\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3\25\3\2\2\2\23\31\"+-<BHJRXZk"+
		"su~\u0090\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}