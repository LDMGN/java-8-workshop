package nl.jcore.java8workshop;

import java.util.List;

public class Exercise003Streaming {
    public static int sumOfCollection(final List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(x -> x)
                // Filter out odd numbers
                .sum();
    }
}
