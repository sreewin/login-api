package com.demo.login_api.controller;

import com.demo.login_api.model.LoginRequest;
import com.demo.login_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginrequest) {
        return ResponseEntity.ok(employeeService.login(loginrequest));
    }
}
