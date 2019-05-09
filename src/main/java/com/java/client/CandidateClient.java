package com.java.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.controller.CandidateController;
import com.java.service.CandidateService;

@SpringBootApplication(scanBasePackages= {"com.java"})
//@EnableEurekaClient
@EntityScan(basePackages = "com.java")
@ComponentScan(basePackageClasses = {CandidateController.class, CandidateService.class})
@EnableJpaRepositories("com.java.dao")
public class CandidateClient {
	public static void main(String[] args) {
		SpringApplication.run(CandidateClient.class, args);
	}
}
