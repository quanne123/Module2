package service;

import model.Employee;

public interface IEmployeeIService extends IService {

    void displayEmployee();

    void addEmployee();

    void deleteEmployee(int id);

    void editEmployee(Employee employee);

}
