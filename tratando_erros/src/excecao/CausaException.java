package excecao;

public class CausaException {
    public static void main(String[] args) {
        try {
            metodoB(null);
        } catch (IllegalArgumentException e) {
            if(e.getCause() !=null){
                System.out.println(e.getCause().getMessage());
            }
        }

    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }

    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno esta nulo");
        }
        System.out.println(aluno.nome);

    }

}
