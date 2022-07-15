package sec_other.package1;

public class Person {
    public final String name; // instance variable.

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello from " + name);
    }
}

// public - for all
// private - inside the class only.
// protected - inside the same package only.
// default - inside the same package or in a child class.
