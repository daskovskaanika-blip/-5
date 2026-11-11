package tatata;

import java.util.ArrayList;
import java.util.List;

public class DatabaseStorage {
    public static List<Employee> employees = new ArrayList<>();
    public static List<WorkDay> workDays = new ArrayList<>();
    public static List<Admin> admins = new ArrayList<>();

    public static void addEmployee(Employee e) { employees.add(e); }
    public static void addWorkDay(WorkDay w) { workDays.add(w); }
    public static void addAdmin(Admin a) { admins.add(a); }

    public static void showAllStorageData() {
        System.out.println("=== DatabaseStorage Data ===");
        System.out.println("Employees count: " + employees.size());
        for (Employee e : employees) System.out.println("  " + e);
        System.out.println("WorkDays count: " + workDays.size());
        for (WorkDay w : workDays) System.out.println("  " + w);
        System.out.println("Admins count: " + admins.size());
        for (Admin a : admins) System.out.println("  " + a);
        System.out.println("============================");
    }
