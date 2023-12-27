package com.sangeng.controller;

import com.sangeng.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private Student student;

    @GetMapping("/test")
    public String test(){
        List<Student> list= student.getList();
        for(Student one:list){
            System.out.println(one.getName());
            System.out.println(one.getAge());
        }
        return "test";
    }
}
