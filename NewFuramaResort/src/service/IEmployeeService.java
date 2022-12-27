package service;

import model.Person.Employee;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployee() throws IOException;

    void addEmployee(Employee employee) throws IOException;

    void deleteEmployee(int idEmployee) throws IOException;

    void editEmployee(Employee employee) throws IOException;

}
