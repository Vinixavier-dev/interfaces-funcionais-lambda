package br.com.alura.Exercicios_Lambdas.calculo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosLambdasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.executar(5, 4);
	}



}
