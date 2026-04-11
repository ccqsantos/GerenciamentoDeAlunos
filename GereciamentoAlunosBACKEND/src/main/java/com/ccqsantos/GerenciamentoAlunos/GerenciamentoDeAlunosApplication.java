package com.ccqsantos.GerenciamentoAlunos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GerenciamentoDeAlunosApplication {
    
	public static void main(String[] args) {
        SpringApplication.run(GerenciamentoDeAlunosApplication.class, args);

	}

}
