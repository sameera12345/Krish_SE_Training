package com.sameera.lmscloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment environment;

    public String getSubjectModel(){
        return environment.getProperty("course.subject.model");
    }

    public String getMinNoOfSubjectsRole(){
        return environment.getProperty("member.role.min");
    }
}
