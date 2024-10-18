package controle.desafios;

import javax.swing.JOptionPane;

public class DesafioSemana {

    public static void main(String[] args) {
      
        // sabado -7
        // sexta -6 
        // quinta -5
        // quarta -4
        // terça -3
        // segunda - 2
        //   //doming - 1
        /**
         * cada numero vai representar um numero da semana
         * 
         */


         String dia = JOptionPane.showInputDialog("Digite o dia da semana");
         

         if("domingo".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 1", "Dia", 1);
         }else if("segunda".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 2", "Dia", 1);
         }else if("terça".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 3", "Dia", 1);
         }else if("quarta".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 4", "Dia", 1);
         }else if("quinta".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 5", "Dia", 1);
         }else if("sexta".equalsIgnoreCase(dia) ){
            JOptionPane.showMessageDialog(null, "O dia é 6", "Dia", 1);
         }else if("sabado".equalsIgnoreCase(dia)){
            JOptionPane.showMessageDialog(null, "O dia é 7", "Dia", 1);
         }else{
            JOptionPane.showMessageDialog(null, "INVALIDO", "Dia", 1);
         }

         
    }
}
