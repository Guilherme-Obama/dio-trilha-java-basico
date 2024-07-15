package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumerosDesafio {
    private List<Integer> numeros;

    public SomaNumerosDesafio() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : this.numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        for (Integer numero : this.numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = 0;
        for (Integer numero : this.numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(-2);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
