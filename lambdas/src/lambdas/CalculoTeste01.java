package lambdas;

public class CalculoTeste01 {
    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(15, 5));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(15, 5));

    }
}
