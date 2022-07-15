public class Employee extends User {
    String emplymentDate;
    int salary;

    Employee(String username, String password, String dateOfBirth, String employmentDate, int salary) {
        super(username, password, dateOfBirth);
        this.emplymentDate = employmentDate;
        this.salary = salary;
    }
}
