package com.lmscloud.studentservice.controller;

import com.lmscloud.studentservice.service.StudentService;
import com.sameera.lmscloud.commons.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/services/students")
public class StudentServiceController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable int id){

        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return studentService.findById(id);
    }

    @GetMapping
    public List<Student> getAllStudent(){

        return studentService.findAll();
    }
}
