package controle.desafios;

import java.util.Scanner;

public class DesafioWhile02 {
    public static void main(String[] args) {

        // calcular media notas turma
        // usuario digita uma nota valida
        // armazena valor da nota em total
        // saber quantas notas validas foram adicionadas
        // no fim mostra a media
        //sair quando digitar -1
        Scanner scanner = new Scanner(System.in);

        
        int contador=0;
        double somador=0;
        double nota=0;
      
   
        while (nota !=-1) {
            System.out.printf("digite uma nota");
           
            nota = scanner.nextDouble();
            if(nota <=10 && nota >=0){
                contador++;
                somador=somador+nota;
            }else if(nota !=-11){
                System.out.println("nota invalida");
            }
            
        }
        double media = somador/contador;
        System.out.printf("Contador : %d\n Soma : %.2f \n Media: %.2f",contador,somador, media);
    }
}
