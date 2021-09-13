package com.example.employeecnm_crud.repository;

import com.example.employeecnm_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query("select e from Employee e")
    List<Employee> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into employee(first_name,last_name) values(?1,?2)", nativeQuery = true)
    void addEmployee(String firstName, String lastName);

    @Transactional
    @Modifying
    @Query(value = "update Employee e set e.firstName=?2, e.lastName=?3 where e.id = ?1")
    void updateEmployee(int id ,String firstName, String lastName);

    @Transactional
    @Modifying
    @Query("delete from Employee e where e.id = ?1")
    void deleteEmployee(int id);
}
