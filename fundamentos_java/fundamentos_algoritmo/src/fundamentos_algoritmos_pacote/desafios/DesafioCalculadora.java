package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("num 01:");
        double num1 = scanner.nextDouble();

        System.out.println("num 02:");
        double num2 = scanner.nextDouble();
        
        System.out.println("operacao:");
        String operacao = scanner.next();
        

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("O calculo de %.2f %s %.2f\n R:%.2f \n",num1,operacao,num2,resultado);

        scanner.close();
    }
}
