package fundamentos.operadores;

public class Ternarios {

    public static void main(String[] args) {
        
        double aluno1 = 6.6;
        double aluno2 = 1.0;


        String resultadoFinal = aluno1 >= 7.0 ? "Aprovado" : "Em recuperacao";
        String resultadoFinal2 = aluno2 >= 7.0 ? "Aprovado" : aluno2 >= 3.0 ? "Em recuperacao" : "Reprovado";



        System.out.println("O aluno1 esta: "+resultadoFinal);

        System.out.println("O aluno2 esta: "+resultadoFinal2);




        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("Tem desconto?" + temDesconto);
    




    }
}
