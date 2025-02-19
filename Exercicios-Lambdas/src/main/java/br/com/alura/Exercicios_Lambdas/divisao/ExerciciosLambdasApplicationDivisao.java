package br.com.alura.Exercicios_Lambdas.divisao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosLambdasApplicationDivisao implements CommandLineRunner {
  public static void main(String[] args) {
    SpringApplication.run(ExerciciosLambdasApplicationDivisao.class, args);
  }

  @Override
    public void run(String... args) throws Exception {
      Principal principal = new Principal();
      try{
        principal.operacaoDivisao(5, 0);
      } catch (ArithmeticException e) {
        System.out.println("Erro: " + e.getMessage());
      }
        
    }
}
