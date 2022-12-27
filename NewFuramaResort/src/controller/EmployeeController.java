package controller;

import model.Person.Employee;
import service.IEmployeeService;
import service.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> displayEmployee(){
        try {
            return this.employeeService.getEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Employee employee){
        try {
            employeeService.addEmployee(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id){
        try {
            employeeService.deleteEmployee(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void edit(Employee employee){
        try {
            employeeService.editEmployee(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
