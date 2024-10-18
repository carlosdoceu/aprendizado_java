package swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observador");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null); // centralizar na tela do computador

        JButton botao = new JButton("Clicar");

        frame.add(botao);

  
        botao.addActionListener(e-> {
            System.out.println("Botao clicado");
        });
     

        frame.setVisible(true);
    }
}
