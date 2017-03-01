package nl.jcore.java8demo.defaultmethods;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface DefaultMethodExample {
    void demonstrate();

    default void demonstrateDefault() {
    }

    default String demonstrateDefaultB() {
        throw new NotImplementedException();
    }
}
