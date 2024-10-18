package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
/**
 * DESAFIO DE FILTRO-> PENSAR NO PROPRIO DESAFIO E COMO USAR FILTER E MAP
 * crie 2 funcoes lambdas para que eu possa fazer 2 filtros diferentes
 * depois usar um map no final
 * filter -> filter -> map -> print
 * 119 - 130
 */

  

        
        //criando alguns carros
        Automovel auto1 = new Automovel("FORD","FORD FOCUS", EnumAuto.CARRO);
        Automovel auto2 = new Automovel("BMW","BMW X5", EnumAuto.MOTO);
        Automovel auto3 = new Automovel("AUDI","A3", EnumAuto.CAMINHAO);
        Automovel auto4 = new Automovel("HONDA","CIVIC", EnumAuto.TRATOR);
        Automovel auto5 = new Automovel("MITSUBISHI","OUTLANDER", EnumAuto.OUTRO);
        Automovel auto6 = new Automovel("FIAT","MOBI", EnumAuto.CARRO);
        Automovel auto7 = new Automovel("FIAT","UNO", EnumAuto.CARRO);
        Automovel auto8 = new Automovel("FIAT","TORO", EnumAuto.CARRO);
        Automovel auto9 = new Automovel("FORD","Ranger", EnumAuto.CARRO);

        List<Automovel>listAuto = Arrays.asList(auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9);

        Predicate<Automovel> tipoAuto = a-> a.tipo.equals(EnumAuto.CARRO) ;

        Predicate<Automovel> filterMarca = a-> a.marca == "FIAT";

        Function<Automovel, String> mensagem = a-> "Estes sao modelos de autos: " +a.modelo+", são da marca : "+a.marca;

        listAuto.stream()
        .filter(tipoAuto).filter(filterMarca)
        .map(mensagem)
        .forEach(System.out::println);

    }
}
