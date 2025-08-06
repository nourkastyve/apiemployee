package com.openclassrooms.api.service;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // Allows you to declare to Spring that a class is a bean to be used
@Data //For automatique management of Geters and setters
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    // Return one employe by Id.
    public Optional<Employee> getEmployee(final Long id){
        return  employeeRepository.findById(id);
    }
    //Return All Employees
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    //Delete Employee
    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }
    // Create employee
    public Employee saveEmployee(Employee employee){
        Employee saveEmployee = employeeRepository.save(employee);
        return saveEmployee;
    }
    // update a employee
    public Employee setEmployee(final Long id, Employee employeeDetails){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Resource Not Found"));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());

        return employeeRepository.save(employee);
    }
}
