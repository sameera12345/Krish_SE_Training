package com.lmscloud.studentservice.service;

import com.sameera.lmscloud.commons.model.student.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student findById(int id);
    List<Student> findAll();
}
