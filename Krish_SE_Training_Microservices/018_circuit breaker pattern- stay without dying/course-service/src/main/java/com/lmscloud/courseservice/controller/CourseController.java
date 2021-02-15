package com.lmscloud.courseservice.controller;

import com.lmscloud.courseservice.service.CourseService;
import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/services/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    public Course save(@RequestBody Course course){

        return courseService.save(course);
    }

    @GetMapping(value = "/{id}")
    public Course getCourse(@PathVariable int id){
        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return courseService.findById(id);
    }

    @GetMapping
    public List<Course> getAllCourses(){

        return courseService.findAll();
    }
}
