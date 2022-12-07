package service;

import model.Employee;

import java.util.List;

public interface IEmployeeIService extends IService {

    List<Employee> getEmployee();

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void editEmployee(Employee employee);

}
