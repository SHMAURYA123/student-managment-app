package com.example.studentmanagmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    Map<Integer,Student> db=new HashMap<>();
     @GetMapping("/get")
    public Student getStudent( @RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }
    @PostMapping("/add")
    public String addStudent( @RequestBody Student student){
        return studentService.addStudent(student);

    }
  @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
     return studentService.getStudentUsingPath(regNo);
  }
  @PutMapping("/update-age/{id}")
    public Student updateAge(@PathVariable("id") int regNo,@RequestParam("age") int newAge){
         return studentService.updateAge(regNo,newAge);

  }
}
