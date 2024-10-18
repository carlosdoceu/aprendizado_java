package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Gessica", "Ferrreira", "Carlos", "Omar");

        System.out.println("---Usando um foreach---");
        for (String nome : aprovados) {
            System.out.println(nome);

        }

        System.out.println("---Usando um Iterator---");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




        System.out.println("---Usando um stream---");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);//Laço interno

    }
}
