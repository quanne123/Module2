package service.impl;

import model.person.Customer;
import service.ICustomerIOService;
import service.ICustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceimpl implements ICustomerService {
    private final String CUSTOMER_PATH_NAME = "src/data/customer.csv";
    private final ICustomerIOService customerIOService = new CustomerIOServiceImpl();
//    private static final List<Customer> customerList = new LinkedList<>();
//    static {
//        Customer customer = new Customer("Hoang","30/4/1996","Nam","201659495",
//                "0905070496","HoangBaodoi@gmail.com",1,"VIP","26 Hai Ho");
//    }

    @Override
    public List<Customer> getCustomer() throws IOException {
        return this.customerIOService.readFile(CUSTOMER_PATH_NAME,true);
    }

    @Override
    public void addCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.customerIOService.readFile(CUSTOMER_PATH_NAME,false);
//        this.customerIOService.readFile(CUSTOMER_PATH_NAME,false);
        for (Customer customer1 : customerList){
            if (customer1.getIdCustomer() == customer.getIdCustomer()){
                System.out.println("Id exist");
                break;
            }
        }
        customerList.add(customer);
        this.customerIOService.writeFile(CUSTOMER_PATH_NAME,customerList);

    }

    public void editCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.customerIOService.readFile(CUSTOMER_PATH_NAME,false);

        for (Customer customer1 : customerList){
            if (customer1.getIdCustomer()==customer.getIdCustomer()){
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setIdCard(customer.getIdCard());
                customer1.setPhone(customer.getPhone());
                customer1.setEmail(customer.getEmail());
                customer1.setTypeCustomer(customer.getTypeCustomer());
                customer1.setAddress(customer.getAddress());

            }else {
                System.out.println("Error");
            }
        }
        this.customerIOService.writeFile(CUSTOMER_PATH_NAME,customerList);

    }
}
