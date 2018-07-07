package br.com.casadocodigo.livraria.teste;

import java.util.*;

public class TestandoPerformance {
    public static void main(String[] args) {

        Set<String> colecao = new HashSet<>();

        for (int i = 0; i < 100000; i++) {
            colecao.add("Item " + i);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            colecao.contains("Colecao " + i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Demorou " + tempo + " ms para executar");
    }
}
