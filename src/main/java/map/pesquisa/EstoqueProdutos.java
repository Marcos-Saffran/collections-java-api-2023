package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println("Produtos no estoque:");
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        if (!estoqueProdutosMap.isEmpty()) {
            double maiorPreco = Double.MIN_VALUE;
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        if (!estoqueProdutosMap.isEmpty()) {
            double menorPreco = Double.MAX_VALUE;
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    menorPreco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;

        if (!estoqueProdutosMap.isEmpty()) {
            double maiorQuantidadeValorTotal = 0;
            for (Produto produto : estoqueProdutosMap.values()) {
                double quantidadeValorTotal = produto.getQuantidade() * produto.getPreco();
                if (quantidadeValorTotal > maiorQuantidadeValorTotal) {
                    maiorQuantidadeValorTotal = quantidadeValorTotal;
                    produtoMaiorQuantidadeValorTotalNoEstoque = produto;
                }
            }
        }

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Arroz", 10, 6.0);
        estoqueProdutos.adicionarProduto(2, "Feijão", 5, 10.0);
        estoqueProdutos.adicionarProduto(3, "Macarrão", 8, 5.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade e valor total no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
