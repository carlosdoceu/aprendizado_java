package excecao.personalizada02;

import excecao.Aluno;

public class TestesException {
    public static void main(String[] args) {

        try {
            Aluno aluno1 = new Aluno("Ana", 7);
            Validar.aluno(aluno1);
            Validar.aluno(null);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch(NumeroForaIntervalo  | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // try {
        //     Validar.aluno(null);
        // } catch (StringVaziaException | NumeroForaIntervalo e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        

        System.out.println("Fim");
    }
}
