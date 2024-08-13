package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println("Contagem de palavras:");
        System.out.println(contagemPalavrasMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente(){
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        if (!contagemPalavrasMap.isEmpty()) {
            int maiorContagem = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> contagemPalavraMapNoFor : contagemPalavrasMap.entrySet()) {
                if (contagemPalavraMapNoFor.getValue() > maiorContagem) {
                    maiorContagem = contagemPalavraMapNoFor.getValue();
                    palavraMaisFrequente.clear();
                    palavraMaisFrequente.put(contagemPalavraMapNoFor.getKey(), contagemPalavraMapNoFor.getValue());
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("palavra1", 1);
        contagemPalavras.adicionarPalavra("palavra2", 2);
        contagemPalavras.adicionarPalavra("palavra3", 3);
        contagemPalavras.adicionarPalavra("palavra4", 4);
        contagemPalavras.adicionarPalavra("palavra5", 5);
        contagemPalavras.exibirContagemPalavras();
        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());

        System.out.println("Removendo palavra5:");
        contagemPalavras.removerPalavra("palavra5");
        contagemPalavras.exibirContagemPalavras();
        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());


    }



}
