package service.impl;

import model.person.Employee;
import service.IEmployeeIOService;
import service.IEmployeeService;

import java.io.IOException;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
//    private static final List<Employee> employeeList = new ArrayList<>();
    private final String EMPLOYEE_PATH_NAME = "src/data/employee.csv";
    private final IEmployeeIOService employeeIOService = new EmployeeIOServiceImpl();


    @Override
    public List<Employee> getEmployee() throws IOException {
        return this.employeeIOService.readFile(EMPLOYEE_PATH_NAME,true);
    }

    @Override
    public void addEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME,false);
        for (Employee employee1 : employeeList){
            if (employee1.getIdEmployee()==employee.getIdEmployee()){
                System.out.println("Id  Existed");
                break;
            }
        }
        employeeList.add(employee);
        this.employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);

    }

    @Override
    public void deleteEmployee(int idEmployee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME,false);
        Employee deleteEmployee = null;
        for (Employee employee1 : employeeList) {
            if (employee1.getIdEmployee() == idEmployee) {
                deleteEmployee = employee1;
                break;
            }
        }
        if (deleteEmployee == null){
            System.out.println("Error");
        }else {
            employeeList.remove(deleteEmployee);
            this.employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);
        }
    }

    @Override
    public void editEmployee(Employee employee) throws IOException {
        List<Employee> employeeList = this.employeeIOService.readFile(EMPLOYEE_PATH_NAME,false);
        for (Employee employee1 : employeeList) {
            if (employee1.getIdEmployee() == employee.getIdEmployee()) {
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setIdCard(employee.getIdCard());
                employee1.setPhone(employee.getPhone());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
            } else {
                System.out.println("Invalid id");
            }
        }
        this.employeeIOService.writeFile(EMPLOYEE_PATH_NAME,employeeList);
    }
}
