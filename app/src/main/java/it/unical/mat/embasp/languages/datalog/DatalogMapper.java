package it.unical.mat.embasp.languages.datalog;

import it.unical.mat.embasp.languages.Mapper;
import it.unical.mat.embasp.languages.asp.IllegalTermException;
import it.unical.mat.embasp.languages.asp.SymbolicConstant;
import it.unical.mat.parsers.datalog.DatalogParser;
import java.util.HashMap;

/**
 * Contains methods used to transform Objects into program strings, which in turn can be appended to
 * {@link it.unical.mat.embasp.base.InputProgram}
 */

public class DatalogMapper extends Mapper {
    private static DatalogMapper mapper;

    public static DatalogMapper getInstance() {
        if (DatalogMapper.mapper == null)
            DatalogMapper.mapper = new DatalogMapper();
        return DatalogMapper.mapper;
    }

    private DatalogMapper() {
        super();
    }

    @Override
    protected String getActualString(final String predicate, final HashMap<Integer, Object> parametersMap) throws IllegalTermException {
        if (parametersMap.isEmpty())
            return predicate;

        StringBuilder atom = new StringBuilder(predicate + "(");
        for (int i = 0; i < parametersMap.size(); i++) {
            if (i != 0)
                atom.append(",");
            final Object objectTerm = parametersMap.get(i);
            if (objectTerm == null)
                throw new IllegalTermException("Wrong term number of predicate " + predicate);
            if (objectTerm instanceof Integer)
                atom.append(objectTerm);
            else if (objectTerm instanceof SymbolicConstant)
                atom.append(objectTerm.toString());
            else
                atom.append("\"").append(objectTerm.toString()).append("\"");
        }
        atom.append(")");
        return atom.toString();

    }

    @Override
    protected String getId(final String atom) {
        final int openBracketIndex = atom.indexOf("(");
        if (openBracketIndex == -1)
            return atom;

        return atom.substring(0, openBracketIndex);
    }

    @Override
    protected String[] getParam(final String atom) {
        return DatalogParser.parseParametersFromAtom(atom);
    }
}
