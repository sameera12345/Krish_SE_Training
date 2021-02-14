package com.lmscloud.profileservice.controller;

import com.lmscloud.profileservice.service.StudentService;
import com.sameera.lmscloud.commons.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int profileId){
        Student student = studentService.fetchStudentById(profileId);

        if (student == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(student);
        }
    }

    @RequestMapping(value = "profiles")
    public List<Student> getAllStudent(){

        return studentService.getAllStudent();
    }
}
