package br.com.bernardopereira.gestao_cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GestaoCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoCursosApplication.class, args);
	}

	@GetMapping("/")
	String home() {
		return "Bem-vindo ao sistema de gestão de cursos!";
	}

}
