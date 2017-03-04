package nl.jcore.java8workshop;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Exercise003StreamingTest {
    @Test
    public void testIntstreamSumOfEvens() {
        assertEquals(90, Exercise003Streaming.sumOfCollection(getNumbers()));
    }

    private List<Integer> getNumbers() {
        return IntStream.range(0, 20).boxed().collect(Collectors.toList());
    }
}
