package com.lmscloud.courseservice.repository;

import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
