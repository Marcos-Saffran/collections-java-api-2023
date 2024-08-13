package main.java.map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            this.dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }

        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        System.out.println("Exibindo palavras: ");
        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Casa", "Lugar onde se mora");
        dicionario.adicionarPalavra("Carro", "Meio de transporte");
        dicionario.adicionarPalavra("Computador", "Máquina que processa dados");
        dicionario.adicionarPalavra("Computador", "Máquina que processa dados segundo");
        dicionario.adicionarPalavra("Computador", "Máquina que processa dados terceiro");

        System.out.println("Exibindo palavras: ");
        dicionario.exibirPalavras();

        System.out.println("Pesquisando por palavra: Carro ");
        System.out.println(dicionario.pesquisarPorPalavra("Carro"));

        System.out.println("Removendo palavra: Carro");
        dicionario.removerPalavra("Carro");

        System.out.println("Exibindo palavras após remoção de Carro");
        dicionario.exibirPalavras();
    }

}
