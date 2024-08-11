package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros = new ArrayList<>();

    public void adicionarNumer(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : numeros){
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (int numero : numeros){
            if (numero < menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }

}
