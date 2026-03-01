// Generated from c:/Users/juand/OneDrive/Escritorio/ChamitoCode/calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, O=2, MIENTRAS=3, POR=4, IGUAL=5, IGUAL_QUE=6, MAYOR_QUE=7, MENOR_QUE=8, 
		SUMA=9, RESTA=10, MULT=11, DIV=12, PYC=13, PAREN_IZQ=14, PAREN_DER=15, 
		LLAVE_IZQ=16, LLAVE_DER=17, ID=18, NUMERO=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SI", "O", "MIENTRAS", "POR", "IGUAL", "IGUAL_QUE", "MAYOR_QUE", "MENOR_QUE", 
			"SUMA", "RESTA", "MULT", "DIV", "PYC", "PAREN_IZQ", "PAREN_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "ID", "NUMERO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'sino'", "'mientras'", "'por'", "'='", "'=='", "'>'", 
			"'<'", "'+'", "'-'", "'*'", "'/'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "O", "MIENTRAS", "POR", "IGUAL", "IGUAL_QUE", "MAYOR_QUE", 
			"MENOR_QUE", "SUMA", "RESTA", "MULT", "DIV", "PYC", "PAREN_IZQ", "PAREN_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "ID", "NUMERO", "WS"
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


	public calculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculadora.g4"; }

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
		"\u0004\u0000\u0014t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\\\b\u0011\n\u0011\f\u0011_\t\u0011"+
		"\u0001\u0012\u0004\u0012b\b\u0012\u000b\u0012\f\u0012c\u0001\u0012\u0001"+
		"\u0012\u0004\u0012h\b\u0012\u000b\u0012\f\u0012i\u0003\u0012l\b\u0012"+
		"\u0001\u0013\u0004\u0013o\b\u0013\u000b\u0013\f\u0013p\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  x\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001"+
		")\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000"+
		"\u0000\u000b@\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000f"+
		"E\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013I\u0001"+
		"\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000"+
		"\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001d"+
		"S\u0001\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000!W\u0001\u0000"+
		"\u0000\u0000#Y\u0001\u0000\u0000\u0000%a\u0001\u0000\u0000\u0000\'n\u0001"+
		"\u0000\u0000\u0000)*\u0005s\u0000\u0000*+\u0005i\u0000\u0000+\u0002\u0001"+
		"\u0000\u0000\u0000,-\u0005s\u0000\u0000-.\u0005i\u0000\u0000./\u0005n"+
		"\u0000\u0000/0\u0005o\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005"+
		"m\u0000\u000023\u0005i\u0000\u000034\u0005e\u0000\u000045\u0005n\u0000"+
		"\u000056\u0005t\u0000\u000067\u0005r\u0000\u000078\u0005a\u0000\u0000"+
		"89\u0005s\u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005p\u0000\u0000"+
		";<\u0005o\u0000\u0000<=\u0005r\u0000\u0000=\b\u0001\u0000\u0000\u0000"+
		">?\u0005=\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005=\u0000\u0000"+
		"AB\u0005=\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005>\u0000\u0000"+
		"D\u000e\u0001\u0000\u0000\u0000EF\u0005<\u0000\u0000F\u0010\u0001\u0000"+
		"\u0000\u0000GH\u0005+\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005"+
		"-\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000L\u0016"+
		"\u0001\u0000\u0000\u0000MN\u0005/\u0000\u0000N\u0018\u0001\u0000\u0000"+
		"\u0000OP\u0005;\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QR\u0005(\u0000"+
		"\u0000R\u001c\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000T\u001e\u0001"+
		"\u0000\u0000\u0000UV\u0005{\u0000\u0000V \u0001\u0000\u0000\u0000WX\u0005"+
		"}\u0000\u0000X\"\u0001\u0000\u0000\u0000Y]\u0007\u0000\u0000\u0000Z\\"+
		"\u0007\u0001\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^$\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0007\u0002\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000dk\u0001\u0000\u0000\u0000eg\u0005.\u0000\u0000"+
		"fh\u0007\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ke\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l&\u0001"+
		"\u0000\u0000\u0000mo\u0007\u0003\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0013\u0000\u0000s(\u0001\u0000"+
		"\u0000\u0000\u0006\u0000]cikp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}