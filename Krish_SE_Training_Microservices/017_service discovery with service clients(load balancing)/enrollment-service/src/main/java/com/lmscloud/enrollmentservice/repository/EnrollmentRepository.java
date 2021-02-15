package com.lmscloud.enrollmentservice.repository;

import com.sameera.lmscloud.commons.model.enrollment.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer> {
}
