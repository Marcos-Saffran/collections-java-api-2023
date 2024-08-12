package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        if (!numeros.isEmpty()){
            for (int numero : numeros){
                soma += numero;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero() {

        int maiorNumero = Integer.MIN_VALUE;

        if (!numeros.isEmpty()){
            for (int numero : numeros){
                if (numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        } else {
            maiorNumero = 0;
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;

        if (!numeros.isEmpty()){
            for (int numero : numeros){
                if (numero < menorNumero){
                    menorNumero = numero;
                }
            }
        } else {
            menorNumero = 0;
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);

        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Números: " + somaNumeros.exibirNumeros());
    }

}
