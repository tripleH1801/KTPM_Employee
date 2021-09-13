package com.example.employeecnm_crud.repository;

import com.example.employeecnm_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into employee(first_name, last_name) values(?1,?2)", nativeQuery = true)
    void addEmployee(String firstName,String lastName);

    @Transactional
    @Modifying
    @Query(value = "update employee set first_name = ?2,last_name = ?3 where id = ?1", nativeQuery = true)
    void updateEmployee(int id, String firstName,String lastName);

    @Transactional
    @Modifying
    @Query(value = "delete from employee where id = ?1", nativeQuery = true)
    void deleteemployee(int id);
}
