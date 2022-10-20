package com.raquelparadinha.lab3_2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raquelparadinha.lab3_2.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}