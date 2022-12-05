package controllers;

import model.Employee;
import service.IEmployeeIService;
import service.impl.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement(){
        int choice;
//        List<Employee> employeeList = new ArrayList<>();
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
               List<Employee> list= iEmployeeIService.displayEmployee();
                System.out.println(list);
                break;
            case 2:
                iEmployeeIService.addEmployee();
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
