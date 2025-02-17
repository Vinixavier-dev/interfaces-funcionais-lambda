package br.com.alura.Exercicios_Lambdas.palindromo;

public class Principal {
    StringBuilder stringBuilder = new StringBuilder();

    IPalindromo palindromo = p -> {
        //p = new StringBuffer(p).reverse().toString();
        if((p).equals(new StringBuffer(p).reverse().toString())) {
            return true;
        } else {
            return false;
        }
    };

    public void viewPalindromo(String str) {
        if(palindromo.verificarPalindromo(str)) {
            System.out.println(str + " é um palíndromo");
        } else {
            System.out.println(str + " não é um palíndromo");
        }
    }

    }

