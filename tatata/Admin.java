package tatata;

public class Admin {
    private int id;
    private String full_name;
    private String login;
    private String role;

    public Admin(int id, String full_name, String login, String role) {
        this.id = id;
        this.full_name = full_name;
        this.login = login;
        this.role = role;
    }

    public void viewEmployeeInfo(Employee employee) {
        System.out.println("Admin переглядає співробітника:");
        employee.showInfo();
    }

    public void viewTimeRecord(TimeRecord record) {
        System.out.println("Admin переглядає запис: " + record);
    }

    @Override
    public String toString() {
        return "Admin{id=" + id + ", full_name='" + full_name + "', role='" + role + "'}";
    }
}