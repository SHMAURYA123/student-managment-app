package com.example.studentmanagmentapp;

public class Student {
    private  int regNo;
    private int age;
    private String name;
    private String course;

    public Student() {
    }

    public Student(int regNo, int age, String name, String course){
       this.regNo = regNo;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
