package com.employeeproject.employeeproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeproject.employeeproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
    public List<Employee> findAllByOrderByLastNameAsc();
}
