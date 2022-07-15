public class Student extends User {
    double GPA;

    Student(String username, String password, String dateOfBirth, double GPA) {
        super(username, password, dateOfBirth);
        this.GPA = GPA;
    }
}
