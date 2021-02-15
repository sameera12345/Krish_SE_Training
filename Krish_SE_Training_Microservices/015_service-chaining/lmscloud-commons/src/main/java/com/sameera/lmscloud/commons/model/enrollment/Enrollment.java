package com.sameera.lmscloud.commons.model.enrollment;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int enrollmentId;
    int studentId;
    int courseId;
    int currentProgress;
    LocalDateTime enrollFrom;
    LocalDateTime enrollTill;


    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public LocalDateTime getEnrollFrom() {
        return enrollFrom;
    }

    public void setEnrollFrom(LocalDateTime enrollFrom) {
        this.enrollFrom = enrollFrom;
    }

    public LocalDateTime getEnrollTill() {
        return enrollTill;
    }

    public void setEnrollTill(LocalDateTime enrollTill) {
        this.enrollTill = enrollTill;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }
}
