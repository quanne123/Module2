package service.impl;

import model.Person.Customer;
import service.ICustomerIOService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerIOServiceImpl implements ICustomerIOService {


    @Override
    public List<Customer> readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Customer> customerList = new LinkedList<>();
        while ((line = bufferedReader.readLine())!= null){
            String[] cus = line.split(",");
            Customer customer = new Customer(cus[0],cus[1],cus[2],cus[3],cus[4],cus[5],Integer.parseInt(cus[6]),cus[7],cus[8]);
            customerList.add(customer);
        }
        bufferedReader.close();
        fileReader.close();
        return customerList;
    }

    @Override
    public void writeFile(String path, List<Customer> customerList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Customer customer : customerList){
            bufferedWriter.write(customer.formatCSVCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
