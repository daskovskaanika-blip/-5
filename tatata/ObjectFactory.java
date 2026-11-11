package tatata;

public class ObjectFactory {
    public static Employee createEmployee(int id, String firstName, String lastName, String position) {
        Employee emp = new Employee(id, firstName, lastName, position);
        DatabaseStorage.addEmployee(emp);
        return emp;
    }

    public static WorkDay createWorkDay(int id, int employeeId, String date, String startTime, String endTime, double hoursWorked) {
        WorkDay wd = new WorkDay(id, employeeId, date, startTime, endTime, hoursWorked);
        DatabaseStorage.addWorkDay(wd);
        return wd;
    }

    public static Admin createAdmin(int id, String fullName, String login, String role) {
        Admin admin = new Admin(id, fullName, login, role);
        DatabaseStorage.addAdmin(admin);
        return admin;
    }
}