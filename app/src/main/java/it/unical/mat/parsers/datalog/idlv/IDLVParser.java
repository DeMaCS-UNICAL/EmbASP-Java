package it.unical.mat.parsers.datalog.idlv;// Generated from .\IDLVParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IDLVParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            IGNORE=1, COMMA=2, INTEGER_CONSTANT=3, ATOM_END=4, IDENTIFIER=5, STRING_CONSTANT=6,
            TERMS_BEGIN=7, TERMS_END=8;
    public static final int
            RULE_output = 0, RULE_minimal_model = 1, RULE_predicate_atom = 2, RULE_term = 3;
    private static String[] makeRuleNames() {
        return new String[] {
                "output", "minimal_model", "predicate_atom", "term"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
                null, null, "','", null, "'.'", null, null, "'('", "')'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static String[] makeSymbolicNames() {
        return new String[] {
                null, "IGNORE", "COMMA", "INTEGER_CONSTANT", "ATOM_END", "IDENTIFIER",
                "STRING_CONSTANT", "TERMS_BEGIN", "TERMS_END"
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
    public String getGrammarFileName() { return "IDLVParser.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public IDLVParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    public static class OutputContext extends ParserRuleContext {
        public Minimal_modelContext minimal_model() {
            return getRuleContext(Minimal_modelContext.class,0);
        }
        public OutputContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_output; }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof IDLVParserVisitor ) return ((IDLVParserVisitor<? extends T>)visitor).visitOutput(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OutputContext output() throws RecognitionException {
        OutputContext _localctx = new OutputContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_output);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
                minimal_model();
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

    public static class Minimal_modelContext extends ParserRuleContext {
        public List<Predicate_atomContext> predicate_atom() {
            return getRuleContexts(Predicate_atomContext.class);
        }
        public Predicate_atomContext predicate_atom(int i) {
            return getRuleContext(Predicate_atomContext.class,i);
        }
        public List<TerminalNode> ATOM_END() { return getTokens(IDLVParser.ATOM_END); }
        public TerminalNode ATOM_END(int i) {
            return getToken(IDLVParser.ATOM_END, i);
        }
        public Minimal_modelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_minimal_model; }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof IDLVParserVisitor ) return ((IDLVParserVisitor<? extends T>)visitor).visitMinimal_model(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Minimal_modelContext minimal_model() throws RecognitionException {
        Minimal_modelContext _localctx = new Minimal_modelContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_minimal_model);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(15);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==IDENTIFIER) {
                    {
                        {
                            setState(10);
                            predicate_atom();
                            setState(11);
                            match(ATOM_END);
                        }
                    }
                    setState(17);
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

    public static class Predicate_atomContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(IDLVParser.IDENTIFIER, 0); }
        public TerminalNode TERMS_BEGIN() { return getToken(IDLVParser.TERMS_BEGIN, 0); }
        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }
        public TermContext term(int i) {
            return getRuleContext(TermContext.class,i);
        }
        public TerminalNode TERMS_END() { return getToken(IDLVParser.TERMS_END, 0); }
        public List<TerminalNode> COMMA() { return getTokens(IDLVParser.COMMA); }
        public TerminalNode COMMA(int i) {
            return getToken(IDLVParser.COMMA, i);
        }
        public Predicate_atomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_predicate_atom; }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof IDLVParserVisitor ) return ((IDLVParserVisitor<? extends T>)visitor).visitPredicate_atom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Predicate_atomContext predicate_atom() throws RecognitionException {
        Predicate_atomContext _localctx = new Predicate_atomContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_predicate_atom);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(18);
                match(IDENTIFIER);
                setState(30);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TERMS_BEGIN) {
                    {
                        setState(19);
                        match(TERMS_BEGIN);
                        setState(20);
                        term();
                        setState(25);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la==COMMA) {
                            {
                                {
                                    setState(21);
                                    match(COMMA);
                                    setState(22);
                                    term();
                                }
                            }
                            setState(27);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(28);
                        match(TERMS_END);
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

    public static class TermContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() { return getToken(IDLVParser.IDENTIFIER, 0); }
        public TerminalNode INTEGER_CONSTANT() { return getToken(IDLVParser.INTEGER_CONSTANT, 0); }
        public TerminalNode STRING_CONSTANT() { return getToken(IDLVParser.STRING_CONSTANT, 0); }
        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_term; }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof IDLVParserVisitor ) return ((IDLVParserVisitor<? extends T>)visitor).visitTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_term);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_CONSTANT) | (1L << IDENTIFIER) | (1L << STRING_CONSTANT))) != 0)) ) {
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

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n%\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\7\3\20\n\3\f\3\16\3\23\13\3\3\4"+
                    "\3\4\3\4\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\4\3\4\5\4!\n\4\3\5\3\5"+
                    "\3\5\2\2\6\2\4\6\b\2\3\4\2\5\5\7\b\2#\2\n\3\2\2\2\4\21\3\2\2\2\6\24\3"+
                    "\2\2\2\b\"\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\5\6\4\2\r\16\7\6\2\2"+
                    "\16\20\3\2\2\2\17\f\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
                    "\22\5\3\2\2\2\23\21\3\2\2\2\24 \7\7\2\2\25\26\7\t\2\2\26\33\5\b\5\2\27"+
                    "\30\7\4\2\2\30\32\5\b\5\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33"+
                    "\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\n\2\2\37!\3\2\2\2 \25"+
                    "\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\"#\t\2\2\2#\t\3\2\2\2\5\21\33 ";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}