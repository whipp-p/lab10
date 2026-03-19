public abstract class Employee {
    private String fio;
    private String email;
    private String phoneNumber;
    private Integer id;

    public Employee(String fio, String email, String phoneNumber, int id) {
        this.fio = fio;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public Employee() {
        this.fio = "standart fio";
        this.email = "standartEmail@mail.ru";
        this.phoneNumber = "89999999999";
        this.id = null;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
