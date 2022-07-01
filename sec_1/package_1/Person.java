package sec_1.package_1;

// access modifiers: public, private, protected, default
// non-access modifiers: final, static, abstract, synchronized, volatile
public class Person {
    public final String name;
    public final int age;
    public char sex;
    public float height;
    public float weight;

    // constructor
    public Person(String n, int a, char s, float h, float w) {
        name = n;
        age = a;
        sex = s;
        height = h;
        weight = w;
    }

    public void walk() {
        System.out.println(name + " is Walking....");
    }

    public void talk() {
        walk();
        System.out.println(name + " is Talking....");
    }

    public void eat() {
        System.out.println(name + " is Eating...");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping...");
    }
}
