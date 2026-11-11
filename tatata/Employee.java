package tatata;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String position;
    private ContactInfo contactInfo; // Використання вкладеного класу

    // Вкладений клас для збереження додаткової інформації
    public static class ContactInfo {
        private String email;
        private String phone;

        public ContactInfo(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "ContactInfo{email='" + email + "', phone='" + phone + "'}";
        }
    }

    public Employee(int id, String first_name,
                    String last_name, String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.contactInfo = new ContactInfo("default@company.com", "000-000-00-00");
    }

    // Статичний метод у базовому класі
    public static void printClassInfo() {
        System.out.println("Employee: базовий клас для представлення працівника компанії.");
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void showInfo() {
        System.out.println(this + ", " + contactInfo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}