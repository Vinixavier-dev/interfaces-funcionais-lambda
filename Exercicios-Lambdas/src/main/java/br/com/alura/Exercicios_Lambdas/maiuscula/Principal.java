package br.com.alura.Exercicios_Lambdas.maiuscula;

public class Principal {
    ILetraMaiuscula stringToUpperCase = s -> {
        return s.toUpperCase();
    };

    public void maiuscula(String s) {
        System.out.println(stringToUpperCase.palavra(s));
    }
 }



