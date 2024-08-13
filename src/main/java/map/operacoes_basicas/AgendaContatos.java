package main.java.map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        this.agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("Exibindo contatos: ");
        agendaContatos.exibirContatos();

        
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 456789123);
        agendaContatos.adicionarContato("Marcos", 987654321);
        agendaContatos.adicionarContato("Marcos", 123456789);

        System.out.println("Exibindo contatos: ");
        agendaContatos.exibirContatos();

        System.out.println("Pesquisando por nome: Maria ");
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Removendo contato: Maria");
        agendaContatos.removerContato("Maria");

        System.out.println("Exibindo contatos após remoção de Maria");
        agendaContatos.exibirContatos();
    }

}
