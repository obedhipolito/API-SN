// Generated from Math.g4 by ANTLR 4.4

	package grammars.embedded.math;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER_LITERAL=1, FLOATING_POINT_LITERAL=2, CHARACTER_LITERAL=3, IDENTIFIER=4, 
		LPAREN=5, RPAREN=6, DOT=7, PLUS=8, MINUS=9, DIV=10, MULT=11, MOD=12, LESSER=13, 
		GREATER=14, LESSER_EQ=15, GREATER_EQ=16, EQ=17, EQEQ=18, NOT=19, WS=20, 
		TAB=21, NEWLINE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"LETTER", "OCTAL_ESC", "DIGIT", "HEX_LITERAL", "UNICODE_ESC", "ESC_SEQ", 
		"INTEGER_LITERAL", "FLOATING_POINT_LITERAL", "EXPONENT", "CHARACTER_LITERAL", 
		"IDENTIFIER", "LPAREN", "RPAREN", "DOT", "PLUS", "MINUS", "DIV", "MULT", 
		"MOD", "LESSER", "GREATER", "LESSER_EQ", "GREATER_EQ", "EQ", "EQEQ", "NOT", 
		"WS", "TAB", "NEWLINE"
	};


		private String code = "";
		public String getCode() {
			return code;
		}


	public MathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Math.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5Q\n"+
		"\5\3\5\3\5\6\5U\n\5\r\5\16\5V\3\6\3\6\3\6\3\6\3\6\3\6\6\6_\n\6\r\6\16"+
		"\6`\3\6\3\6\3\6\3\6\6\6g\n\6\r\6\16\6h\3\6\3\6\3\6\3\6\6\6o\n\6\r\6\16"+
		"\6p\3\6\3\6\3\6\3\6\6\6w\n\6\r\6\16\6x\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b"+
		"\6\b\u0082\n\b\r\b\16\b\u0083\3\b\5\b\u0087\n\b\3\t\6\t\u008a\n\t\r\t"+
		"\16\t\u008b\3\t\3\t\6\t\u0090\n\t\r\t\16\t\u0091\5\t\u0094\n\t\3\t\5\t"+
		"\u0097\n\t\3\t\5\t\u009a\n\t\3\n\3\n\5\n\u009e\n\n\3\n\6\n\u00a1\n\n\r"+
		"\n\16\n\u00a2\3\13\3\13\3\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\5\f\u00ae"+
		"\n\f\3\f\3\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u00e2\n\36\3\36"+
		"\5\36\u00e5\n\36\2\2\37\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\2\25\5\27"+
		"\6\31\7\33\b\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22\61\23\63\24\65\25"+
		"\67\269\27;\30\3\2\f\4\2C\\c|\4\2CHch\4\2ZZzz\n\2$$))^^ddhhppttvv\6\2"+
		"FFHHffhh\4\2GGgg\4\2--//\4\2))^^\4\2&&aa\4\2\f\f\17\17\u00fe\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5H\3\2\2"+
		"\2\7J\3\2\2\2\tP\3\2\2\2\13X\3\2\2\2\r~\3\2\2\2\17\u0086\3\2\2\2\21\u0089"+
		"\3\2\2\2\23\u009b\3\2\2\2\25\u00a4\3\2\2\2\27\u00ad\3\2\2\2\31\u00b7\3"+
		"\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9"+
		"\3\2\2\2-\u00cb\3\2\2\2/\u00ce\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2"+
		"\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00da\3\2\2\2;\u00e1\3\2\2\2=>\t"+
		"\2\2\2>\4\3\2\2\2?@\7^\2\2@A\4\62\65\2AB\4\629\2BI\4\629\2CD\7^\2\2DE"+
		"\4\629\2EI\4\629\2FG\7^\2\2GI\4\629\2H?\3\2\2\2HC\3\2\2\2HF\3\2\2\2I\6"+
		"\3\2\2\2JK\4\62;\2K\b\3\2\2\2LM\7\62\2\2MQ\7z\2\2NO\7\62\2\2OQ\7Z\2\2"+
		"PL\3\2\2\2PN\3\2\2\2QT\3\2\2\2RU\5\7\4\2SU\t\3\2\2TR\3\2\2\2TS\3\2\2\2"+
		"UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\n\3\2\2\2XY\7^\2\2YZ\7w\2\2Z[\7\62\2\2"+
		"[^\t\4\2\2\\_\5\7\4\2]_\t\3\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\7\62\2\2cf\t\4\2\2dg\5\7\4\2eg\t\3\2\2fd\3\2"+
		"\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\62\2\2kn\t"+
		"\4\2\2lo\5\7\4\2mo\t\3\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2rs\7\62\2\2sv\t\4\2\2tw\5\7\4\2uw\t\3\2\2vt\3\2\2\2vu"+
		"\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\f\3\2\2\2z{\7^\2\2{\177\t\5\2"+
		"\2|\177\5\13\6\2}\177\5\5\3\2~z\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\16\3\2"+
		"\2\2\u0080\u0082\5\7\4\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0087\5\t"+
		"\5\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087\20\3\2\2\2\u0088\u008a"+
		"\5\7\4\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008f\5\35\17\2\u008e\u0090\5"+
		"\7\4\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\23\n\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\t\6\2\2\u0099\u0098\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\22\3\2\2\2\u009b\u009d\t\7\2\2\u009c\u009e"+
		"\t\b\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u00a1\5\7\4\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\24\3\2\2\2\u00a4\u00a7\7)\2\2\u00a5\u00a8"+
		"\5\r\7\2\u00a6\u00a8\n\t\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\26\3\2\2\2\u00ab\u00ae\5\3\2\2"+
		"\u00ac\u00ae\t\n\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b4"+
		"\3\2\2\2\u00af\u00b3\5\3\2\2\u00b0\u00b3\t\n\2\2\u00b1\u00b3\5\7\4\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\30\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba"+
		"\34\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7-\2\2\u00be"+
		" \3\2\2\2\u00bf\u00c0\7/\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2"+
		"$\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6"+
		"(\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca,"+
		"\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\7?\2\2\u00cd.\3\2\2\2\u00ce\u00cf"+
		"\7@\2\2\u00cf\u00d0\7?\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2\62"+
		"\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7?\2\2\u00d5\64\3\2\2\2\u00d6"+
		"\u00d7\7#\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7\"\2\2\u00d98\3\2\2\2\u00da"+
		"\u00db\7\13\2\2\u00db:\3\2\2\2\u00dc\u00e2\t\13\2\2\u00dd\u00de\7\17\2"+
		"\2\u00de\u00e2\7\f\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e2\7\17\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e5\7\2\2\3\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"<\3\2\2\2\37\2HPTV^`fhnpvx~\u0083\u0086\u008b\u0091\u0093\u0096\u0099"+
		"\u009d\u00a2\u00a7\u00ad\u00b2\u00b4\u00e1\u00e4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}