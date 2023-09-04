package com.example.studentmanagmentapp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db=new HashMap<>();
     @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
         db.put(student.getRegNo(),student);
         return"Student has been added Successfully";
    }
  @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
         return db.get(regNo);
  }
  @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo,@RequestParam("name") String name,@RequestParam("age") int newAge){
         db.get(regNo).setName(name);
         db.get(regNo).setAge(newAge);
         return db.get(regNo);
  }
}
