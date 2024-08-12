package main.java.set.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.nome);
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [" + 
            "nome=" + nome + 
            ", codigo=" + codigo + 
            ", preco=" + preco + 
            ", quantidade=" + quantidade + 
            "]\n";
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}

class ComparatorPorCodigo implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Long.compare(p1.getCodigo(), p2.getCodigo());
    }

}

class ComparatorPorQuantidadeNome implements Comparator<Produto> {
    
        @Override
        public int compare(Produto p1, Produto p2) {
            if (p1.getQuantidade() != p2.getQuantidade()) {
                return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
            }
            return p1.getNome().compareToIgnoreCase(p2.getNome());
        }
}

class ComparatorPorNomeQuantidade implements Comparator<Produto> {
    
        @Override
        public int compare(Produto p1, Produto p2) {
            if (p1.getNome().compareToIgnoreCase(p2.getNome()) != 0) {
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
            return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
        }
}   
