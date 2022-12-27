package service;

import model.Person.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerService {

    List<Customer> getCustomer() throws IOException;

    void addCustomer(Customer customer) throws IOException;

    void editCustomer(Customer customer) throws IOException;
}
