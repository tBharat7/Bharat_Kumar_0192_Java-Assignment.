package com.mongo.example.mongodbexample.cont;

import com.mongo.example.mongodbexample.model.Student;
import com.mongo.example.mongodbexample.repo.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Controller
@RestController
@RequestMapping("/student")

public class mycont {
    @RequestMapping("/form")
    public String showform(){
        return "Form";
    }
    @Autowired
    private studentrepo studentrepo;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
    Student save=this.studentrepo.save(student);
    return ResponseEntity.ok(save);
    }
//fetch by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getStud(@PathVariable int id){
        return ResponseEntity.ok(this.studentrepo.findById(id));
    }
    //fetch all
    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.studentrepo.findAll());
    }

    @PutMapping("/")
    //populate new value from request to existing object

    public ResponseEntity<?> modifyS(@RequestBody Student student){
        return ResponseEntity.ok(this.updateS(student));
    }
    @DeleteMapping("/{id}")
    //delete
    public String DelS(@PathVariable int id){
        this.studentrepo.deleteById(id);
        return "Student Deleted from DB";
    }


    public Student updateS(Student SRequest){
        if(studentrepo.existsById(SRequest.getId())){
            Student existingS=studentrepo.findById(SRequest.getId());
            existingS.setGpa((SRequest.getGpa()));
            existingS.setBranch((SRequest.getBranch()));
            return studentrepo.save(existingS);}
        else return studentrepo.save(SRequest);
    }
}


