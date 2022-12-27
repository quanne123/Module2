package service.impl;

import model.Person.Employee;
import service.IEmployeeIOService;
import service.IEmployeeService;

import java.io.IOException;
import java.util.List;

public class EmployeeServiceImpl  implements IEmployeeService {
    private final IEmployeeIOService employeeIOService = new EmployeeIOServiceImpl();
    private final String EMPLOYEE_PATH_NAME = "src/data/employee.csv";
    @Override
    public List<Employee> getEmployee() throws IOException {
        return this.employeeIOService.readFile(EMPLOYEE_PATH_NAME);
    }

    @Override
    public void addEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME);
        for (Employee employee1 : employeeList){
            if (employee1.getIdEmployee()== employee.getIdEmployee()){
                System.out.println("id invalid");
                return;
            }
            }
                 employeeList.add(employee);
                 employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);
        }



    @Override
    public void deleteEmployee(int idEmployee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME);
        Employee  deleteId = null;
        for (Employee employee : employeeList){
            if (employee.getIdEmployee() == idEmployee){
                deleteId = employee;
                break;
            }
        }
        if (deleteId == null){
            System.out.println("Error");
        }else {
            employeeList.remove(deleteId);
        }
        employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }

    @Override
    public void editEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME);
        for (Employee employee1 : employeeList){
            if (employee1.getIdEmployee()== employee.getIdEmployee()){
                employee1.setName(employee.getName());
                employee1.setBirthDay(employee.getBirthDay());
                employee1.setGender(employee.getGender());
                employee1.setIdCard(employee.getIdCard());
                employee1.setPhone(employee.getPhone());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
            }
        }
        employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }


}
