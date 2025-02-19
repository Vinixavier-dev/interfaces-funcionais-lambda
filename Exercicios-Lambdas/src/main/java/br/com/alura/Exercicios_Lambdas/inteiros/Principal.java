package br.com.alura.Exercicios_Lambdas.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    IInteiros inteiros = i -> {
        List<Integer> novaListaInteiros = new ArrayList<>();
        for (Integer integer : i) {
            novaListaInteiros.add(integer * 3);
        }
        return novaListaInteiros;
    };

    public List<Integer> menu() {
        List<Integer> listaIntegers = new ArrayList<>();
        int resposta = 0;

        do {
            System.out.println("Adicione números na lista ou digite 'Sair' se não quiser mais.");
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNextInt()) {
                resposta = scanner.nextInt();
                listaIntegers.add(resposta);
            } else {
                String respostaString = scanner.nextLine();
                if(respostaString.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    int respostaInt = Integer.parseInt(respostaString);
                    listaIntegers.add(respostaInt);
                }   
            }
            
            scanner.close();
            
        } while (resposta != -1);

        return inteiros.listaInteiros(listaIntegers);
    }
}
