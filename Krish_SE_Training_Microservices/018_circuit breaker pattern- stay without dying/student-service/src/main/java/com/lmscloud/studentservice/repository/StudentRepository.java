package com.lmscloud.studentservice.repository;

import com.sameera.lmscloud.commons.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
