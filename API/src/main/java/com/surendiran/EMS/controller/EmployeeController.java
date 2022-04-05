package com.surendiran.EMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @GetMapping("/get")
    public String getEmployeeName() {
        return "Surendiran S";
    }
}
