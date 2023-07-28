package com.mongo.example.mongodbexample.repo;

import com.mongo.example.mongodbexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepo extends MongoRepository<Student, Integer> {

    Student findById(int id);
}
