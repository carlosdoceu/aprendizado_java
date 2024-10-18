package lambdas.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lambdas.Produto;

public class Consumidor {
    public static void main(String[] args) {

        // Consumer é uma interface funcional que aceita um argumento e não retorna nenhum valor.
        // Aqui estamos criando uma implementação de Consumer que recebe um Produto (p)
        // e imprime o nome do produto seguido de "!!!".
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

        // Criamos alguns objetos do tipo Produto. Cada produto tem um nome, um preço e um desconto.
        Produto p1 = new Produto("Caneta", 12.34, 0.9);
        Produto p2 = new Produto("Notebook", 3893.89, 0.15);
        Produto p3 = new Produto("Notebook", 3893.89, 0.25);
        Produto p4 = new Produto("Notebook", 3893.89, 0.35);
        Produto p5 = new Produto("Notebook", 3893.89, 0.45);

        // O método accept do Consumer executa a ação definida sobre o objeto passado.
        // Aqui estamos usando o Consumer para imprimir o nome do produto p1.
        // imprimir.accept(p1); // Isso irá imprimir: "Caneta!!!"

        // Criamos uma lista para armazenar objetos do tipo Produto.
        List<Produto> produtos = new ArrayList<Produto>();

        // Adicionando os produtos à lista. (Isso está faltando no seu código!)
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        // O método forEach itera sobre cada produto da lista e aplica o Consumer (imprimir) a cada um.
        // Isso significa que para cada produto na lista, o nome será impresso com "!!!".
        // produtos.forEach(imprimir); 

        //caso toString da classe produto não estiver formatada
        // produtos.forEach(p -> System.out.println(p.nome+" - "+ p.preco + "!!!"));


        produtos.forEach(System.out::println);
    }
}
