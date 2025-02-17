package br.com.alura.Exercicios_Lambdas.numeroPrimo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasApplicationNumeroPrimo implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExerciciosLambdasApplicationNumeroPrimo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.isNumeroPrimo(5);
    }


}
