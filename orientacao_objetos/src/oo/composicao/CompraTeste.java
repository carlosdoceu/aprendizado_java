package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Joao";
        c1.itens.add(new Item("Caneta", 7.45, 20));
        c1.itens.add(new Item("Borracha", 3.89, 12));
        c1.itens.add(new Item("Caderno", 18.79, 3));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

    }

}
