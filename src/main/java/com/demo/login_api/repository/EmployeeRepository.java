package com.demo.login_api.repository;

import com.demo.login_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT employee FROM Employee employee " +
            "WHERE employee.mobile = :mobile")
    Employee getByMobile(String mobile);
}
