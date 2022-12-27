package model.Person;

public class Employee  extends Person{
    private int idEmployee;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String birthDay, String gender, String idCard, String phone, String email, int idEmployee, String level, String position, int salary) {
        super(name, birthDay, gender, idCard, phone, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public  String formatCSVEmployee(){
        return this.formatCSVPerson() + "," + this.idEmployee + "," + this.level +"," + this.position + "," + this.position;
    }
}
