package com.lmscloud.profileservice.controller;

import com.lmscloud.profileservice.service.StudentService;
import com.sameera.lmscloud.commons.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student fetchStudent(@PathVariable(value = "id") int studentId){
        return studentService.fetchStudentById(studentId);
    }

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Student> getAllStudent(){

        return studentService.getAllStudent();
    }
}
