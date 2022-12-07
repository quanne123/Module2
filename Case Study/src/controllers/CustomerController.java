package controllers;

import model.Customer;
import service.ICustomerIService;
import service.impl.CustomerService;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class CustomerController {
    public static void CustomerManagement() {
        Scanner sc = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        List<Customer> customers = new LinkedList<>();
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
                   List<Customer> list= iCustomerIService.getCustomer();
                    System.out.println(list);
                    break;
                case 2:
                    int id;
                    while (true){
                        try {
                            System.out.println("Enter id of Customer");
                            id = Integer.parseInt(sc.nextLine());
                            for (Customer customer : customers){
                                if (customer.getIdCustomer()== id){
                                    throw new IOException("Enter again");
                                }
                            }
                            break;
                        }catch (NumberFormatException e){
                            System.out.println("Enter a number");
                        }catch (IOException e){
                            System.out.println(e.getMessage());
                        }

                    }
                    System.out.println("Enter name of Customer");
                    String name = sc.nextLine();

                    System.out.println("Enter Date of Birth");
                    String dateOfBirth = sc.nextLine();

                    System.out.println("Enter your gender");
                    String gender = sc.nextLine();

                    System.out.println("Enter your number Card");
                    String numberCard = sc.nextLine();

                    System.out.println("Enter yout Phone");
                    String phone = sc.nextLine();

                    System.out.println("Enter your Email");
                    String email = sc.nextLine();

                    System.out.println("Enter your TypeCustomer");
                    String type = sc.nextLine();

                    System.out.println("Enter your address");
                    String address = sc.nextLine();

                   customerService.addCustomer (new Customer(id,name,dateOfBirth,gender,numberCard,phone,email,type,address));

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
