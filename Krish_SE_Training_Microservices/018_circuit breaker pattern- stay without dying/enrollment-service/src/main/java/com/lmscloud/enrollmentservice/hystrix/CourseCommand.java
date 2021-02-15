package com.lmscloud.enrollmentservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.sameera.lmscloud.commons.model.course.Course;
import org.springframework.web.client.RestTemplate;

public class CourseCommand extends HystrixCommand<Course> {

    RestTemplate restTemplate;
    int courseId;

    public CourseCommand(RestTemplate restTemplate, int courseId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));

        this.restTemplate=restTemplate;
        this.courseId=courseId;
    }

    @Override
    protected Course run() throws Exception {
        return restTemplate.getForObject("http://course/services/courses/"+courseId,Course.class);
    }

    @Override
    protected Course getFallback() {
        System.out.println("hit on fallback");
        return new Course();
    }
}
