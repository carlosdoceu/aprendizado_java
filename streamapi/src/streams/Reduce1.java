package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> soma = (a, b) -> a + b;

        int total1 = listNum.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = listNum.stream().reduce(100, soma);

        System.out.println(total2);

        Integer total3 = listNum.parallelStream().reduce(100, soma);

        System.out.println(total3);


        listNum.stream()
        .filter(n -> n > 5 )
        .reduce(soma)
        .ifPresent(System.out::println);
    }
}
