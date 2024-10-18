package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int qtdAlunos = entrada.nextInt();
        System.out.println("Quantas notas?");
        int qtdNotas = entrada.nextInt();

        double notasdaTurma[][] = new double[qtdAlunos][qtdNotas];
        double total = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Informe a nota [%d][%d]:", i , j );
                notasdaTurma[i][j] = entrada.nextDouble();
                total+= notasdaTurma[i][j];


            }

        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("\n Media da turma: " + media);
        

        for(double[] notasAluno : notasdaTurma){
            System.out.println(Arrays.toString(notasAluno));
        }

        entrada.close();
    }

   
}