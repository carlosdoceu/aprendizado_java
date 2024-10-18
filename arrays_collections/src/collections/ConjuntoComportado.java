package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Set<String> listaAprovados = new HashSet<String>(); // nao ordena o conjunto
        // Set<String> listaAprovados = new TreeSet<String>(); // ordena o conjunto de acordo com o lexicograficamente
        SortedSet<String> listaAprovados = new TreeSet<>(); // ordena com algum criterio de ordenação (lexicograficamente)


        listaAprovados.add("teste");
        listaAprovados.add("Ana");
        listaAprovados.add("Maria");
        listaAprovados.add("Joao");
        listaAprovados.add("Gessica");
        listaAprovados.add("Carlos");

        System.out.println(listaAprovados);

        for (String aprovados : listaAprovados) {
            System.out.println("Candidato : " + aprovados);
        }

    }

}
