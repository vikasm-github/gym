package com.gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementApplication.class, args);
		System.out.println("Welcome to gym");
	}

}
