package com.example.cadastroponto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class CadastroPontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroPontoApplication.class, args);
	}

}
