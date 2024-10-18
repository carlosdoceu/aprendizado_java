package oo.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;

    List<Compra> compras = new ArrayList<>();

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
