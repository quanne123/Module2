package service;

import model.Customer;

import java.util.List;

public interface ICustomerIService extends IService {
   List<Customer> getCustomer();

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);


}
