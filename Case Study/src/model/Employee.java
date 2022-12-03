package model;

public class Employee extends Person {
    private int idEmployee;
    private String level;
    private String location;

    private double salary;

    public Employee() {
    }

    public Employee(int idEmployee, String name, String dateOfBirth, String gender, String numberCard, String phone, String email, String level, String location,double salary) {
        super( name, dateOfBirth, gender, numberCard, phone, email);
        this.level = level;
        this.location = location;
        this.idEmployee = idEmployee;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                "} " + super.toString();
    }
}
