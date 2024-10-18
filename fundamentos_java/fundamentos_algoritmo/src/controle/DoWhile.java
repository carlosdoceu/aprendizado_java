package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String txt = "";

        do{
            System.out.println("Diga a palavra");
            System.out.println("Quer sair?");
            txt = scanner.nextLine();

        }while(!txt.equalsIgnoreCase("sair"));

    }
}
