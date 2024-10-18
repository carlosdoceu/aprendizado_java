package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        CaixaObjeto caixaB = new CaixaObjeto();

        caixaA.guardar(2.3);
        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        caixaB.guardar("algo");
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);


        
    }
}
