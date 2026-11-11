package tatata;

public class Main {
    public static void main(String[] args) {

        Employee.printClassInfo();
        TimeRecord.systemInfo();
        System.out.println();

        Employee employee = ObjectFactory.createEmployee(1, "Вероніка", "Дашковська", "програміст");
        employee.setContactInfo(new Employee.ContactInfo("veronika@company.com", "+380501234567"));

        WorkDay workDay = ObjectFactory.createWorkDay(1, 1, "29.09.26", "09:00", "18:00", 8.0);
        Admin admin = ObjectFactory.createAdmin(1, "Головний Адмін", "admin", "SUPER_ADMIN");

        System.out.println(employee);
        System.out.println("Контакти: " + employee.getContactInfo());
        System.out.println(workDay);
        System.out.println(admin);

        workDay.startWork();
        workDay.endWork();

        admin.viewEmployeeInfo(employee);
        System.out.println();

        DatabaseStorage.showAllStorageData();
    }
}