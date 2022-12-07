package service.impl;

import model.Employee;
import service.IEmployeeIService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeIService {
    private static final Scanner sc = new Scanner(System.in);

    public static List<Employee> employeeList = new ArrayList<>();
    @Override
    public  List<Employee> getEmployee() {
            return employeeList;
        }




    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);

//        int id;
//        while (true){
//            try {
//            System.out.println("Enter id of Employee");
//            id = Integer.parseInt(sc.nextLine());
//            for (Employee employee : employeeList){
//                if (employee.getIdEmployee() == id) {
//                        throw new IOException("Enter id again");
//                    }
//                }
//            break;
//            }catch (NumberFormatException e){
//                System.out.println("Enter a number");
//            }catch (IOException e){
//                System.out.println(e.getMessage());
//            }
//        }
//        System.out.println("Enter name of Employee");
//        String name = sc.nextLine();
//
//        System.out.println("Enter date of birth");
//        String dateOfBirth = sc.nextLine();
//
//        System.out.println("Enter gender of Employee");
//        String gender = sc.nextLine();
//
//        System.out.println("Enter number card of Employee");
//        String numberCard = sc.nextLine();
//
//        System.out.println("Enter a phone");
//        String phone = sc.nextLine();
//
//        System.out.println("Enter Email");
//        String email = sc.nextLine();
//
//        System.out.println("Enter level");
//        String level = sc.nextLine();
//
//        System.out.println("Enter location");
//        String location = sc.nextLine();
//
//        System.out.println("Enter a Salary ");
//        double salary = Double.parseDouble(sc.nextLine());
//
//        employeeList.add(new Employee(id,name,dateOfBirth,gender,numberCard,phone,email,level,location,salary));



    }

    @Override
    public void deleteEmployee(int id) {
        Employee deleteEmployee = null;


        for (Employee employee : employeeList){
            if (employee.getIdEmployee()== id){
                deleteEmployee = employee;
                break;
            }
        }
        if (deleteEmployee == null) {
            System.out.println("khong tim thay");
        }
        employeeList.remove(deleteEmployee);

    }

    @Override
    public void editEmployee(Employee employee) {


        for (Employee employee1 : employeeList ){
            if (employee1.getIdEmployee() == employee.getIdEmployee()){
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setNumberCard(employee.getNumberCard());
                employee1.setPhone(employee.getPhone());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setLocation(employee.getLocation());
                employee1.setSalary(employee.getSalary());
                break;

            }

        }

    }
}
