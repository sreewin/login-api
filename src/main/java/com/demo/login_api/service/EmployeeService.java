package com.demo.login_api.service;

import com.demo.login_api.entity.Employee;
import com.demo.login_api.model.LoginRequest;
import com.demo.login_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public String login(LoginRequest loginRequest){
        Employee employee = employeeRepository.getByMobile(loginRequest.getMobile());
        if(ObjectUtils.isEmpty(employee)) {
            return "Invalid User";
        } else {
            return (employee.getPassword().equals(loginRequest.getPassword())) ? "Login success full." : "Mobile and password mismatched";
        }
    }
}
