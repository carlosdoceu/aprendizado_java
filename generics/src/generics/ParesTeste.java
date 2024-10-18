package generics;

public class ParesTeste {

    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(3, "Pedro");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(2, "Rebecca");
        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));


        /*
         * ele não tá aceitando duplicação sem se adicionar outra outros valores ele vai
         * acabar sim pegando o último
         * 
         * porque ele vai substituir e isso se dá o fato de que nós estamos usando
         * dentro do nosso nossa classe
         * 
         * pares um tipo Set que não aceita repetições
         */
    }

}
