package com.example.spring_boot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringBootDockerApplication {

	@RequestMapping("/")
	public String home() {
		return "flowers"; // Name of the HTML file (without .html extension)
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);

	}
}
