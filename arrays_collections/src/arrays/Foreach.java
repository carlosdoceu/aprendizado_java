package arrays;

public class Foreach {
    public static void main(String[] args) {
        double notas[] = {7.9, 8, 6.7, 9.2, 7.5};


        //for normal
        // for(int i=0; i<notas.length; i++){
        //     System.out.println(notas[i]);
        // }
        //for each 
        for (double nota : notas) {
            System.out.println(nota);
            
        }
    }

}
