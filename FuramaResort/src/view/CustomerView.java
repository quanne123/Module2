package view;

import controller.CustomerController;
import model.person.Customer;
import service.impl.CustomerServiceimpl;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final FuramaVIew furamaVIew = new FuramaVIew();

    private final CustomerController customerController = new CustomerController();

    //    private static final CustomerServiceimpl CUSTOMER_SERVICEIMPL = new CustomerServiceimpl();
    public void CustomerManagement() {
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1: Display list customers");
            System.out.println("2: Add new Customer");
            System.out.println("3: Edit Customer");
            System.out.println("4: Return main menu");
            System.out.println("Enter your Option");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    List<Customer> customerList = this.customerController.getCustomer();
                    for (Customer customer : customerList) {
                        System.out.println(customer);
                    }
                    break;
                case 2:

                    System.out.println("Enter id Customer");
                    int idCustomer = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter Date");
                    String date = sc.nextLine();
                    System.out.println("Enter gender");
                    String gender = sc.nextLine();
                    System.out.println("Enter id Card");
                    String idCard = sc.nextLine();
                    System.out.println("Enter phone");
                    String phone = sc.nextLine();
                    System.out.println("Enter email");
                    String email = sc.nextLine();
                    System.out.println("Enter type Customer ");
                    String typeCustomer = sc.nextLine();
                    System.out.println("Enter address");
                    String address = sc.nextLine();

                    this.customerController.addCustomer(new Customer(name, date, gender, idCard, phone, email, idCustomer, typeCustomer, address));
                    break;
                case 3:
                    System.out.println("Enter new idCustomer");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter new Name ");
                    String newName = sc.nextLine();
                    System.out.println("Enter new date");
                    String newDate = sc.nextLine();
                    System.out.println("Enter a new gender");
                    String newGender = sc.nextLine();
                    System.out.println("Enter new Id Card");
                    String newIdCard = sc.nextLine();
                    System.out.println("Enter new phone");
                    String newPhone = sc.nextLine();
                    System.out.println("Enter new email");
                    String newEmail = sc.nextLine();
                    System.out.println("Enter bew type Customer");
                    String newTypeCustomer = sc.nextLine();
                    System.out.println("Enter new Address");
                    String newAddress = sc.nextLine();

                    this.customerController.editCustomer(new Customer(newName, newDate, newGender, newIdCard, newPhone, newEmail, updateId, newAddress, newTypeCustomer));
                    break;
                case 4:
                    furamaVIew.displayMainMenu();
                    break;
            }

        } while (true);
    }
}
