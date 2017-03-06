package nl.jcore.java8workshop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Exercise004OptionalTest {
    @Test
    public void test001Optional() {
        assertEquals(Optional.of("Test"), Exercise004Optional.returnOptional("Test"));
    }

    @Test(expected = NullPointerException.class)
    public void test002OptionalException() {
        Exercise004Optional.returnOptional(null);
    }

    @Test
    public void test003NullSafeOptional() {
        assertEquals(Optional.of("Test"), Exercise004Optional.nullSafeOptional("Test"));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional(null));
    }

    @Test
    public void test004NullSafeOptional_EmptyOptionalIfEmptyString() {
        assertEquals(Optional.of("Test"), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString("Test"));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString(null));
        assertEquals(Optional.empty(), Exercise004Optional.nullSafeOptional_EmptyOptionalIfEmptyString(""));
    }
}
