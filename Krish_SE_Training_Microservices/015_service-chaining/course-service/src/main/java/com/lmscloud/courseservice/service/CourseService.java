package com.lmscloud.courseservice.service;

import com.sameera.lmscloud.commons.model.course.Course;

import java.util.List;

public interface CourseService {
    Course save(Course student);
    Course findById(int id);
    List<Course> findAll();
}
