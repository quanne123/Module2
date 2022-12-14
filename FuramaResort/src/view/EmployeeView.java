package view;

import controller.EmployeeController;
import model.person.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    private final FuramaVIew furamaVIew = new FuramaVIew();
    private final EmployeeController employeeController = new EmployeeController();

    public void displayMenuEmployee() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: Display Employee");
            System.out.println("2: Add new Employee");
            System.out.println("3: Delete employee");
            System.out.println("4: Edit employee");
            System.out.println("5: Return main menu");
            System.out.println("Enter your option:");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    List<Employee> employeeList = this.employeeController.getEmployee();

                    for (Employee employee : employeeList){
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    System.out.println("Enter id Employee");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter date Of Birth");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Enter gender");
                    String gender = sc.nextLine();
                    System.out.println("Enter id card");
                    String idCard = sc.nextLine();
                    System.out.println("Enter a phone ");
                    String phone = sc.nextLine();
                    System.out.println("Enter email");
                    String email = sc.nextLine();
                    System.out.println("Enter level");
                    String level = sc.nextLine();
                    System.out.println("Enter positon");
                    String position = sc.nextLine();
                    System.out.println("Enter Salary");
                    int salary = Integer.parseInt(sc.nextLine());

                  this.employeeController.addEmployee(new Employee(name, dateOfBirth, gender, idCard
                            , phone, email, level, position, salary, id));
                    break;
                case 3:
                    System.out.println("Enter id");
                    int newid = Integer.parseInt(sc.nextLine());
                    this.employeeController.deleteEmployee(newid);
                    break;
                case 4:
                    System.out.println("Enter id ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new Name");
                    String newName = sc.nextLine();
                    System.out.println("Enter new date");
                    String newDate = sc.nextLine();
                    System.out.println("Enter new Gender");
                    String newGender = sc.nextLine();
                    System.out.println("Enter new Id Card");
                    String newIdCard = sc.nextLine();
                    System.out.println("Enter new Phone");
                    String newPhone = sc.nextLine();
                    System.out.println("Enter new email");
                    String newEmail = sc.nextLine();
                    System.out.println("Enter new Level");
                    String newLevel = sc.nextLine();
                    System.out.println("Enter new Positon");
                    String newPosition = sc.nextLine();
                    System.out.println("Enter new Salary");
                    int newSalary = Integer.parseInt(sc.nextLine());

                    this.employeeController.editEmployee(new Employee(newName, newDate, newGender, newIdCard
                            , newPhone, newEmail, newLevel, newPosition, newSalary, updateId));
                    break;
                case 5:
                    furamaVIew.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
