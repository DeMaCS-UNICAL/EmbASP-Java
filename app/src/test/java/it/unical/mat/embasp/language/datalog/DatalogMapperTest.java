/**
 * Test for the Datalog Mapper.
 */
package it.unical.mat.embasp.language.datalog;

import java.lang.reflect.InvocationTargetException;

import it.unical.mat.embasp.language.asp.Arity0;
import it.unical.mat.embasp.languages.datalog.DatalogMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.mat.embasp.languages.IllegalAnnotationException;
import it.unical.mat.embasp.languages.ObjectNotValidException;
import it.unical.mat.embasp.languages.asp.IllegalTermException;
import it.unical.mat.embasp.specializations.dlv.Cell;

public class DatalogMapperTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {

        final DatalogMapper instance = DatalogMapper.getInstance();

        try {

            instance.registerClass(Cell.class);
            final Object object = instance.getObject("cell(2,4,6)");

            Assert.assertTrue(object instanceof Cell);
            Assert.assertEquals(2, ((Cell) object).getRow());
            Assert.assertEquals(4, ((Cell) object).getColumn());
            Assert.assertEquals(6, ((Cell) object).getValue());
            Assert.assertEquals("cell(2,4,6)", instance.getString(object));
            instance.unregisterClass(Cell.class);

            final Object nullObject = instance.getObject("cell(2,4,6)");

            Assert.assertNull(nullObject);
            instance.registerClass(Arity0.class);

            final Object object1 = instance.getObject("a");
            Assert.assertNotNull(object1);
            Assert.assertTrue(object1 instanceof Arity0);
            Assert.assertEquals("a", instance.getString(object1));

        } catch (ObjectNotValidException | IllegalAnnotationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | InstantiationException | IllegalTermException e) {
            Assert.fail(e.getMessage());
        }

    }
}
