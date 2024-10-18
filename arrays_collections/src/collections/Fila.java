package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();


        // .add() lançara uma exceção caso a fila esteja cheia
        // .offer() retorna falso caso a fila esteja cheia
        fila.add("Ana");
        fila.offer("Maria");
        fila.add("Joao");
        fila.offer("Gessica");
        fila.add("Carlos");


        //Peek e Element - > obtem o proximo elementos
        // da fila (sem remover)

        System.out.println(fila.peek()); // serve para verificar o primeiro elemento da fila mas RETORNA NULL se a fila estiver vazia
        System.out.println(fila.element()); // serve para verificar o primeiro elemento da fila MAS RETORNA UMA EXEÇÃO SE A FILA ESTEJA VAZIA



        System.out.println(fila.poll()); // remove o primeiro elemento da fila
        
    }

}
