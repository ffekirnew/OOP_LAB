package sec_other.package2;

import sec_other.package1.Calculator;
import sec_other.package1.Person;

public class Program {
    public static void main(String[] args) {
        Person p = new Person("Abebe");
        System.out.println(p.name);

        // double area = AreaCalculator.areaOfCircle(1);
        // AreaCalculator a = new AreaCalculator();
        // System.out.println(a.instanceCount); // 1
        // AreaCalculator b = new AreaCalculator();
        // AreaCalculator c = new AreaCalculator();
        // AreaCalculator d = new AreaCalculator();
        // System.out.println(a.instanceCount); // 4

        // int[] grades = { 77, 88, 68, 99, 89 };

        // for (int grade : grades) {
        // System.out.println(grade);
        // }

        // for (int i = 0; i < grades.length; i++) {
        // System.out.println(grades[i]);
        // }

        // double[] grades = { 70, 55, 77, 99 };
        // double average = Calculator.average(grades);
        // System.out.println(average);

        System.out.println(Calculator.fib(50)); // 3
    }
}
