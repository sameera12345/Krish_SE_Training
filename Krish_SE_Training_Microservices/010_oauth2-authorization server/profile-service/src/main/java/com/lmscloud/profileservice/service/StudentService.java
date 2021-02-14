package com.lmscloud.profileservice.service;

import com.sameera.lmscloud.commons.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
    List<Student> getAllStudent();
}
