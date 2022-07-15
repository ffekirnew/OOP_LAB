public class User {
    String username;
    String password;
    String dateOfBirth;

    User(String username, String password, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    void login() {
        System.out.println("User loggining in...");
    }
}
