package controllers;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        MainMenu.displayMainMenu();
    }


        public static void displayMainMenu() {
            Scanner sc = new Scanner(System.in);
            int choice;
            do {

                System.out.println("1: Employee Management");
                System.out.println("2: Customer Management");
                System.out.println("3: Facility Management");
                System.out.println("4: Booking Management");
                System.out.println("5: Promotion Management");
                System.out.println("6: Exit");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        EmployeeController.employeeManagement();
                        break;

                    case 2:
                        CustomerController.CustomerManagement();
                        break;
                    case 3:
                        FacilityController.facilityManagement();
                        break;
                    case 4:
                        BookingManagement.BookingManagement();
                        break;
                    case 5:
                        PromotionController.promotionManagement();
                        break;
                    case 6:
                        System.exit(1);
                    default:
                        System.out.println("Invalid Choice");


                        break;
                }


            } while (choice != 6);
        }



}
