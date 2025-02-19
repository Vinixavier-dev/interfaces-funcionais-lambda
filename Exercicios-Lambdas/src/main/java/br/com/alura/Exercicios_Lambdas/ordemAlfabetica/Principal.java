package br.com.alura.Exercicios_Lambdas.ordemAlfabetica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    IOrdemAlfabetica ordemAlfabetica = o -> {
        List<String> listaString = new ArrayList<>();
        for (String string : o) {
            listaString.add(string);
        }

        Collections.sort(listaString);
        return listaString;
    };

    public List<String> menu() {
        Scanner scanner = new Scanner(System.in);
        List<String> listaStringMenu = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Insira palavras à lista ou digite 'sair' para fechar a lista");
            resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("sair")) {
                listaStringMenu.add(resposta);
            } else {
                break;
            }  

            scanner.close();
        } while (!resposta.equalsIgnoreCase("sair"));

        return ordemAlfabetica.interfaceListaAlfabetica(listaStringMenu);
    }
}
