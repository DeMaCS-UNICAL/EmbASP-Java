package it.unical.mat.parsers.datalog.idlv;


import it.unical.mat.parsers.datalog.DatalogDataCollection;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

public class IDLVParserBaseVisitorImplementation extends IDLVParserBaseVisitor<Void> {

    private final DatalogDataCollection models;

    public IDLVParserBaseVisitorImplementation(final DatalogDataCollection models) {
        this.models = models;
    }

    public static void parse(DatalogDataCollection models, String atomsList, boolean two_stageParsing) {

        final CommonTokenStream tokens = new CommonTokenStream(new IDLVLexer(CharStreams.fromString(atomsList)));
        final IDLVParser parser = new IDLVParser(tokens);
        final IDLVParserBaseVisitorImplementation visitor = new IDLVParserBaseVisitorImplementation(models);

        if (!two_stageParsing) {
            visitor.visit(parser.output());
            return;
        }

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
    }

    @Override
    public Void visitPredicate_atom(IDLVParser.Predicate_atomContext ctx) {
        models.storeAtom(ctx.getText());
        return null;
    }

    @Override
    public Void visitMinimal_model(IDLVParser.Minimal_modelContext ctx) {
        models.addMinimalModel();
        return visitChildren(ctx);
    }
}
