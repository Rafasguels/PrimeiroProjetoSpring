package com.rafaelvieira.PrimeiroTrabalhoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="br.com.tokenlab.controller")
public class PrimeiroTrabalhoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroTrabalhoSpringApplication.class, args);
	}

}
