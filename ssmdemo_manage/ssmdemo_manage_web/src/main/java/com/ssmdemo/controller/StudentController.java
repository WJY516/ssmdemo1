package com.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @RequestMapping
    public String listStudent(){
        return "student_list";
    }
}
