package main.java.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (palavrasUnicasSet.isEmpty()) {
            System.out.println("Não há palavras para remover.");
        } else {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }
        }

        palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (palavrasUnicasSet.isEmpty()) {
            System.out.println("Não há palavras para exibir.");
        } else {
            System.out.println(palavrasUnicasSet);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("João");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("José");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana");
        conjuntoPalavrasUnicas.adicionarPalavra("Ana2");

        conjuntoPalavrasUnicas.adicionarPalavra("Teste");

        System.out.println("Quantidade de palavras únicas: " + conjuntoPalavrasUnicas.palavrasUnicasSet.size());
        System.out.println("\nLista de palavras únicas:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("José");
        System.out.println("\nQuantidade de palavras únicas após remoção: " + conjuntoPalavrasUnicas.palavrasUnicasSet.size());
        System.out.println("\nLista de palavras únicas após remoção:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nVerificar se a palavra 'Maria' está no conjunto: " + (conjuntoPalavrasUnicas.verificarPalavra("Maria") ? "Sim" : "Não"));
    }

     

}
