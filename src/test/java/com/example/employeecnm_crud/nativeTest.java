package com.example.employeecnm_crud;

import com.example.employeecnm_crud.entity.Employee;
import com.example.employeecnm_crud.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class nativeTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    public void getAll() {
        System.out.println("getAll: " + employeeRepository.getAll());
    }
    @Test
    public void add() {
        employeeRepository.addEmployee("Test2 ", "Test1");
    }
    @Test
    public void update() {
        Employee employee = employeeRepository.findById(2).get();
        employeeRepository.updateEmployee(2, "new name1 ", "new name2");
    }

    @Test
    public void delete() {
        employeeRepository.deleteemployee(2);
    }
}
