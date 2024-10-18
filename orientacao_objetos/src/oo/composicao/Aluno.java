package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;

    final List<Curso> cursos = new ArrayList<Curso>();


    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.adicionarAluno(this);
    }

    @Override
    public String toString() {
        return  this.nome;
    }


    Curso obterCurso(String nome){
        for(Curso curso : this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){ //caso não importa se o nome é maiúsculo ou minúsculo
                return curso;

            }
        }
        
        return null;
    }
    


}
