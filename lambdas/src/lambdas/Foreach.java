package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("João", "Pedro", "Carlos", "Gessica");

        System.out.println("Forma tradicional....");
        for (String nome_aprovado : aprovados) {
            System.out.println(nome_aprovado);
        }

        System.out.println("\nForma lambda #01....");
        // isso é uma expressão lambda
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!");
        });

        System.out.println("\nMethod Reference #01....");
        aprovados.forEach(System.out::println);

        System.out.println("\nForma lambda #02....");

        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02....");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }

}
