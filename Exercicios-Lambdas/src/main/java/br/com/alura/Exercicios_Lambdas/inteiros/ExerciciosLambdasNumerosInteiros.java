package br.com.alura.Exercicios_Lambdas.inteiros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasNumerosInteiros implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExerciciosLambdasNumerosInteiros.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        System.out.println(principal.menu());
    }

}
