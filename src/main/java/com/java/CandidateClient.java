package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class CandidateClient {
	public static void main(String[] args) {
		SpringApplication.run(CandidateClient.class, args);
	}
}