package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Salario 01:");
        String valor1 = scanner.nextLine().replace(",",".");
        
        System.out.println("Salario 02:");
        String valor2 = scanner.nextLine().replace(",",".");
        
        System.out.println("Salario 03:");
        String valor3 = scanner.nextLine().replace(",",".");


        double salario01 = Double.parseDouble(valor1);
        double salario02 = Double.parseDouble(valor2);
        double salario03 = Double.parseDouble(valor3);
        double media = (salario01+salario02+salario03)/3;
        
        System.out.printf("%.2f",media);
        scanner.close();

        
    }

}
