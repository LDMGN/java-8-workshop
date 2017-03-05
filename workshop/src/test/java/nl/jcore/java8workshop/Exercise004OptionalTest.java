package nl.jcore.java8workshop;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class Exercise004OptionalTest {
    @Test
    public void testOptional() {
        assertEquals(Optional.of("Test"), Exercise004Optional.returnOptional("Test"));
    }

    @Test(expected = NullPointerException.class)
    public void testOptionalException() {
        Exercise004Optional.returnOptional(null);
    }

    @Test
    public void testNullSafeOptional() {
        assertEquals(Optional.of("Test"), Exercise004Optional.nullSafeOptional("Test"));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional(null));
    }

    @Test
    public void testNullSafeOptional_EmptyOptionalIfEmptyString() {
        assertEquals(Optional.of("Test"), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString("Test"));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString(null));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString(""));
    }
}
