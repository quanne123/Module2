package service;

import model.Person.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IEmployeeIOService {

    List<Employee> readFile(String path) throws IOException;

    void writeFile(String path,List<Employee> employeeList) throws IOException;
}
