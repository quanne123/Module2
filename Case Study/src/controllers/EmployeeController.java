package controllers;

import model.Employee;
import service.IEmployeeIService;
import service.impl.EmployeeService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement(){
        int choice;
        EmployeeService employeeService= new EmployeeService();

        List<Employee> employeeList = new ArrayList<>();
        do{
        Scanner sc = new Scanner(System.in);
        IEmployeeIService iEmployeeIService = new EmployeeService();
        System.out.println("1: Display list employees");
        System.out.println("2: Add new employee");
        System.out.println("3: Delete employee");
        System.out.println("4: Edit employee");
        System.out.println("5: Return main menu");
            choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
               List<Employee> list= iEmployeeIService.getEmployee();
                System.out.println(list);
                break;
            case 2:
                int id;
                while (true){
                    try {
                        System.out.println("Enter id of Employee");
                        id = Integer.parseInt(sc.nextLine());
                        for (Employee employee : employeeList){
                            if (employee.getIdEmployee() == id) {
                                throw new IOException("Enter id again");
                            }
                        }
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("Enter a number");
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Enter name of Employee");
                String name = sc.nextLine();

                System.out.println("Enter date of birth");
                String dateOfBirth = sc.nextLine();

                System.out.println("Enter gender of Employee");
                String gender = sc.nextLine();

                System.out.println("Enter number card of Employee");
                String numberCard = sc.nextLine();

                System.out.println("Enter a phone");
                String phone = sc.nextLine();

                System.out.println("Enter Email");
                String email = sc.nextLine();

                System.out.println("Enter level");
                String level = sc.nextLine();

                System.out.println("Enter location");
                String location = sc.nextLine();

                System.out.println("Enter a Salary ");
                double salary = Double.parseDouble(sc.nextLine());

              employeeService.addEmployee (new Employee(id,name,dateOfBirth,gender,numberCard,phone,email,level,location,salary));



                break;
            case 3:
                System.out.println("Input id");
                int deleteEmployeeId = Integer.parseInt(sc.nextLine());
                iEmployeeIService.deleteEmployee(deleteEmployeeId);
                break;
            case 4:
                System.out.println("Input Id");
                int updateId = Integer.parseInt(sc.nextLine());

                System.out.println("Input new Name");
                String newName = sc.nextLine();

                System.out.println("Input new date of birth");
                String newDateOfBirth = sc.nextLine();

                System.out.println("Input new gender");
                String newGender = sc.nextLine();

                System.out.println("Input new NumberCard");
                String newNumberCard = sc.nextLine();

                System.out.println("Input new phone");
                String newPhone = sc.nextLine();

                System.out.println("Input new email");
                String newEmail = sc.nextLine();

                System.out.println("Input new level");
                String newLevel = sc.nextLine();

                System.out.println("Input new Location");
                String newLocation = sc.nextLine();

                System.out.println("Input new salary");
                double newSalary = Double.parseDouble(sc.nextLine());

                Employee updateEmployee = new Employee(updateId, newName, newDateOfBirth, newGender, newNumberCard, newPhone, newEmail, newLevel, newLocation, newSalary);
                iEmployeeIService.editEmployee(updateEmployee);
                break;

            case 5:
                MainMenu.displayMainMenu();
                break;
            default:
                System.exit(1);
                System.out.println("error");
        }








        }while (choice!=5);
    }
}
