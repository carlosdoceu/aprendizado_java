package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao", 9.0);
        Aluno aluno2 = new Aluno("Maria", 8.0);
        Aluno aluno3 = new Aluno("Pedro", 7.0);
        Aluno aluno4 = new Aluno("Ana", 6.0);
        Aluno aluno5 = new Aluno("Carlos", 5.0);
        Aluno aluno6 = new Aluno("Luiz", 4.0);
        Aluno aluno7 = new Aluno("Maria", 3.0);

        List<Aluno> listAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Predicate<Aluno> reprovado = aprovado.negate();

        // Match é uma função terminadora ou seja depois que fizer a operação de match, ela termina e retorna o resultado não sera possivel fazer nenhum map ou filter


        System.out.println("Todos aprovados:"+listAlunos.stream().allMatch(aprovado));

        System.out.println("Algum aprovado:"+listAlunos.stream().anyMatch(aprovado));

        System.out.println(listAlunos.stream().noneMatch(reprovado));
    }
}
