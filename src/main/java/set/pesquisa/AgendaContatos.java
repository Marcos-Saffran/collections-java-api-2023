package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){ 
        this.contatosSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNomeSet = new HashSet<>();

        if (contatosSet.isEmpty()) {
            System.out.println("Agenda de contatos vazia.");
        } 
        else {
            for (Contato contato : contatosSet) {
                if (contato.getNome().startsWith(nome)) {
                    contatosPorNomeSet.add(contato);
                }
            }
    
        }
        return contatosPorNomeSet;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;
        if (contatosSet.isEmpty()) {
            System.out.println("Agenda de contatos vazia.");
        } 
        else {
            for (Contato contato : contatosSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumeroTelefone(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.adicionarContato("Ana", 654321987);
        agenda.adicionarContato("Carlos", 321987654);
        agenda.adicionarContato("Mariana", 789123456);
        agenda.adicionarContato("Pedro", 987123456);
        agenda.adicionarContato("Paula", 654987321);
        agenda.adicionarContato("Lucas", 321456987);
        agenda.adicionarContato("Luciana", 987654123);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Jo"));
        System.out.println(agenda.pesquisarPorNome("Ma"));
        System.out.println(agenda.pesquisarPorNome("Lu"));

        System.out.println(agenda.atualizarNumeroContato("Maria", 111111111));
        System.out.println(agenda.atualizarNumeroContato("Lucas", 222222222));
        System.out.println(agenda.atualizarNumeroContato("Luciana", 333333333));

        agenda.exibirContatos();
    }


}
