package main.java.list.operacoes_basicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionar(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }

    public void obterDescricoesTarefasUsandoToString(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionar("Estudar Java");
        listaTarefas.adicionar("Estudar Java mais um pouco");
        listaTarefas.adicionar("Estudar Java mais um pouco ainda");
        listaTarefas.adicionar("Estudar Java mais um pouco ainda");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Estudar Java mais um pouco ainda");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas: " + listaTarefas.obterDescricoesTarefas());
        listaTarefas.obterDescricoesTarefasUsandoToString();
    }

}
