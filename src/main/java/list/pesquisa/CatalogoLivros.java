package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livroList;

    public CatalogoLivros(){
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        boolean livroListPossuiLivros = !livroList.isEmpty();

        if (livroListPossuiLivros){
            for (Livro livro : livroList){
                if (livro.getAutor().equals(autor)){
                    livrosPorAutor.add(livro);
                }
            }        
        }
    
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        
        boolean livroListPossuiLivros = !livroList.isEmpty();

        if (livroListPossuiLivros){
            for(Livro livro : livroList){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPortitulo(String titulo){

        Livro livroPorTitulo = null;

        boolean livroListPossuiLivros = !livroList.isEmpty();

        if (livroListPossuiLivros){
            for (Livro livro : livroList){
                if (livro.getTitulo().equals(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2019, 2022));

        System.out.println(catalogoLivros.pesquisarPortitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarPortitulo("Livro 4"));

        System.out.println(catalogoLivros.pesquisarPortitulo("Livro 5"));


        
    }

}
