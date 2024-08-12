package main.java.list.operacoes_basicas;

public class Tarefa implements Comparable<Tarefa> {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

    @Override
    public int compareTo(Tarefa o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    

}
