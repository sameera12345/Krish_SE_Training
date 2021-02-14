package com.lmscloud.profileservice.repository;

import com.sameera.lmscloud.commons.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
