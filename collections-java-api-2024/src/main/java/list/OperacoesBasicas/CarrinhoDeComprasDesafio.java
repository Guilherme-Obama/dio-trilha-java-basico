package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasDesafio {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeComprasDesafio() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equals(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public double calcularValorTotal() {
        double total = 0d;
        for (Item i : itemList) {
            total += i.getPreco() * i.getQuant();
        }
        return total;
    }

    public void exibirItens() {
            System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Café", 9.9, 2);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Pão", 1, 10);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Café");
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
    }
}
