package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> listMarcas = List.of("BMW","Audi","Honda","Mitsubishi");

        listMarcas.stream().map(marca -> marca.toUpperCase()).forEach(print);


      

        System.out.println("---Usando Composição---");

        listMarcas.stream()
        .map(Utilitarios.maiuscula)
        .map(Utilitarios.primeiraLetra)
        .map(Utilitarios::grito)
        .forEach(print);

    }
}
