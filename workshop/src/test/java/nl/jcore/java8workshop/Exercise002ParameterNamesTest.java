package nl.jcore.java8workshop;

import org.junit.Test;

import java.lang.reflect.Parameter;

import static org.junit.Assert.assertEquals;

/**
 * To make this pass, add <compilerArgument>-parameters</compilerArgument> to the configuration node of the
 * maven-compiler-plugin in the parent pom.xml
 */
public class Exercise002ParameterNamesTest {
    @Test
    public void testReflection() throws NoSuchMethodException {
        final Parameter[] parameters = Exercise002ParameterNamesDto.class.getDeclaredConstructors()[0].getParameters();
        assertEquals("id", parameters[0].getName());
        assertEquals("name", parameters[1].getName());
    }
}
