public class Program {
    public static void main(String[] args) {
        PersonnelManager manager = new PersonnelManager();
        Teacher teacher = new Teacher("abebe", "pass", "empty", "empty", 3444, "Programming");
        teacher.salary = 5440;
        HREmployee employee = new HREmployee("zinash", "pass", "empty", "empty", 3444, "Audit");
        employee.salary = 3456;

        manager.payToEmployee(teacher);
        manager.payToEmployee(employee);

        teacher.login();
    }
}
