package nl.jcore.java8workshop;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Exercise003StreamingTest {
    @Test
    public void testMultiplyByTwo() {
        assertEquals(Arrays.asList(0, 2, 4, 6), Exercise003Streaming.multiplyByTwo(getRange(0, 3)));
    }

    @Test
    public void testGetStringValues() {
        final List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        assertEquals(list, Exercise003Streaming.getStringValues(getRange(0, 10)));
    }

    @Test
    public void testIntstreamSumOfEvens() {
        assertEquals(90, Exercise003Streaming.sumOfEvenNumbersInCollection(getRange(0, 19)));
    }

    private List<Integer> getRange(final int startInclusive, final int endInclusive) {
        return IntStream.rangeClosed(startInclusive, endInclusive).boxed().collect(Collectors.toList());
    }
}
