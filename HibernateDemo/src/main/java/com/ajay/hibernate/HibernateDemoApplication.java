package com.ajay.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HibernateDemoApplication {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("controller hit properly");
		return "home";
	}
	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

}
