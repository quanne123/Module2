package service.impl;

import model.person.Customer;
import model.person.Employee;
import service.ICustomerIOService;
import view.EmployeeView;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerIOServiceImpl implements ICustomerIOService {
    @Override
    public List<Customer> readFile(String path, boolean checkFileNotFound) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            if (checkFileNotFound){
                throw new FileNotFoundException("not found customer file ");
            }
        }
        file.createNewFile();

        FileReader fileReader = new FileReader(file);
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
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Customer customer : customerList){
            bufferedWriter.write(customer.FormatCSVForCustomer());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
