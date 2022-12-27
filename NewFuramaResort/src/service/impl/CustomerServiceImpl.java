package service.impl;

import model.Person.Customer;
import service.ICustomerIOService;
import service.ICustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerIOService customerIOService = new CustomerIOServiceImpl();
    private final String CUSTOMER_PATH_NAME = "src/data/customer.csv";


    @Override
    public List<Customer> getCustomer() throws IOException {
        return this.customerIOService.readFile(CUSTOMER_PATH_NAME);
    }

    @Override
    public void addCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.customerIOService.readFile(CUSTOMER_PATH_NAME);
        for (Customer customer1 : customerList){
            if (customer1.getIdCustomer()==customer.getIdCustomer()){
                System.out.println("id invalid");
                return;
            }
        }
        customerList.add(customer);
        this.customerIOService.writeFile(CUSTOMER_PATH_NAME,customerList);
    }

    @Override
    public void editCustomer(Customer customer) throws IOException {
        List<Customer> customerList = this.customerIOService.readFile(CUSTOMER_PATH_NAME);
        for (Customer customer1 : customerList){
            if (customer1.getIdCustomer()==customer.getIdCustomer()){
                customer1.setName(customer.getName());
                customer1.setBirthDay(customer.getBirthDay());
                customer1.setGender(customer.getGender());
                customer1.setIdCard(customer.getIdCard());
                customer1.setPhone(customer.getPhone());
                customer1.setEmail(customer.getEmail());
                customer1.setTypeCustomer(customer.getTypeCustomer());
                customer1.setAddress(customer.getAddress());
            }
        }
        this.customerIOService.writeFile(CUSTOMER_PATH_NAME,customerList);

    }
}
