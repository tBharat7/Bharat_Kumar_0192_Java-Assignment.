package com.mongo.example.mongodbexample.service;

import com.mongo.example.mongodbexample.model.Student;
import org.springframework.stereotype.Service;
import com.mongo.example.mongodbexample.repo.studentrepo;

@Service
public class studentser {
    private studentrepo studentrepo;
//    public Student updateS(Student SRequest){
//        if(studentrepo.existsById(SRequest.getId())){
//        Student existingS=studentrepo.findById(SRequest.getId());
////        existingS.setName(SRequest.getName());
////        existingS.setDob(SRequest.getDob());
//        existingS.setGpa((SRequest.getGpa()));
//        existingS.setBranch((SRequest.getBranch()));
//        return studentrepo.save(existingS);}
//        else return ;
//    }
}
