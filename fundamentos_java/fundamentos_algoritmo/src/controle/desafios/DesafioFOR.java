package controle.desafios;

public class DesafioFOR {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 0; i < 10; i++) {
            System.out.println(valor);
            valor +="#";
        }

        /**DEsafio é fazer a piramide mas sem utilizar numeros para construir */


        for(String v = "#"; !v.equals("######");v+="#"){
            System.out.println(v);

        }
    }
}
