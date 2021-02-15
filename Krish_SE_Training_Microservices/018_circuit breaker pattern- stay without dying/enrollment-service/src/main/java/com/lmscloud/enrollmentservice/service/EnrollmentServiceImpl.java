package com.lmscloud.enrollmentservice.service;

import com.lmscloud.enrollmentservice.hystrix.CommonHystrixCommand;
import com.lmscloud.enrollmentservice.hystrix.CourseCommand;
import com.lmscloud.enrollmentservice.model.DetailResponse;
import com.lmscloud.enrollmentservice.repository.EnrollmentRepository;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.HystrixCommand;
import com.sameera.lmscloud.commons.model.enrollment.Enrollment;
import com.sameera.lmscloud.commons.model.student.Student;
import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    EnrollmentRepository enrollmentRepository;

    @Autowired
    HystrixCommand.Setter setter;

    @LoadBalanced
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
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException {

        Enrollment enrollment = findById(id);
        Student student = getStudent(enrollment.getStudentId());
        Course course = getCourse(enrollment.getCourseId());

        return new DetailResponse(enrollment,student,course);
    }

    public DetailResponse findDetailResponsefallback(int id){
        return new DetailResponse(new Enrollment(),new Student(),new Course());
    }

    private Student getStudent(int studentId) throws ExecutionException, InterruptedException {

        CommonHystrixCommand<Student> studentCommonHystrixCommand=new CommonHystrixCommand<Student>(setter,()->
        {
            return restTemplate.getForObject("http://student/services/students/"+studentId,Student.class);
        },()->{
            return new Student();
        });

        Future<Student> studentFuture=studentCommonHystrixCommand.queue();
        return studentFuture.get();
    }

    private Course getCourse(int courseId){

        CourseCommand courseCommand = new CourseCommand(restTemplate,courseId);
        return courseCommand.execute();
        //return restTemplate.getForObject("http://course/services/courses/"+courseId,Course.class);
    }
}