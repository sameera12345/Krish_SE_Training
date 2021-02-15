package com.lmscloud.enrollmentservice.controller;

import com.lmscloud.enrollmentservice.model.Response;
import com.lmscloud.enrollmentservice.model.SimpleResponse;
import com.lmscloud.enrollmentservice.service.EnrollmentService;
import com.sameera.lmscloud.commons.model.enrollment.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/services/enrollments")
public class EnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment save(@RequestBody Enrollment enrollment){

        return enrollmentService.save(enrollment);
    }

    @GetMapping(value = "/{id}")
    public Response getEnrollment(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {

        if(type==null){
            return new SimpleResponse(enrollmentService.findById(id));
        }else{
            return enrollmentService.findDetailResponse(id);
        }
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments(){

        return enrollmentService.findAll();
    }
}
