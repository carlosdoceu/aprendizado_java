package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 9.8);
        Aluno aluno2 = new Aluno("Maria", 8.0);
        Aluno aluno3 = new Aluno("Pedro", 7.0);
        Aluno aluno4 = new Aluno("Ana", 6.0);
        Aluno aluno5 = new Aluno("Carlos", 5.0);
        Aluno aluno6 = new Aluno("Luiz", 4.0);
        Aluno aluno7 = new Aluno("Maria", 3.0);

        List<Aluno> listAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<ReduceMedia, Double, ReduceMedia> calcularMedia = (media, nota) -> media.adicionar(nota);

        BinaryOperator<ReduceMedia> combinarMedia = (m1, m2) -> ReduceMedia.combinar(m1, m2);

        
        ReduceMedia media = listAlunos.stream()
        .filter(aprovado)
        .map(apenasNota)
        .reduce(new ReduceMedia(), calcularMedia, combinarMedia);



        System.out.println("A media da turma é: " + media.getValor());
        
    }
}
