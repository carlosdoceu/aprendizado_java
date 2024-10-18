package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno principe");
        livros.push("Don quixote");
        livros.push("Harry Potter");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());// retorna null se a pilha estiver vazia
        System.out.println(livros.pop()); // retorna um erro se a pilha estiver vazia

        //diferença entre poll e pop é que o poll remove o primeiro elemento da pilha e retorna ele, enquanto o pop remove o último elemento da pilha e retorna ele

    }

}
