package com.sameera.lmscloud.lmsprocesstask;

import com.sameera.lmscloud.lmsprocesstask.service.LMSProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class LmsProcessTaskApplication {

	@Bean
	LMSProcessTaskRunner getLMSProcessTaskRunner(){
		return new LMSProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(LmsProcessTaskApplication.class, args);
	}

}
