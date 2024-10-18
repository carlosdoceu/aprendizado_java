package Desafios;

import java.util.*;

public class MediaAlunoDinamico {

    public static void main(String[] args) {

        
        double mediaNotas = 0.0;
        double  totalNotas=0.0;
        System.out.println("Digite o numero de notas do aluno: ");
        Scanner entrada = new Scanner(System.in);
        int quantidadeNotas = entrada.nextInt();


        double[] notasAluno = new double[quantidadeNotas];

        // System.out.println(quantidadeNotas);
        for(int i=0; i<quantidadeNotas; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+": ");
            notasAluno[i] = entrada.nextDouble();
            
        }
        

        System.out.println(Arrays.toString(notasAluno));

        for (double nota : notasAluno) {
            totalNotas+=nota;
            
          
        }
        mediaNotas = totalNotas/quantidadeNotas;

        System.out.printf("\nTotalNotas: %.2f \n MediaNotas: %.2f \n",totalNotas, mediaNotas);
        entrada.close();



    }

}
