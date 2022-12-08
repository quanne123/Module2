package service;

import model.person.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerIOService {
    List<Customer> readFile(String path,boolean checkFileNotFound) throws IOException;

    void writeFile(String path,List<Customer> customerList) throws IOException;
}
