package it.unical.mat.parsers.datalog;

import it.unical.mat.parsers.datalog.datalog_parser_base.DatalogGrammarBaseVisitor;
import it.unical.mat.parsers.datalog.datalog_parser_base.DatalogGrammarLexer;
import it.unical.mat.parsers.datalog.datalog_parser_base.DatalogGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.util.ArrayList;

public class DatalogParser extends DatalogGrammarBaseVisitor<Void> {

    private static ArrayList<String> termList = new ArrayList<>();

    public static String[] parseParametersFromAtom(final String atom) {
        termList.clear();
        final CommonTokenStream tokens = new CommonTokenStream(new DatalogGrammarLexer(CharStreams.fromString(atom)));
        final DatalogGrammarParser parser = new DatalogGrammarParser(tokens);
        final DatalogParser visitor = new DatalogParser();

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());

        try {
            visitor.visit(parser.output());
        } catch (final RuntimeException exception) {
            if (exception.getClass() == RuntimeException.class && exception.getCause() instanceof RecognitionException) {
                tokens.seek(0);
                parser.addErrorListener(ConsoleErrorListener.INSTANCE);
                parser.setErrorHandler(new DefaultErrorStrategy());
                parser.getInterpreter().setPredictionMode(PredictionMode.LL);
                visitor.visit(parser.output());
            }
        }

        return termList.toArray(new String[termList.size()]);
    }

    @Override
    public Void visitTerm(DatalogGrammarParser.TermContext ctx) {
        termList.add(ctx.getText());
        return null;
    }
}
