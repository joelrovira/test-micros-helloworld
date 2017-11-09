package com.jrovira.test.micros.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages="com.jrovira.test.micros.*.*.services")
@Configuration
public class Application {

	public static void main(String [] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
