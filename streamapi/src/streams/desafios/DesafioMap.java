package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        Consumer<String> print = System.out::println;

        /**
         * 1. Numero para string binaria.... 6 =>"110"
         * 2. inverter a string .... "110" => "011"
         * 3. Converter para inteiro .... "011" =>
         * 
         */

        // UnaryOperator<Integer> converter = n -> {
        //     return Integer.parseInt(n.toBinaryString(n));
        // };

        // Function<String,String> inverter = n-> n.replace("0","1").replace("1", "0");

        UnaryOperator<String> inverter = s-> new StringBuilder(s).reverse().toString();
        
        Function<String, Integer> binarioParanInt = s-> Integer.parseInt(s, 2);


        listNum.stream()
        .map(Integer::toBinaryString)
        .map(inverter)
        .map(binarioParanInt)
        .forEach(System.out::println);

    }

}
