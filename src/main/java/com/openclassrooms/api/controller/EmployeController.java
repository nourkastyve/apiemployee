package com.openclassrooms.api.controller;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> setEmployee(@PathVariable Long id,  @RequestBody Employee employeeDetails){
        try{
            Employee updateEmplyee = employeeService.setEmployee(id, employeeDetails);
            return ResponseEntity.ok(updateEmplyee);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    @PutMapping
    public Employee saveEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @DeleteMapping("employee/{id}")
    public ResponseEntity<Employee> deleteEmployee(Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
