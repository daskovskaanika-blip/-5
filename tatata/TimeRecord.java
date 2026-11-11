package tatata;

public class TimeRecord {

    private int id;
    private int employee_id;
    private String date;
    private double hours;
    private String status;

    public TimeRecord(int id, int employee_id, String date,
                      double hours, String status) {
        this.id = id;
        this.employee_id = employee_id;
        this.date = date;
        this.hours = hours;
        this.status = status;
    }

    // Статичний метод у базовому класі TimeRecord
    public static void systemInfo() {
        System.out.println("TimeRecord: базовий клас для обліку робочого часу.");
    }

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void processRecord() {
        System.out.println("TimeRecord.processRecord: загальна обробка запису обліку часу");
    }

    @Override
    public String toString() {
        return "TimeRecord{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", date='" + date + '\'' +
                ", hours=" + hours +
                ", status='" + status + '\'' +
                '}';
    }
}