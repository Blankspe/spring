package com.sangeng.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private String name;
    private Integer age;

    private List<Student> list;
    public Student(){
        System.out.println("Student类被实例化了");
    }
}
