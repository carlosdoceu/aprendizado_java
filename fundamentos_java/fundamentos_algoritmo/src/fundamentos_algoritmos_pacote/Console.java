package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args){
        System.out.println("Bom dia");

    System.out.print("Bom"); System.out.print(" dia!\n\n");
    System.out.println("Bom"); System.out.println("dia!");
    System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
    System.out.printf("Salário: %.1f%n", 1234.5678);
    System.out.printf("Nome: %s%n", "João");


    Scanner teclado = new Scanner(System.in);
 
    System.out.println("Qual a sua idade?");
    int idade = teclado.nextInt();
    teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
    System.out.println("Qual o seu nome?");
    String nome = teclado.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = teclado.nextLine();
 
    teclado.close();

    System.out.printf("%d %s %s"+idade, nome, sobrenome);


    }

}
