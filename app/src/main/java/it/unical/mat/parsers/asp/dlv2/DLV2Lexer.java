// Generated from /home/francesco/Scrivania/embasp/EmbASP-antlr-grammars/dlv2/DLV2Lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DLV2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, COST_LABEL=2, ANY=3, IGNORE=4, AT=5, INTEGER=6, NEW_LINE=7, BLANK_SPACE=8, 
		COMMA=9, INTEGER_CONSTANT=10, IDENTIFIER=11, MODEL_END=12, STRING_CONSTANT=13, 
		TERMS_BEGIN=14, TERMS_END=15, WHITE_SPACE=16;
	public static final int
		COST=1, MODEL=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COST", "MODEL"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"START", "COST_LABEL", "ANY", "IGNORE", "AT", "INTEGER", "NEW_LINE", 
			"BLANK_SPACE", "COMMA", "INTEGER_CONSTANT", "IDENTIFIER", "MODEL_END", 
			"STRING_CONSTANT", "TERMS_BEGIN", "TERMS_END", "WHITE_SPACE", "INT", 
			"NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", null, null, null, "'@'", null, null, null, "','", null, 
			null, "'}'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "COST_LABEL", "ANY", "IGNORE", "AT", "INTEGER", "NEW_LINE", 
			"BLANK_SPACE", "COMMA", "INTEGER_CONSTANT", "IDENTIFIER", "MODEL_END", 
			"STRING_CONSTANT", "TERMS_BEGIN", "TERMS_END", "WHITE_SPACE"
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


	public DLV2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DLV2Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0087\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\5\3\5\5"+
		"\5E\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\5\13X\n\13\3\13\3\13\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\7\16i\n\16\f\16\16\16l\13\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\5\21v\n\21\3\21\3\21\3\22\3\22\3\22\7\22}\n\22\f\22\16"+
		"\22\u0080\13\22\5\22\u0082\n\22\3\23\3\23\3\24\3\24\3>\2\25\5\3\7\4\t"+
		"\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%"+
		"\2\'\2)\2\5\2\3\4\t\4\2C\\c|\6\2\62;C\\aac|\3\2$$\3\2\63;\3\2\62;\4\2"+
		"\f\f\17\17\4\2\13\13\"\"\2\u0089\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\4\25\3"+
		"\2\2\2\4\27\3\2\2\2\4\31\3\2\2\2\4\33\3\2\2\2\4\35\3\2\2\2\4\37\3\2\2"+
		"\2\4!\3\2\2\2\4#\3\2\2\2\5+\3\2\2\2\7/\3\2\2\2\t<\3\2\2\2\13D\3\2\2\2"+
		"\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23P\3\2\2\2\25T\3\2\2\2\27W\3\2\2"+
		"\2\31[\3\2\2\2\33b\3\2\2\2\35f\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#u\3\2\2\2"+
		"%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+,\7}\2\2,-\3\2\2\2-.\b"+
		"\2\2\2.\6\3\2\2\2/\60\7E\2\2\60\61\7Q\2\2\61\62\7U\2\2\62\63\7V\2\2\63"+
		"\64\7\"\2\2\64\65\3\2\2\2\65\66\5%\22\2\66\67\7B\2\2\678\5%\22\289\3\2"+
		"\2\29:\b\3\3\2:\b\3\2\2\2;=\13\2\2\2<;\3\2\2\2=>\3\2\2\2>?\3\2\2\2><\3"+
		"\2\2\2?@\3\2\2\2@A\b\4\4\2A\n\3\2\2\2BE\5\'\23\2CE\5)\24\2DB\3\2\2\2D"+
		"C\3\2\2\2EF\3\2\2\2FG\b\5\4\2G\f\3\2\2\2HI\7B\2\2I\16\3\2\2\2JK\5%\22"+
		"\2K\20\3\2\2\2LM\5\'\23\2MN\3\2\2\2NO\b\b\5\2O\22\3\2\2\2PQ\5)\24\2QR"+
		"\3\2\2\2RS\b\t\4\2S\24\3\2\2\2TU\7.\2\2U\26\3\2\2\2VX\7/\2\2WV\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\5%\22\2Z\30\3\2\2\2[_\t\2\2\2\\^\t\3\2\2]\\\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\32\3\2\2\2a_\3\2\2\2bc\7\177\2\2c"+
		"d\3\2\2\2de\b\r\5\2e\34\3\2\2\2fj\7$\2\2gi\n\4\2\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7$\2\2n\36\3\2\2\2op\7*\2\2"+
		"p \3\2\2\2qr\7+\2\2r\"\3\2\2\2sv\5)\24\2tv\5\'\23\2us\3\2\2\2ut\3\2\2"+
		"\2vw\3\2\2\2wx\b\21\4\2x$\3\2\2\2y\u0082\7\62\2\2z~\t\5\2\2{}\t\6\2\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0082&\3\2\2\2\u0083\u0084\t\7"+
		"\2\2\u0084(\3\2\2\2\u0085\u0086\t\b\2\2\u0086*\3\2\2\2\r\2\3\4>DW_ju~"+
		"\u0081\6\4\4\2\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}