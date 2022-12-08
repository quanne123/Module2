package controller;

import model.person.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceimpl;

import java.io.IOException;
import java.util.List;

public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceimpl();

    public List<Customer> getCustomer() {
        try {
            return this.customerService.getCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addCustomer(Customer customer){
        try {
            this.customerService.addCustomer(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editCustomer(Customer customer){
        try {
            this.customerService.EditCustomer(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
