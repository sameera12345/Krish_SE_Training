package com.lmscloud.enrollmentservice.model;

import com.sameera.lmscloud.commons.model.enrollment.Enrollment;

public class SimpleResponse implements Response{
    Enrollment enrollment;

    public SimpleResponse(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
}
