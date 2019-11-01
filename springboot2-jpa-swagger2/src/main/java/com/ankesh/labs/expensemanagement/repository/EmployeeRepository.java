package com.ankesh.labs.expensemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankesh.labs.expensemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
