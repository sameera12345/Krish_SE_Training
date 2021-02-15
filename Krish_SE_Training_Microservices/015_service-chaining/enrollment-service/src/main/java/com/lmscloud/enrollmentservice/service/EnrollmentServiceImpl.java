package com.lmscloud.enrollmentservice.service;

import com.lmscloud.enrollmentservice.model.DetailResponse;
import com.lmscloud.enrollmentservice.repository.EnrollmentRepository;
import com.sameera.lmscloud.commons.model.enrollment.Enrollment;
import com.sameera.lmscloud.commons.model.student.Student;
import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    EnrollmentRepository enrollmentRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Enrollment save(Enrollment student) {
        return enrollmentRepository.save(student);
    }

    @Override
    public Enrollment findById(int id){
        Optional<Enrollment> enrollment = enrollmentRepository.findById(id);
        if (enrollment.isPresent()){
            return enrollment.get();
        }else{
            return new Enrollment();
        }
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id){

        Enrollment enrollment = findById(id);
        Student student = getStudent(enrollment.getStudentId());
        Course course = getCourse(enrollment.getCourseId());

        return new DetailResponse(enrollment,student,course);
    }

    private Student getStudent(int studentId){

        Student student = restTemplate.getForObject("http://localhost:8080/services/students/"+studentId,Student.class);
        return student;
    }

    private Course getCourse(int courseId){

        return restTemplate.getForObject("http://localhost:9191/services/courses/"+courseId,Course.class);
    }
}