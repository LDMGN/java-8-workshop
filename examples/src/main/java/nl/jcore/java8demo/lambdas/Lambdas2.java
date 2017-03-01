package nl.jcore.java8demo.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambdas2 {
    public void consumerExample() {
        final List<Integer> numbers = new ArrayList<>();
        numbers.forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);
    }

    public void runnableExample() {
        new Thread(() -> {
            System.out.println("Running thread now");
            System.out.println("Executing some logic");
            System.out.println("Ending thread");
        }).start();
    }

    public void streamExample() {
        final Stream<String> stringCollection = Stream.empty();
        stringCollection
                .map(Integer::parseInt)
                .filter(i -> i > 10)
                .filter(i -> {
                    return i > 10;
                })
                .map(i -> i * 10);
    }

    public void optionalExample() {
        final Optional<String> stringOptional = Optional.empty();
        stringOptional
                .filter(String::isEmpty)
                .map(s -> "Value: " + s);
    }
}
