package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2 ;

        a--;
        a++;

        --b;
        ++b;


        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--);  //o 1+a recebe logo compara com o b antes de decrementar , entao vai dar true pois a ficou com 2 e b ficou com 2 
        System.out.println(a == b); //aqui ja ta decrementado, vai dar false, a ficou com 2, b ficou com 1
    }
}
