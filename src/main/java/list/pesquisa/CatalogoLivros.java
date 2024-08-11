package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros){
            if (livro.getAutor().equals(autor)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro livro : livros){
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPortitulo(String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

}
