package nl.jcore.java8workshop;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Exercise003Streaming {
    static List<Integer> multiplyByTwo(final List<Integer> numbers) {
        return numbers.stream()
                /* Transformation: Multiply by two. */
                .collect(toList());
    }

    static List<String> getStringValues(final List<Integer> numbers) {
        return null;
    }

    static int sumOfEvenNumbersInCollection(final List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(x -> x)
                /* Filter out odd numbers. */
                .sum();
    }
}
