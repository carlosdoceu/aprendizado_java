package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    double totalCompra;

    final List<Item> itens = new ArrayList<Item>();


    void adicionarItem(Produto p , int qtde) {
        this.itens.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto,qtde));
    }




    double obterValor(){
        double total = 0;
        for (Item item : itens) {
            total += item.produto.preco * item.qtdProduto;
        }
        return total;
    }




    @Override
    public String toString() {
        return "Compra [totalCompra=" + totalCompra + "]";
    }


    

}
