package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {

    int qtdProduto;
    Produto produto;


    Item(){

    }

    Item(Produto produto, int qtdProduto) {
        this.produto = produto;
        this.qtdProduto = qtdProduto;
    }



    @Override
    public String toString() {
        return "Item [qtdProduto=" + qtdProduto + "]";
    }

    


}
