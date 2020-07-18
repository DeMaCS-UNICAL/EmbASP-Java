package it.unical.mat.embasp.languages.datalog;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A collection of data representing a generic Minimal MinimalModel.
 *
 * @see HashMap
 * @see List
 */

public class MinimalModel {

    /**
     * The string representations of the atoms of the model are stored here
     */
    private final Set<String> atomStringCollection;
    /**
     * The object representations of the atoms of the model (only those which are mapped to a class) are stored here
     */
    private Set<Object> atomObjectCollection;

    public MinimalModel(final Set<String> atomList) {
        atomStringCollection = atomList;
    }

    /**
     * Return the current {@link #atomStringCollection} data
     *
     * @return a set of String objects, each representing a different atom of the model
     */
    public Set<String> getAtomsAsStringList() {
        return atomStringCollection;
    }

    /**
     * Return atoms stored in {@link #atomObjectCollection}
     *
     * @return a set of filled atom Objects
     */
    public Set<Object> getAtomsAsObjectSet() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException,
            InstantiationException {
        if (atomObjectCollection == null) {
            atomObjectCollection = new HashSet<>();

            for (final String atom : atomStringCollection) {
                final Object obj = DatalogMapper.getInstance().getObject(atom);
                if (obj != null)
                    atomObjectCollection.add(obj);
            }
        }
        return atomObjectCollection;
    }

}
