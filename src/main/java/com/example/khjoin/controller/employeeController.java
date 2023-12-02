package com.example.khjoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class employeeController {

    @GetMapping("/employeeList")
    public String employeeList(){
        return "employee/employeeList";
    }

}
