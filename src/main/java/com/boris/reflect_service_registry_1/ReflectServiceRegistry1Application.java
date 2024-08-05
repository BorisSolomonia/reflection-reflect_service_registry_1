package com.boris.reflect_service_registry_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReflectServiceRegistry1Application {

	public static void main(String[] args) {
		SpringApplication.run(ReflectServiceRegistry1Application.class, args);
	}

}
