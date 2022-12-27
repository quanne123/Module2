package controller;

import model.Person.Customer;
import service.impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.List;

public class CustomerController {
    private final CustomerServiceImpl customerService = new CustomerServiceImpl();

    public List<Customer> displayCustomer(){
        try {
            return this.customerService.getCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Customer customer){
        try {
            this.customerService.addCustomer(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void edit(Customer customer){
        try {
            this.customerService.editCustomer(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
