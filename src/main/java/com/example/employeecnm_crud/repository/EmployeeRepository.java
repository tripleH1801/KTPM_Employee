package com.example.employeecnm_crud.repository;

import com.example.employeecnm_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
