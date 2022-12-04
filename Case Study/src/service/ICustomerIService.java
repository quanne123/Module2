package service;

import model.Customer;

public interface ICustomerIService extends IService {
    void displayCustomer();

    void addCustomer();

    void editCustomer(Customer customer);


}
