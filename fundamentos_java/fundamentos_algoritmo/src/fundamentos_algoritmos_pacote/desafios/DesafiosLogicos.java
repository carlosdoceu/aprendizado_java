package fundamentos.desafios;

public class DesafiosLogicos {

    public static void main(String[] args) {
        //trabalho na terça (v ou F)
        //trabalho na quinta (v ou F)
        boolean trabalho01 = false;
        boolean trabalho02 = false;

        boolean comprouTV50 = trabalho01 && trabalho02;
        boolean comprouTV32 = trabalho01 ^ trabalho02;
        boolean comprouSorvete = trabalho01 || trabalho02;
        System.out.println("Comprou tv 50?\nR: "+comprouTV50);
        System.out.println("Comprou tv 32?\nR: "+comprouTV32);
        System.out.println("comprou sorvete\nR: "+comprouSorvete);

    }

}
