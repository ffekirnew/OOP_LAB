package sec_1.package_2;

import sec_1.package_1.Calculator;
import sec_1.package_1.Person;

public class Program {
    public static void main(String[] args) {
        // basic datatypes
        // numeric:
        // int, double, float, byte, long, short
        // characters
        // char, String
        // boolean

        // int age = 55;
        // byte rank = 55;
        // long time = 3442234343l;
        // short age2 = 44;

        // float height = 1.78f;
        // double PI = 3.141592;

        // char a = 'a';
        // String name = "Abebe Kebede";

        // boolean isAlive = true;
        // boolean isDead = !isAlive;

        // logical operators
        // and - &&
        // or - ||
        // not - !

        System.out.println("Hello world");
        Person abebe = new Person("Abebe", 44, 'M', 1.78f, 66.0f);
        Person kebe = new Person("Kebede", 44, 'M', 1.78f, 66.0f);
        Person aster = new Person("Aster", 44, 'M', 1.78f, 66.0f);

        System.out.println("name is " + abebe.name);
        System.out.println("name is " + kebe.age);
        System.out.println("name is " + aster.sex);

        // abebe.walk();
        // aster.talk();
        // kebe.eat();

        System.out.println(Calculator.areaOfCircle(1));
    }
}