package oo.composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<Item>();

    String cliente;
    
    
    double obterValorTotal(){
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal+=item.preco*item.quantidade;
        }
        return valorTotal;
    }



}
