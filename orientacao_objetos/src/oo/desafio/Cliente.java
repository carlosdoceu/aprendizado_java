package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nomeCliente;
    
    final List<Compra> compras = new ArrayList<Compra>();

    Cliente() {
    }

    Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    double obterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValor();
        }
        return total;
    }


    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

}
