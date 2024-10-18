package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("JAva");
        Curso curso2 = new Curso("Spring");
        Curso curso3 = new Curso("Angular");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno3);

        curso2.adicionarAluno(aluno1);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno2);

        for (Aluno aluno : curso2.alunos) {
            System.out.println("Sou " + aluno.nome + " Meu curso é:" + curso2.nome);

        }

        System.out.println(aluno1.cursos.get(0).alunos);
        Curso cursoencontrado = aluno1.obterCurso("JAva");

         if(cursoencontrado !=null){
            System.out.println("Curso encontrado: "+ cursoencontrado.nome);
            System.out.println("Curso tem esses alunos: "+ cursoencontrado.alunos);
         }

        

    }
}
