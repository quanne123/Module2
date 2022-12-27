package service;

import model.Person.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ICustomerIOService {
    List<Customer> readFile(String path) throws IOException;

    void writeFile(String path,List<Customer> customerList) throws IOException;
}
