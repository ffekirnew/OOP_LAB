public class Car {
    String make;
    String model;
    int milage;
    int price;
    String color;
    int hp;

    Car(
            String make,
            String model,
            int milage,
            int price, String color, int hp) {
        this.make = make;
        this.model = model;
        this.milage = milage;
        this.price = price;
        this.color = color;
        this.hp = hp;
    }

    void drive() {
        milage += 200;
        System.out.println("Drove " + make + " for " + milage + " miles");
    }

    void brake() {
        System.out.println("Braking....");
    }
}
