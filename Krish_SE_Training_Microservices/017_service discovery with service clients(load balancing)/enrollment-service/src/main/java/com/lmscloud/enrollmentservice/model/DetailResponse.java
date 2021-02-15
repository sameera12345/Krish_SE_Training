package com.lmscloud.enrollmentservice.model;

import com.sameera.lmscloud.commons.model.course.Course;
import com.sameera.lmscloud.commons.model.enrollment.Enrollment;
import com.sameera.lmscloud.commons.model.student.Student;

public class DetailResponse implements Response{

    Enrollment enrollment;
    Student student;
    Course course;

    public DetailResponse(Enrollment enrollment, Student student, Course course) {
        this.enrollment = enrollment;
        this.student = student;
        this.course = course;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
