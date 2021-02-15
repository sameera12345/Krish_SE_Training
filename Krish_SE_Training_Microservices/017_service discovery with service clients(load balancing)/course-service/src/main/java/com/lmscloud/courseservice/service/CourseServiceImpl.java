package com.lmscloud.courseservice.service;

import com.lmscloud.courseservice.repository.CourseRepository;
import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course save(Course student) {
        return courseRepository.save(student);
    }

    @Override
    public Course findById(int id){
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()){
            return course.get();
        }else{
            return new Course();
        }

    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}