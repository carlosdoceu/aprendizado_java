package excecao.personalizada01;

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

        System.out.println("Fim");
    }
}
