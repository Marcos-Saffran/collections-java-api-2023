package main.java.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        if (!convidadoSet.isEmpty()){
            for (Convidado convidadoNoSet : convidadoSet) {
                if (convidadoNoSet.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = convidadoNoSet;
                    break;
                }
            }
        }
        if (convidadoParaRemover != null) {
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        // for (Convidado convidado : convidadoSet) {
        //     System.out.println(convidado);
        // }
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("José", 3);
        conjuntoConvidados.adicionarConvidado("Ana", 4);
        conjuntoConvidados.adicionarConvidado("Ana2", 4);

        conjuntoConvidados.adicionarConvidado("Teste", 5);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        System.out.println("\nLista de convidados:");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        System.out.println("\nQuantidade de convidados após remoção: " + conjuntoConvidados.contarConvidados());
        System.out.println("\nLista de convidados após remoção:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("teste");
        

    }

}
