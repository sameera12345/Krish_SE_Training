package com.lmscloud.studentservice.service;

import com.lmscloud.studentservice.repository.StudentRepository;
import com.sameera.lmscloud.commons.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(int id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            return student.get();
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}