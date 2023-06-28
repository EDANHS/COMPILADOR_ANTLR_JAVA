package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLAY", "LISTEN", "L_PAR", "R_PAR", "VARENT", "VARACO", "VARBOL", "SUMA", 
		"RESTA", "MULTIPLICACION", "DIVISION", "COMA", "ASIG", "STATE", "RAIZ_CUAD", 
		"ELEVADO", "SIN", "CIE", "NULO", "PI", "DO", "RE", "MI", "SI_PRIMERA", 
		"SI_SEGUNDA", "SINO", "O", "Y", "RELACION", "MAYOR", "MAYOR_IGUAL", "MENOR", 
		"MENOR_IGUAL", "IGUAL", "DISTINTO", "PARIZQ", "PARDER", "MIENTRAS", "PARA_1", 
		"PARA_2", "COR_1", "COR_2", "DOS_P", "TEMPO", "ACORDE", "VARIABLE", "WS"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0114\n\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\5-\u0138\n-\3-\6-\u013b\n-\r-\16-\u013c"+
		"\3.\3.\6.\u0141\n.\r.\16.\u0142\3.\3.\3/\6/\u0148\n/\r/\16/\u0149\3/\7"+
		"/\u014d\n/\f/\16/\u0150\13/\3\60\6\60\u0153\n\60\r\60\16\60\u0154\3\60"+
		"\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\b\3\2//\3"+
		"\2\62;\t\2\"#..\60\60\62=AAC\\c|\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rw\3\2"+
		"\2\2\17~\3\2\2\2\21\u0084\3\2\2\2\23\u0087\3\2\2\2\25\u008a\3\2\2\2\27"+
		"\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u009e\3\2\2\2\37\u00a0"+
		"\3\2\2\2!\u00a3\3\2\2\2#\u00a6\3\2\2\2%\u00b5\3\2\2\2\'\u00c1\3\2\2\2"+
		")\u00c6\3\2\2\2+\u00cf\3\2\2\2-\u00d6\3\2\2\2/\u00dd\3\2\2\2\61\u00e4"+
		"\3\2\2\2\63\u00e7\3\2\2\2\65\u00f5\3\2\2\2\67\u0106\3\2\2\29\u0109\3\2"+
		"\2\2;\u0113\3\2\2\2=\u0115\3\2\2\2?\u0117\3\2\2\2A\u011a\3\2\2\2C\u011c"+
		"\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I\u0124\3\2\2\2K\u0126\3\2\2\2M"+
		"\u0128\3\2\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2"+
		"\2\2W\u0134\3\2\2\2Y\u0137\3\2\2\2[\u013e\3\2\2\2]\u0147\3\2\2\2_\u0152"+
		"\3\2\2\2ab\7r\2\2bc\7n\2\2cd\7c\2\2de\7{\2\2e\4\3\2\2\2fg\7n\2\2gh\7k"+
		"\2\2hi\7u\2\2ij\7v\2\2jk\7g\2\2kl\7p\2\2l\6\3\2\2\2mn\7*\2\2n\b\3\2\2"+
		"\2op\7+\2\2p\n\3\2\2\2qr\7V\2\2rs\7G\2\2st\7O\2\2tu\7R\2\2uv\7Q\2\2v\f"+
		"\3\2\2\2wx\7C\2\2xy\7E\2\2yz\7Q\2\2z{\7T\2\2{|\7F\2\2|}\7G\2\2}\16\3\2"+
		"\2\2~\177\7U\2\2\177\u0080\7V\2\2\u0080\u0081\7C\2\2\u0081\u0082\7V\2"+
		"\2\u0082\u0083\7G\2\2\u0083\20\3\2\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7h\2\2\u0086\22\3\2\2\2\u0087\u0088\7o\2\2\u0088\u0089\7r\2\2\u0089\24"+
		"\3\2\2\2\u008a\u008b\7h\2\2\u008b\26\3\2\2\2\u008c\u008d\7r\2\2\u008d"+
		"\30\3\2\2\2\u008e\u008f\7.\2\2\u008f\32\3\2\2\2\u0090\u0091\7<\2\2\u0091"+
		"\u0092\7<\2\2\u0092\34\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7p\2\2\u0097\u009f\7f\2\2\u0098\u0099\7u\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009f\7v\2\2\u009e\u0093\3\2\2\2\u009e\u0098\3\2\2\2\u009f"+
		"\36\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7r\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4\u00a5\7h\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7Q\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7\"\2"+
		"\2\u00ab\u00ac\7U\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7f\2\2\u00b3\u00b4\7g\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7Q\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7\"\2"+
		"\2\u00ba\u00bb\7E\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7c\2\2\u00c0&\3\2\2\2\u00c1\u00c2"+
		"\7o\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"(\3\2\2\2\u00c6\u00c7\7\65\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\63\2"+
		"\2\u00c9\u00ca\7\66\2\2\u00ca\u00cb\7\63\2\2\u00cb\u00cc\7\67\2\2\u00cc"+
		"\u00cd\7;\2\2\u00cd\u00ce\7\64\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7\64\2\2"+
		"\u00d0\u00d1\78\2\2\u00d1\u00d2\7\63\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4"+
		"\78\2\2\u00d4\u00d5\7\65\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7\64\2\2\u00d7"+
		"\u00d8\7;\2\2\u00d8\u00d9\7\65\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7"+
		"8\2\2\u00db\u00dc\78\2\2\u00dc.\3\2\2\2\u00dd\u00de\7\65\2\2\u00de\u00df"+
		"\7\64\2\2\u00df\u00e0\7;\2\2\u00e0\u00e1\7\60\2\2\u00e1\u00e2\78\2\2\u00e2"+
		"\u00e3\7\65\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\62\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7"+
		"\"\2\2\u00ea\u00eb\7E\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u00f2\7p\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\64\3\2"+
		"\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7\"\2\2\u00fc"+
		"\u00fd\7F\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7q\2\2"+
		"\u0100\u0101\7p\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7g\2\2\u0105\66\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108"+
		"\7f\2\2\u01088\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b\7a\2\2\u010b\u010c"+
		"\7f\2\2\u010c:\3\2\2\2\u010d\u0114\5=\37\2\u010e\u0114\5? \2\u010f\u0114"+
		"\5A!\2\u0110\u0114\5C\"\2\u0111\u0114\5E#\2\u0112\u0114\5G$\2\u0113\u010d"+
		"\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114<\3\2\2\2\u0115\u0116\7O\2\2\u0116"+
		">\3\2\2\2\u0117\u0118\7O\2\2\u0118\u0119\7g\2\2\u0119@\3\2\2\2\u011a\u011b"+
		"\7o\2\2\u011bB\3\2\2\2\u011c\u011d\7o\2\2\u011d\u011e\7g\2\2\u011eD\3"+
		"\2\2\2\u011f\u0120\7g\2\2\u0120F\3\2\2\2\u0121\u0122\7p\2\2\u0122\u0123"+
		"\7g\2\2\u0123H\3\2\2\2\u0124\u0125\7>\2\2\u0125J\3\2\2\2\u0126\u0127\7"+
		"@\2\2\u0127L\3\2\2\2\u0128\u0129\7~\2\2\u0129\u012a\7<\2\2\u012a\u012b"+
		"\7~\2\2\u012bN\3\2\2\2\u012c\u012d\7,\2\2\u012dP\3\2\2\2\u012e\u012f\7"+
		"&\2\2\u012fR\3\2\2\2\u0130\u0131\7]\2\2\u0131T\3\2\2\2\u0132\u0133\7_"+
		"\2\2\u0133V\3\2\2\2\u0134\u0135\7<\2\2\u0135X\3\2\2\2\u0136\u0138\t\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013dZ\3\2\2\2\u013e\u0140\7$\2\2\u013f\u0141"+
		"\t\4\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7$\2\2\u0145\\\3\2\2\2"+
		"\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u014d\t\6\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f^\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\t\7\2\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\b\60\2\2\u0157`\3\2\2\2\13\2\u009e\u0113\u0137"+
		"\u013c\u0142\u0149\u014e\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}