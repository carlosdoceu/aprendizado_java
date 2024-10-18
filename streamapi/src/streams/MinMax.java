package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 9.0);
        Aluno aluno2 = new Aluno("Maria", 8.0);
        Aluno aluno3 = new Aluno("Pedro", 7.0);
        Aluno aluno4 = new Aluno("Ana", 6.0);
        Aluno aluno5 = new Aluno("Carlos", 5.0);
        Aluno aluno6 = new Aluno("Luiz", 4.0);
        Aluno aluno7 = new Aluno("Maria", 3.0);

        List<Aluno> listAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7);

        Comparator<Aluno> comparadorMaior = (a , b )-> {
            if(a.nota > b.nota) return 1;
            if(a.nota < b.nota) return -1;
            return 0;
        };


        Comparator<Aluno> comparadorMenor = (a , b )-> {
            if(a.nota > b.nota) return -1;
            if(a.nota < b.nota) return 1;
            return 0;
        };


        System.out.println(listAlunos.stream().max(comparadorMaior).get().nome+" Tirou a maior nota");
        System.out.println(listAlunos.stream().min(comparadorMenor).get().nome+" Tirou a menor nota");
        System.out.println(listAlunos.stream().sorted(comparadorMaior).collect(Collectors.toList()).get(0).nome);
        
    }

}
