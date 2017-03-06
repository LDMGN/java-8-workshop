package nl.jcore.java8workshop;

import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Exercise001LambdaTest {
    @Test
    public void test001OldSkoolSupplier() {
        assertNotNull("Please implement Exercise001Lambda::supplier", Exercise001Lambda.oldSkoolSupplier());
        assertEquals("Hello Java 8", Exercise001Lambda.oldSkoolSupplier().get());
    }

    @Test
    public void test002Supplier() {
        assertNotNull("Please implement Exercise001Lambda::supplier", Exercise001Lambda.supplier());
        assertEquals("Hello Java 8", Exercise001Lambda.supplier().get());
    }

    @Test
    public void test003Consumer() {
        assertNotNull("Please implement Exercise001Lambda::consumer", Exercise001Lambda.consumer());

        /* Arrange. */
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        final String input = "FooBar";

        /* Act. */
        final Consumer consumer = Exercise001Lambda.consumer();
        consumer.accept(input);

        /* Assert. */
        assertEquals(input.trim(), outContent.toString().trim());
    }

    @Test
    public void test004Function() {
        assertNotNull("Please implement Exercise001Lambda::functionToString", Exercise001Lambda.functionToString());
        assertEquals("0", Exercise001Lambda.functionToString().apply(0));
        assertEquals("1", Exercise001Lambda.functionToString().apply(1));
        assertEquals("12", Exercise001Lambda.functionToString().apply(12));
    }

    @Test
    public void test005Predicate(){
        assertNotNull(Exercise001Lambda.predicateIsEven());
        assertTrue(Exercise001Lambda.predicateIsEven().test(0));
        assertFalse(Exercise001Lambda.predicateIsEven().test(1));
        assertTrue(Exercise001Lambda.predicateIsEven().test(2));
    }
}
