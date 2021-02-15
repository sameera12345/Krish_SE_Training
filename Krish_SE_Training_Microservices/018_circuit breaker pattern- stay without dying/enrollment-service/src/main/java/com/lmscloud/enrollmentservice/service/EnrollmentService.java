package com.lmscloud.enrollmentservice.service;

import com.lmscloud.enrollmentservice.model.DetailResponse;
import com.sameera.lmscloud.commons.model.enrollment.Enrollment;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface EnrollmentService {
    Enrollment save(Enrollment student);

    Enrollment findById(int id);

    List<Enrollment> findAll();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
