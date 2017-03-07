package nl.jcore.java8demo.defaultmethods;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface DefaultMethodExample {
    void demonstrate();

    default void demonstrateDefault() {
        final String assignmentVar = "ABC";
    }

    default String demonstrateDefaultB() {
        throw new NotImplementedException();
    }
}
