package view;

import common.RegularException;
import common.Validate;
import controller.CustomerController;
import model.Person.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner sc = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();

    public void displayMenuCustomer() {

        do {
            System.out.println("1: Display Customer");
            System.out.println("2: Add Customer");
            System.out.println("3: Edit Customer");
            System.out.println("4 Return Main Menu");
            int option = Integer.parseInt(sc.nextLine());
            String typeCustomer;

            switch (option) {

                case 1:
                    List<Customer> customerList = this.customerController.displayCustomer();
                    for (Customer customer : customerList) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("Enter id Customer");
                    int idCustomer = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter Customer Name");
                    String nameCus = sc.nextLine();

                    System.out.println("Enter Customer Date");
                    String dateCus = sc.nextLine();

                    System.out.println("Enter Customer gender");
                    String genderCus = sc.nextLine();

                    System.out.println("Enter Customer id Card");
                    String idCardCus = sc.nextLine();

                    System.out.println("Enter Customer phone");
                    String phoneCus = sc.nextLine();

                    System.out.println("Enter Customer email");
                    String emailCus = sc.nextLine();

                    do {
                        try {
                            System.out.println("Enter Type Customer");
                            typeCustomer = sc.nextLine();
                            Validate.setTypeCustomerRegex(typeCustomer);
                            break;
                        } catch (RegularException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    System.out.println("Enter address");
                    String address = sc.nextLine();

                    this.customerController.add(new Customer(nameCus, dateCus, genderCus, idCardCus, phoneCus, emailCus, idCustomer
                            , typeCustomer, address));
                    break;
                case 3:
                    System.out.println("Enter id you want to Edit");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new Name");
                    String newNameCus = sc.nextLine();
                    System.out.println("Enter new date");
                    String newDateCus = sc.nextLine();
                    System.out.println("Enter new gender");
                    String newGenderCus = sc.nextLine();
                    System.out.println("Enter new id Card");
                    String newIdCardCus = sc.nextLine();
                    System.out.println("Enter new phone");
                    String newPhoneCus = sc.nextLine();
                    System.out.println("Enter new Email");
                    String newEmailCus = sc.nextLine();
                    System.out.println("Enter new type");
                    String newTypeCus = sc.nextLine();
                    System.out.println("Enter new Address");
                    String newAddress = sc.nextLine();

                    this.customerController.edit(new Customer(newNameCus, newDateCus, newGenderCus, newIdCardCus, newPhoneCus, newEmailCus, updateId, newTypeCus, newAddress));
                    break;
                case 4:
                    FuramaView furamaView = new FuramaView();
                    furamaView.displayMainmenu();
                    break;
            }
        } while (true);
    }
}
