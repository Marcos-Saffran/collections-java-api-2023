package main.java.map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesARemover = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesARemover.add(entry.getKey());
            }
        }
        for (String chave : chavesARemover){
            livrosMap.remove(chave);
        }

    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
    
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
    
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
          livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
    
        return livrosOrdenadosPorAutor;
      }
    
      public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
          Livro livro = entry.getValue();
          if (livro.getAutor().equals(autor)) {
            livrosPorAutor.put(entry.getKey(), livro);
          }
        }
        return livrosPorAutor;
      }
    
    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        if (!livrosMap.isEmpty()){
            double maiorPreco = Double.MIN_VALUE;
            for (Livro livro : livrosMap.values()){
                if (livro.getPreco() > maiorPreco){
                    maiorPreco = livro.getPreco();
                    livroMaisCaro = livro;
                }
            }
        }
        return livroMaisCaro;
      }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        if (!livrosMap.isEmpty()){
            double menorPreco = Double.MAX_VALUE;
            for (Livro livro : livrosMap.values()){
                if (livro.getPreco() < menorPreco){
                    menorPreco = livro.getPreco();
                    livroMaisBarato = livro;
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        System.out.println("Adicionando livros na livraria...");
        livraria.adicionarLivro("link1", "Livro 1", "Autor 9", 500.0);
        livraria.adicionarLivro("link2", "Livro 2", "Autor 2", 400.0);
        livraria.adicionarLivro("link3", "Livro 3", "Autor 3", 50.0);
        livraria.adicionarLivro("link4", "Livro 4", "Autor 4", 200.0);
        livraria.adicionarLivro("link5", "Livro 5", "Autor 5", 100.0);

        System.out.println("Exibindo livros ordenados por preço...");
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        System.out.println("Exibindo livros ordenados por autor...");
        System.out.println(livraria.exibirLivrosOrdenadosPorAutor());

        System.out.println("Pesquisando livros por autor...");
        System.out.println(livraria.pesquisarLivrosPorAutor("Autor 3"));

        System.out.println("Obtendo livro mais caro...");
        System.out.println(livraria.obterLivroMaisCaro());

        System.out.println("Obtendo livro mais barato...");
        System.out.println(livraria.obterLivroMaisBarato());
    }
    

}
