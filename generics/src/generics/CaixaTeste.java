package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        Caixa<Double> caixaB = new Caixa<>();

        caixaA.guardar("segredo");

        String coisaA = caixaA.abrir();


        System.out.println(coisaA);


        caixaB.guardar(10.10);
        Double coisaB = caixaB.abrir();

        System.out.println(coisaB);
    }

}
