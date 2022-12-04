package service;

import model.Employee;

import java.util.List;

public interface IEmployeeIService extends IService {

    List<Employee> displayEmployee();

    void addEmployee();

    void deleteEmployee(int id);

    void editEmployee(Employee employee);

}
