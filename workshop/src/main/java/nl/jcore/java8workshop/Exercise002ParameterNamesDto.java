package nl.jcore.java8workshop;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * To make the test corresponding to this class pass, add <compilerArgument>-parameters</compilerArgument> to the
 * configuration node of the maven-compiler-plugin in the parent pom.xml
 */
@Immutable
public final class Exercise002ParameterNamesDto {
    private final int id;
    private final String name;

    public Exercise002ParameterNamesDto(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}