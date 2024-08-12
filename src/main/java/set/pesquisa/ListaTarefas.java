package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){ 
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaARemover = null;
        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } 
        else {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaARemover = tarefa;
                    break;
                }
            }
            if (tarefaARemover != null) {
                tarefaSet.remove(tarefaARemover);
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();

        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } 
        else {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.isConcluida()) {
                    tarefasConcluidasSet.add(tarefa);
                }
            }
    
        }
        return tarefasConcluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();

        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } 
        else {
            for (Tarefa tarefa : tarefaSet) {
                if (!tarefa.isConcluida()) {
                    tarefasPendentesSet.add(tarefa);
                }
            }
    
        }
        return tarefasPendentesSet;
    }

    public void marcarTarefaConcluida(String descricao){
        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } 
        else {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } 
        else {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(false);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println("Há " + lista.contarTarefas() + " tarefas na lista.");

        System.out.println("Adicionando tarefas...");

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Pagar contas");
        lista.adicionarTarefa("Estudar Python");
        lista.adicionarTarefa("Fazer exercícios");

        System.out.println("Há " + lista.contarTarefas() + " tarefas na lista.");

        System.out.println("Exibindo tarefas...");
        lista.exibirTarefas();

        System.out.println("Obtendo tarefas pendentes...");
        System.out.println(lista.obterTarefasPendentes());

        System.out.println("Marcando tarefa como concluída...");
        lista.marcarTarefaConcluida("Estudar Java");
        lista.marcarTarefaConcluida("Estudar Python");

        System.out.println("Obtendo tarefas concluídas...");
        System.out.println(lista.obterTarefasConcluidas());

        System.out.println("Marcando tarefa como pendente...");
        lista.marcarTarefaPendente("Estudar Java");

        System.out.println("Obtendo tarefas pendentes...");
        System.out.println(lista.obterTarefasPendentes());

        System.out.println("Limpando lista de tarefas...");
        lista.limparListaTarefas();

        System.out.println("Há " + lista.contarTarefas() + " tarefas na lista.");

        System.out.println("Exibindo tarefas...");
        lista.exibirTarefas();

    }


}
