public class HREmployee extends Employee {
    String jobPost;

    HREmployee(String username, String password, String dateOfBirth, String employmentDate, int salary,
            String jobPost) {
        super(username, password, dateOfBirth, employmentDate, salary);
        this.jobPost = jobPost;
    }
}