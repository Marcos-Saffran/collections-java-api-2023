package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidadeNome(){
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidadeNome());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public Set<Produto> exibirProdutosPorNomeQuantidade(){
        Set<Produto> produtosPorNomeQuantidade = new TreeSet<>(new ComparatorPorNomeQuantidade());
        produtosPorNomeQuantidade.addAll(produtoSet);
        return produtosPorNomeQuantidade;
    }

    public static void main(String[] args){
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 150.0, 50);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20.0, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10.0, 15);
        cadastroProdutos.adicionarProduto(4L, "Produto 9", 2.0, 20);
        cadastroProdutos.adicionarProduto(5L, "Produto 5", 5.0, 25);

        System.out.println("Exibir Produtos ...");
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("Produtos por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());


        System.out.println("\nProdutos por preco:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        System.out.println("\nProdutos por quantidade e nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidadeNome());

        System.out.println("\nProdutos por nome e quantidade:");
        System.out.println(cadastroProdutos.exibirProdutosPorNomeQuantidade());
    }

}
