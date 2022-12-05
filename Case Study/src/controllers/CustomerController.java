package controllers;

import model.Customer;
import service.ICustomerIService;
import service.impl.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void CustomerManagement() {
        Scanner sc = new Scanner(System.in);
        ICustomerIService iCustomerIService = new CustomerService();
        int choice;
        do {


            System.out.println("1: Display list customers");
            System.out.println("2: Add new customer");
            System.out.println("3: Edit customer");
            System.out.println("4: Return main menu");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                   List<Customer> list= iCustomerIService.displayCustomer();
                    System.out.println(list);
                    break;
                case 2:
                    iCustomerIService.addCustomer();
                    break;
                case 3:
                    System.out.println("input Id ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new name");
                    String newName = sc.nextLine();

                    System.out.println("Enter new date of Birth");
                    String newDateOfBirth = sc.nextLine();

                    System.out.println("Enter new gender");
                    String newGender = sc.nextLine();

                    System.out.println("Enter new NumberCard");
                    String newNumberCard = sc.nextLine();

                    System.out.println("Enter new Phone");
                    String newPhone = sc.nextLine();

                    System.out.println("Enter new Email");
                    String newEmail = sc.nextLine();

                    System.out.println("Enter new Type");
                    String newType = sc.nextLine();

                    System.out.println("Enter new Address");
                    String newAddress = sc.nextLine();

                    Customer updateCustomer = new Customer(updateId, newName, newDateOfBirth, newGender, newNumberCard, newPhone, newEmail, newType, newAddress);
                    iCustomerIService.editCustomer(updateCustomer);
                    break;
                case 4:
                    MainMenu.displayMainMenu();
                    break;
            }


        } while (true);
    }
}
