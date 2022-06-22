public class Program {
    public static void main(String[] args) {
        // variables
        // int age = 55;
        // float weight = 44.44f;
        // double height = 3.22;
        // long speed = 343434343434343l;
        // byte a = 44;
        // System.out.println(age);
        // System.out.println(weight);
        // System.out.println(height);
        // System.out.println(speed);
        // System.out.println(a);

        // String name = "Abebe Kebede";
        // System.out.println(name);

        // char letter = 'A';
        // System.out.println(letter);

        // boolean isAlive = 12 > 17;
        // boolean isDead = !isAlive;
        // System.out.println(isAlive);
        // System.out.println(isDead);

        Person abebe = new Person(1.80f, 77.0f, "Brown", "Abebe");
        Person kebede = new Person(1.60f, 57.0f, "Black", "Kebede");
        Person aster = new Person(1.65f, 47.0f, "Blue", "Aster");

        abebe.greet();
        kebede.greet();
        aster.greet();
    }
}