package nl.jcore.java8workshop;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise001Lambda {
    /**
     * @return supplier which returns a String containing "Hello Java 8" (without quotes)
     */
    static Supplier<String> oldSkoolSupplier() {
        return new Supplier() {
            @Override
            public String get() {
                return "Hello Java 8";
            }
        };
    }

    /**
     * @return supplier which returns a String containing "Hello Java 8" (without quotes)
     */
    static Supplier<String> supplier() {
        return null;
    }

    /**
     * @return consumer which prints it's String input to System.out
     */
    static Consumer<String> consumer() {
        return null;
    }

    /**
     * @return function which converts it's Integer input to a String
     */
    static Function<Integer, String> functionToString() {
        return null;
    }

    /**
     * @return predicate which can tell whether an input number is even
     */
    static Predicate<Integer> predicateIsEven() {
        /* A number is even when its remainder for modulo 2 (i % 2) is equal to zero. */
        return null;
    }
}
