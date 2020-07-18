package it.unical.mat.embasp.languages.datalog;

import it.unical.mat.embasp.base.Output;
import it.unical.mat.parsers.datalog.DatalogDataCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A utility class to wrap {@link MinimalModel} with useful methods and interface it with the parser.
 */

public abstract class MinimalModels extends Output implements DatalogDataCollection {
    protected Set<MinimalModel> minimalModels;

    public MinimalModels(final String out) {
        super(out);
    }

    public MinimalModels(final String out, final String err) {
        super(out, err);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Set<MinimalModel> getMinimalModels() {
        if (minimalModels == null) {
            minimalModels = new HashSet<>();
            parse();
        }

        return minimalModels;
    }

    /**
     * Return the current {@link #output} data
     *
     * @return the minimal model as a string object - basically, the chosen solver's raw standard output.
     */
    public String getMinimalModelAsString() {
        return output;
    }

    @Override
    public void addMinimalModel(MinimalModel minimalModel) {
        minimalModels.add(minimalModel);
    }
}
