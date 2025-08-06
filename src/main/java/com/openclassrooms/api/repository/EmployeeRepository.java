package com.openclassrooms.api.repository;

import com.openclassrooms.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Allows you to declare to Spring that a class is a bean to be used
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
