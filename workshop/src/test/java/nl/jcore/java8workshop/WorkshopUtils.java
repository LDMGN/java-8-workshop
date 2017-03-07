package nl.jcore.java8workshop;

public class WorkshopUtils {
    public static boolean isLambda(final Object obj) {
        System.out.println(obj.getClass().toString());
        return obj.getClass().toString().contains("$$Lambda$");
    }
}
