package excecao;

public class Basico {
    public static void main(String[] args) {
        
        
        try {
            System.out.println(7/0);    
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        



        System.out.println("Fim ");

        Aluno aluno1 = null;

        try{
            imprimirNomeAluno(aluno1);
        }catch(Exception e){
            // System.out.println("Exceção: " + e.getMessage());
            e.printStackTrace();
        }
        

    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
