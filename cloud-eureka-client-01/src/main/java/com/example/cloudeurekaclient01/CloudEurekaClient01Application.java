package com.example.cloudeurekaclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudEurekaClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaClient01Application.class, args);
	}

}
