package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaNumeroA = new CaixaNumero<>();

        CaixaNumero<Integer> caixaNumeroB = new CaixaNumero<>();


        caixaNumeroA.guardar(3.14);
        caixaNumeroB.guardar(10);

    }

}
