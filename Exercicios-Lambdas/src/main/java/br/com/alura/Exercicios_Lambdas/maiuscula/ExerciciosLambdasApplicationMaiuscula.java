package br.com.alura.Exercicios_Lambdas.maiuscula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasApplicationMaiuscula implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExerciciosLambdasApplicationMaiuscula.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.maiuscula("vinicius");    
    }
}
