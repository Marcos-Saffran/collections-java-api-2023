package main.java.list.operacoes_basicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }

}
