package view;

import controller.EmployeeController;
import model.Person.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final EmployeeController employeeController = new EmployeeController();
    private final Scanner sc = new Scanner(System.in);

    public void displayEmployeeManagement() {
        do {
            System.out.println("1: Display Employee");
            System.out.println("2: Add Employee");
            System.out.println("3: Delete Employee");
            System.out.println("4: Edit Employee");
            System.out.println("5: Return main menu");
            System.out.println("Enter your option");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){

                case 1:
                    List<Employee> employeeList = this.employeeController.displayEmployee();
                    for (Employee employee : employeeList){
                        System.out.println(employee);
                    }
                    break;
                case 2:
//                    String name, String birthDay, String gender, String idCard, String phone, String email
//            , int idCustomer, String level, String position, int salary
                    System.out.println("Enter Name");
                    String nameEmp = sc.nextLine();

                    System.out.println("Enter BirthDay");
                    String dateEmp = sc.nextLine();

                    System.out.println("Enter gender");
                    String gender = sc.nextLine();

                    System.out.println("Enter id card");
                    String idCardEmp = sc.nextLine();

                    System.out.println("Enter phone ");
                    String phoneEmp = sc.nextLine();

                    System.out.println("Enter email");
                    String emailEmp = sc.nextLine();

                    System.out.println("Enter id ");
                    int idEmp = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter level");
                    String level = sc.nextLine();

                    System.out.println("Enter position");
                    String position = sc.nextLine();

                    System.out.println("Enter salary");
                    int salary = Integer.parseInt(sc.nextLine());

                    this.employeeController.add(new Employee(nameEmp,dateEmp,gender,idCardEmp,phoneEmp,emailEmp,idEmp,level,position,salary));
                    break;
                case 3:
                    System.out.println("Enter id you want to delete");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    this.employeeController.delete(deleteId);
                    break;
                case 4:
                    System.out.println("Enter id you want to edit");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new Name");
                    String newNameEmp = sc.nextLine();

                    System.out.println("Enter new date");
                    String newDateEmp = sc.nextLine();

                    System.out.println("Enter new gender");
                    String newGenderEmp = sc.nextLine();

                    System.out.println("Enter new id Card");
                    String newIdCard = sc.nextLine();

                    System.out.println("Enter new Phone");
                    String newPhoneEmp = sc.nextLine();

                    System.out.println("Enter new email");
                    String newEmailEmp = sc.nextLine();

                    System.out.println("Enter new Level");
                    String newLevel = sc.nextLine();

                    System.out.println("Enter new position");
                    String newPosition = sc.nextLine();

                    System.out.println("Enter new salary");
                    int newSalary = Integer.parseInt(sc.nextLine());

                    this.employeeController.edit(new Employee(newNameEmp,newDateEmp,newGenderEmp,newIdCard,newPhoneEmp,newEmailEmp,updateId,newLevel,newPosition,newSalary));
                    break;
                case 5:
                    FuramaView furamaView = new FuramaView();
                    furamaView.displayMainmenu();
            }

        }while (true);


    }
}
