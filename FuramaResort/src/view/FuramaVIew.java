package view;

import java.util.Scanner;

public class FuramaVIew {
//    public final EmployeeView employeeView = new EmployeeView();


    public  void displayMainMenu() {
        CustomerView customerView = new CustomerView();
        EmployeeView employeeView = new EmployeeView();

        Scanner sc = new Scanner(System.in);
        int option;

        do {


            System.out.println("1: Employee Management");
            System.out.println("2: Customer Management");
            System.out.println("3: Facility Management");
            System.out.println("4: Booking Management");
            System.out.println("5: Promotion Management");
            System.out.println("6: Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                   employeeView.EmployeeManagement();
                    break;
                case 2:
                    customerView.CustomerManagement();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (option != 6);
    }
}
