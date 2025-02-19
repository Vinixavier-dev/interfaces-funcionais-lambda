package br.com.alura.Exercicios_Lambdas.ordemAlfabetica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasOrdemAlfabeticaApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ExerciciosLambdasOrdemAlfabeticaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        System.out.println(principal.menu());    
    }
}
