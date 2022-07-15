package sec_other.package1;

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
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static int fib(int n) {
        // fib sequence starts out as 0, 1, 1, 2
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
