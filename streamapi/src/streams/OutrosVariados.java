package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosVariados {
    public static void main(String[] args) {
        Aluno aluno1= new Aluno("Luiz", 4.0);
        Aluno aluno2= new Aluno("Maria", 3.0);
        Aluno aluno3= new Aluno("Gessica", 9.0);
        Aluno aluno4= new Aluno("Ferreira", 8.0);
        Aluno aluno5 = new Aluno("Cristiane", 7.0);

        Aluno aluno6 = new Aluno("Luiz", 4.0);
        Aluno aluno7 = new Aluno("Maria", 3.0);
        Aluno aluno8 = new Aluno("Gessica", 9.0);
        Aluno aluno9 = new Aluno("Ferreira", 8.0);
        Aluno aluno10 = new Aluno("Cristiane", 7.0);

        List<Aluno> listAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10);


        System.out.println("Distinct");
        listAlunos.stream().distinct().forEach(System.out::println);

        System.out.println("\n Skip/Limit \n ");
        listAlunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

        System.out.println("\n TakeWhile \n ");
        listAlunos.stream().distinct().takeWhile(a -> a.nota>=7).forEach(System.out::println);

    }

}
