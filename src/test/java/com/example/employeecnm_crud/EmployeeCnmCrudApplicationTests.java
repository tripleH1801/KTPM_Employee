package com.example.employeecnm_crud;

import com.example.employeecnm_crud.entity.Employee;
import com.example.employeecnm_crud.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeCnmCrudApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    public void getAll() {
        System.out.println("getAll: " + employeeRepository.findAll());
    }
    @Test
    public void add() {
        Employee employee = new Employee(1, "Ha", "Hoang");
        System.out.println("Add: " + employeeRepository.save(employee));
    }

    @Test
    public void update() {
        Employee employee = employeeRepository.findById(1).get();
        employee.setFirstName("TEst ");
        System.out.println("Update: " + employeeRepository.save(employee));
    }

    @Test
    public void delete() {
        employeeRepository.deleteById(1);
    }

}
