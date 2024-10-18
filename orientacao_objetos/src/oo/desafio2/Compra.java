package oo.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    int qtde;

    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int qtde, int preco) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));

    }

    double obterValor() {
        double total = 0;
        for (Item item : itens) {
           total += item.produto.preco * item.qtdProduto;

        }

        return total;
    }

}
