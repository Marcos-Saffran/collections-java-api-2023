package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    public List<Numero> numeroLista;

    public OrdenacaoNumeros() {
        numeroLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroLista.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> numerosAscendentes = new ArrayList<>(numeroLista);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> numerosDescendentes = new ArrayList<>(numeroLista);
        Collections.sort(numerosDescendentes, Collections.reverseOrder());
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(20);

        System.out.println("Ordenação ascendente:");
        for (Numero numero : ordenacaoNumeros.ordenarAscendente()) {
            System.out.println(numero);
        }

        System.out.println("\nOrdenação descendente:");
        for (Numero numero : ordenacaoNumeros.ordenarDescendente()) {
            System.out.println(numero);
        }
    }

}
