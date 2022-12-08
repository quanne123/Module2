package service;

import model.person.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomer() throws IOException;

    void addCustomer(Customer customer) throws IOException;

    void EditCustomer(Customer customer) throws IOException;




}
