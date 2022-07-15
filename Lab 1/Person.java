public class Person {
    float height;
    float weight;
    String eyeColor;
    String name;

    Person(float h, float w, String eC, String n) {
        height = h;
        weight = w;
        eyeColor = eC;
        name = n;
    }

    void walk() {
        System.out.println("Walking....");
    }

    void talk() {
        System.out.println("Talking...");
    }

    void greet() {
        System.out.println("Hello from " + name);
    }
}
