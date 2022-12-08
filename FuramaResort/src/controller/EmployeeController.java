package controller;

import model.person.Employee;
import service.IEmployeeService;
import service.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class EmployeeController {
    private  final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> getEmployee(){
        try {
            return this.employeeService.getEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(Employee employee){
        try {
            this.employeeService.addEmployee(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id){
        try {
            this.employeeService.deleteEmployee(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void editEmployee(Employee employee){
        try {
            this.employeeService.editEmployee(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
