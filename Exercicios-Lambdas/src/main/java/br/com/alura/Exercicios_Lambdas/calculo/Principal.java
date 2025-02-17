package br.com.alura.Exercicios_Lambdas.calculo;

public class Principal {
    IOperacao multiplicacao = (a, b) -> a * b;

    public void executar(int a, int b) {
        System.out.println(multiplicacao.calcular(a, b));
    }

}
