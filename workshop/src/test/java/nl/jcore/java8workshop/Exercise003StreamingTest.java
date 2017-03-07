package nl.jcore.java8workshop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Exercise003StreamingTest {
    @Test
    public void test001MultiplyByTwo() {
        assertEquals(Arrays.asList(0, 2, 4, 6), Exercise003Streaming.multiplyByTwo(getRangeClosed(0, 3)));
    }

    @Test
    public void test002GetStringValues() {
        final List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        assertEquals(list, Exercise003Streaming.getStringValues(getRangeClosed(0, 10)));
    }

    @Test
    public void test003GetNumbersContaining5() {
        assertEquals(new ArrayList<>(), Exercise003Streaming.getNumbersContaining5(bigDecimalList(0, 1, 2, 3, 4)));
        assertEquals(bigDecimalList(5), Exercise003Streaming.getNumbersContaining5(bigDecimalList(0, 1, 2, 3, 4, 5)));
        assertEquals(bigDecimalList(-5, 15), Exercise003Streaming.getNumbersContaining5(bigDecimalList(-5, 10, 15)));
        assertEquals(bigDecimalList("1.5"), Exercise003Streaming.getNumbersContaining5(bigDecimalList("1.1", "1.2", "1.5")));
    }

    @Test
    public void test004IntstreamSumOfEvens() {
        assertEquals(90, Exercise003Streaming.sumOfEvenNumbersInCollection(getRangeClosed(0, 19)));
    }

    private List<BigDecimal> bigDecimalList(final Integer... numbers) {
        return Arrays.stream(numbers)
                .map(BigDecimal::new)
                .collect(toList());
    }

    private List<BigDecimal> bigDecimalList(final String... numbers) {
        return Arrays.stream(numbers)
                .map(BigDecimal::new)
                .collect(toList());
    }

    private List<Integer> getRangeClosed(final int from, final int to) {
        return IntStream.rangeClosed(from, to).boxed().collect(toList());
    }
}
