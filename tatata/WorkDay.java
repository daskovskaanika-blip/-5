package tatata;

public class WorkDay extends TimeRecord {
    protected String start_time;
    protected String end_time;
    protected double hours_worked;

    public WorkDay(int id, int employee_id, String date, String start_time, String end_time, double hours_worked) {
        super(id, employee_id, date, hours_worked, "Active");
        this.start_time = start_time;
        this.end_time = end_time;
        this.hours_worked = hours_worked;
    }

    public void startWork() {
        System.out.println("WorkDay.startWork: початок о " + start_time);
    }

    public void endWork() {
        System.out.println("WorkDay.endWork: кінець о " + end_time);
    }

    @Override
    public void processRecord() {
        System.out.println("WorkDay.processRecord для дати " + getDate());
    }

    @Override
    public String toString() {
        return "WorkDay{id=" + getId() + ", start_time='" + start_time + "', end_time='" + end_time + "', hours_worked=" + hours_worked + "}";
    }
}