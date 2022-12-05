package service;

import model.Customer;

import java.util.List;

public interface ICustomerIService extends IService {
   List<Customer> displayCustomer();

    void addCustomer();

    void editCustomer(Customer customer);


}
