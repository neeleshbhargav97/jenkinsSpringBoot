package com.springboot.deploy.on.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployOnAmazonApplication {
	@GetMapping("/")
	public String home() {
		return "Deploy SpringBoot Application on Elastic BeanStalk";

	}


	public static void main(String[] args) {
		SpringApplication.run(DeployOnAmazonApplication.class, args);
	}

}
