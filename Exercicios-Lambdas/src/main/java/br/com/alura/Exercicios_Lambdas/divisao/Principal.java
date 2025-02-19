package br.com.alura.Exercicios_Lambdas.divisao;

public class Principal {
    IDivisao divisao = (a, b) -> (a / b);

    public void operacaoDivisao(int n1, int n2) {
        double resposta = divisao.metodoInterfaceDivisao(n1, n2);
        if (n2 == 0) {
            throw new ArithmeticException("Divisor é zero, impossível processar.");
        } else {
            System.out.println(resposta);
        }

    }
}
