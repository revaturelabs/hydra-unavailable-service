package com.revature.hydra.unavailable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class UnavailableApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnavailableApplication.class, args);
	}
}
