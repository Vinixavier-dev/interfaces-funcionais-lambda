package br.com.alura.Exercicios_Lambdas.numeroPrimo;

public class Principal {
    INumeroPrimo numeroPrimo = n -> {
        if (n / n == 0 && n / 1 == n) {
            return true;
        } else {
            return false;
        }
    };

    public void isNumeroPrimo(int n) {
        if (numeroPrimo.isPrimo(n)) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é número primo.");
        }
    }
}
