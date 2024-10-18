package oo.polimorfismo;

public class MainJantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(98.0);

        Arroz ingrediente = new Arroz(0.525);
        Feijao ingrediente2 = new Feijao(0.525);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());


        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
