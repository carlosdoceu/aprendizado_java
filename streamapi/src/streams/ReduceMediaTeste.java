package streams;



public class ReduceMediaTeste {

    public static void main(String[] args) {


        ReduceMedia m1 = new ReduceMedia().adicionar(8.3).adicionar(6.7);
        ReduceMedia m2 = new ReduceMedia().adicionar(7.9).adicionar(6.6);


        System.out.println(m1.getValor());
        System.out.println(m2.getValor());


        System.out.println(ReduceMedia.combinar(m1, m2).getValor());



        
    }
}
