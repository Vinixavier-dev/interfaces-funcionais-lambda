package br.com.alura.Exercicios_Lambdas.calculo;

@FunctionalInterface
//interfaces funcionais são aquelas que contém apenas um método abstrato.
public interface IOperacao {
    public int calcular(int a, int b);
}
