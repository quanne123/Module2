package service;

import model.person.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IEmployeeIOService {

    List<Employee> readFile(String path, boolean checkFileNotFound) throws IOException;

    void writeFile(String path, List<Employee> employeeList) throws IOException;

}
