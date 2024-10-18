package controle.desafios;

import javax.swing.JOptionPane;

public class DesafioWhile {
    public static void main(String[] args) {
        // usuario digita alguma coisa
        // somente deixa o usuario sair quando o usuario digitar  sair

        String palavra = JOptionPane.showInputDialog("Palavra");
        while (!palavra.equalsIgnoreCase("sair")) {
         palavra = JOptionPane.showInputDialog("Palavra");
        }
        // String palavra = JOptionPane.showInputDialog()
    }
}
