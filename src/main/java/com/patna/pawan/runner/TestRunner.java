package com.patna.pawan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to SpringBoot Application");
		System.out.println("Hello PPSingh");
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("hey");
		System.out.println();
		System.out.println("Again committd");

	}

}
