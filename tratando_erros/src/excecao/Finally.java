package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {

            System.out.println(7 / entrada.nextInt());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally #01");

            //exemplo de uso:
            // caso você esteja tentando uma ação no banco de dados, caso ocorra um problema e você queira finalizar a conexão, você pode usar o finally para fechar a conexão.
            //ou seja o finally sempre sera chamado em todo try catch 
        }


        try {

            System.out.println(7 / entrada.nextInt());
        } finally {
            System.out.println("Finally #02");
            entrada.close();
     
        }

        System.out.println("FIM");
    }
}
