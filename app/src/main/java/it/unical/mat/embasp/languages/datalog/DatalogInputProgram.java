package it.unical.mat.embasp.languages.datalog;

import it.unical.mat.embasp.base.InputProgram;

import java.util.Set;

/**
 * This class models a generic Datalog input program.
 * It provides the user with the possibility to add a fact to the program in the form of an annotated object.
 */
public class DatalogInputProgram extends InputProgram {

    public DatalogInputProgram() {
        super();
    }

    public DatalogInputProgram(final Object inputObj) throws Exception {
        super(inputObj);
    }

    public DatalogInputProgram(final String initialProgram) {
        super(initialProgram);
    }

    /**
     * Transforms a properly-annotated object into a program string (a fact) and appends it to {@link #programs}
     *
     * @param inputObj the object to be transformed
     * @throws IllegalAccessException, IllegalArgumentException , InvocationTargetException , NoSuchMethodException , SecurityException , IllegalTermException, ObjectNotValidException
     * @see DatalogMapper
     * @see it.unical.mat.embasp.languages.Id
     * @see it.unical.mat.embasp.languages.Param
     */
    @Override
    public void addObjectInput(final Object inputObj) throws Exception {
        addProgram(DatalogMapper.getInstance().getString(inputObj) + ".");
    }

    /**
     * Transforms a set of objects
     *
     * @see #addObjectInput(Object)
     */
    @Override
    public void addObjectsInput(final Set<Object> inputObjects) throws Exception {
        for (final Object inputObj : inputObjects)
            addObjectInput(inputObj);
    }

}
