package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto.desconto = 0.30;

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.56;

        System.err.println(p1.nome + "\n" + p2.nome);

        // double precofinal1 = p1.preco - (p1.preco * p1.desconto);
        // double precofinal2 = p2.preco - ( p2.preco * p2.desconto);
        // double mediaCarrinho = (precofinal1 + precofinal2) / 2 ;
        // System.out.printf("Preco final :\n Notebook = %.2f \n Caneta = %.2f " ,
        // precofinal1 , precofinal2);
        // System.out.printf("\nCarrinho = %.2f:", precofinal1 + precofinal2);
        // System.out.printf("\nMedia do carrinho = R$%.2f.", mediaCarrinho);

        // double precofinal3 = p1.precoComDesconto(p1.preco, p1.desconto);
        double precofinal3 = p1.precoComDesconto(p1.preco, Produto.desconto);
        double precofinal4 = p2.precoComDesconto(p2.preco, Produto.desconto);
        System.out.printf("\nPreco final metodo vazio: %.2f ", precofinal3);
        System.out.printf("\nPreco final metodo com desconto: %.2f ", precofinal4);

    }

}
