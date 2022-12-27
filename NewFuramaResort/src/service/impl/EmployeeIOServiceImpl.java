package service.impl;

import model.Person.Employee;
import service.IEmployeeIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeIOServiceImpl  implements IEmployeeIOService {


    @Override
    public List<Employee> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Employee> employeeList = new ArrayList<>();
        while ((line = bufferedReader.readLine())!= null){
            String[] emp = line.split(",");
            Employee employee = new Employee(emp[0],emp[1],emp[2],emp[3],emp[4],emp[5],
                    Integer.parseInt(emp[6]),emp[7],emp[8],Integer.parseInt(emp[9]));
            employeeList.add(employee);
        }
        bufferedReader.close();
        fileReader.close();
        return employeeList;
    }
    @Override
    public void writeFile(String path, List<Employee> employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Employee employee : employeeList){
            bufferedWriter.write(employee.formatCSVEmployee());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
