package oo.desafio2;

// quanto de dinheiro que o cliente gastou na loja
// COmo, pegar todas as compras, dentro das compras, percorrer todos os itens,
// dentro de item vai ter o atributo quantidade,
// produto vai ter preço e nome
// item vai ter Produto
// compra vai ter apenas uma lista de itens
// cliente vai ter uma lista de compras
// item atributo inteiro quantidade
// Produto ref pro produto
// produto vai ter preço e nome

// Cliente vai ter metodo obterValorTotal que retorna de todas as compras de
// todos os itens o valor total

// Caixa main

public class Caixa {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Joao";

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem("Notebook", 2, 2000);

        Compra compra2 = new Compra();
        // compra2.adicionarItem("Caderno", 10, 10);
        // compra2.adicionarItem(new Produto("Impressora", 1000), 1);
        compra2.adicionarItem("Caderno", 10, 10);

        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());




    }

}
