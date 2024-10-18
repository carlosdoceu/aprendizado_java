package lambdas.interfacesFuncionais;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(2));

        Function<String, String> oResultado = valor -> "O resultado é:" + valor;
        
        Function<String, String> empolgar = valor -> valor+"!!!!";


        String resultadoFinal = parOuImpar
        .andThen(oResultado)
        .andThen(empolgar)
        .apply(31);


        System.out.println(resultadoFinal);

    }

}
