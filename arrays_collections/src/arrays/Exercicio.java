package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;


        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA=0;

        for(int i =0; i<notasAlunoA.length; i++){
            totalAlunoA = totalAlunoA + notasAlunoA[i];
            
        }
        System.out.println("Total:"+totalAlunoA);
        System.out.println("Media:"+totalAlunoA/notasAlunoA.length);


    }
}
