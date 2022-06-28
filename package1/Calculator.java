package package1;

public class Calculator {
    private static double PI = 3.141592; // class variables.
    public static int instanceCount = 0;

    public Calculator() {
        instanceCount++;
    }

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static double perimeterOfCircle(double radius) {
        return 2 * PI * radius;
    }

    public static double average(double[] grades) {
        // TODO - compute and return the average.
        return 0;
    }
}
