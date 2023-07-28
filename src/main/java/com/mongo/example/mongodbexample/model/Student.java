package com.mongo.example.mongodbexample.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Document(collection = "students")
public class Student {

    private int id;
    private String name;
    private String dob;
    private float gpa;
    private String branch;


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Student(int id, String name, String dob, float gpa, String branch) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
        this.branch=branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public float getGpa() {
        return gpa;
    }


    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
