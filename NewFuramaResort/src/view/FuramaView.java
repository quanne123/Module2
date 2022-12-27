package view;

import java.util.Scanner;

public class FuramaView {
    private final EmployeeView employeeView = new EmployeeView();
    private final FacilityView facilityView = new FacilityView();


    public void displayMainmenu(){
        CustomerView customerView = new CustomerView();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: Employee Management");
            System.out.println("2: Customer Management");
            System.out.println("3: Facility Management");
            System.out.println("4: Booking Management");
            System.out.println("5: Promotion Management");
            System.out.println("6: Exit");
            System.out.println("Enter your option");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    employeeView.displayEmployeeManagement();
                    break;
                case 2:
                    customerView.displayMenuCustomer();
                    break;
                case 3:
                    facilityView.displayFacilityMainMenu();


            }
        }while ( true);

    }
}
