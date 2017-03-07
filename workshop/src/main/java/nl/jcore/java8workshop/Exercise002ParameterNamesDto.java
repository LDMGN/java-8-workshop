package nl.jcore.java8workshop;

/**
 * To make the test corresponding to this class pass, add
 * <compilerArgument>-parameters</compilerArgument> to the
 * configuration node of the maven-compiler-plugin in the
 * parent pom.xml.
 *
 * Note: If this doesn't work, you might need to execute the
 * Maven goal "clean" and run the plugins compiler:compile
 * and compiler:testCompile.
 */
/* @Immutable */
public final class Exercise002ParameterNamesDto {
    private final int id;
    private final String name;

    Exercise002ParameterNamesDto(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}