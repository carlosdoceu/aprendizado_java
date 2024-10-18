package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafio {
    public static void main(String[] args) {

        /**
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
         * 3. Frete: >=3000 (100) / <3000 (50)
         * 4. Arredondar: Deixar duas casas decimais
         * 5. Formatar: R$1234,56
         * 
         */

        Function<Produto, Double> precoFinal = p -> p.preco - (p.preco * p.desconto);

        UnaryOperator<Double> impostoMunicipal = 
            preco -> preco >= 2500.00 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = 
            preco -> preco >= 3000.00 ? preco + 100.00 : preco + 50.00;
        // UnaryOperator<Double> arredondar = 
        //     preco -> Double.parseDouble(String.format("%.2f", preco));

        UnaryOperator<Double> arredondar = preco-> Math.round(preco * 100.0) / 100.0;

        Function<Double, String> formatar = 
            preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preco final é :" + preco);



    }
}
