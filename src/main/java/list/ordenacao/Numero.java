package main.java.list.ordenacao;

public class Numero implements Comparable<Numero> {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numero numero) {
        return Integer.compare(this.numero, numero.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero [numero=" + numero + "]";
    }


}
