package service.impl;

import model.Customer;
import service.ICustomerIService;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerIService {
//    int idCustomer, String name, String dateOfBirth, String gender, String numberCard, String phone, String email, String typeCustomer, String address) {
//        super( name, dateOfBirth, gender, numberCard, phone, email);


    private static final Scanner sc = new Scanner(System.in);

    public static List<Customer> customers = new LinkedList<>();


    @Override
    public List<Customer> getCustomer() {
      return customers;

    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

//        int id;
//        while (true){
//            try {
//                System.out.println("Enter id of Customer");
//                id = Integer.parseInt(sc.nextLine());
//                for (Customer customer : customers){
//                    if (customer.getIdCustomer()== id){
//                        throw new IOException("Enter again");
//                    }
//                }
//                break;
//            }catch (NumberFormatException e){
//                System.out.println("Enter a number");
//            }catch (IOException e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//        System.out.println("Enter name of Customer");
//        String name = sc.nextLine();
//
//        System.out.println("Enter Date of Birth");
//        String dateOfBirth = sc.nextLine();
//
//        System.out.println("Enter your gender");
//        String gender = sc.nextLine();
//
//        System.out.println("Enter your number Card");
//        String numberCard = sc.nextLine();
//
//        System.out.println("Enter yout Phone");
//        String phone = sc.nextLine();
//
//        System.out.println("Enter your Email");
//        String email = sc.nextLine();
//
//        System.out.println("Enter your TypeCustomer");
//        String type = sc.nextLine();
//
//        System.out.println("Enter your address");
//        String address = sc.nextLine();
//
//        customers.add(new Customer(id,name,dateOfBirth,gender,numberCard,phone,email,type,address));
//
//    }

    @Override
    public void editCustomer(Customer customer) {


        for (Customer customer1 : customers){
            if (customer1.getIdCustomer()== customer.getIdCustomer()){
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setNumberCard(customer.getNumberCard());
                customer1.setPhone(customer.getPhone());
                customer1.setEmail(customer.getEmail());
                customer1.setTypeCustomer(customer.getTypeCustomer());
                customer1.setAddress(customer.getAddress());
            }
        }


    }
}
