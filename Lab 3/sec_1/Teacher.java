public class Teacher extends Employee {
    String course;

    Teacher(String username, String password, String dateOfBirth, String employmentDate, int salary, String course) {
        super(username, password, dateOfBirth, employmentDate, salary);
        this.course = course;
    }

    @Override
    void login() {
        super.login(); // user.login
        System.out.println("Teacher loggining in...");
    }
}
