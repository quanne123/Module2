package service.impl;

import model.Employee;
import service.IEmployeeIoService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeIoServiceImpl implements IEmployeeIoService {
    @Override
    public List<Employee> readFile(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Employee> employeeList = new ArrayList<>();

        while ((line = bufferedReader.readLine())!= null ){
            String [] emp = line.split(",");
            Employee employee = new Employee(Integer.parseInt(emp[0]),emp[1],emp[2] );
            employeeList.add(employee);

        }
        bufferedReader.close();
        fileReader.close();

        return employeeList;

    }

    @Override
    public void writeFile(String path, List<Employee> employeeList) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Employee employee : employeeList){
            bufferedWriter.write(employee.FormatCSVForEmployee());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();

    }
}
