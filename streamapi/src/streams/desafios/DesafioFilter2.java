package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;

public class DesafioFilter2 {

    /**
     * imagine um site
     * mostrar todos os produtos com um desconto maior que 30% ou seja super promoção
     * e os produtos com frete gratis
     * ou seja 2 filtros com desconto maior que 30% e frete gratuito
     * filtro -> filtro -> map -> print
     * 
     * lista de produto
     * preco, nome, desconto, frete
     * 
     * map colocar o nome do produto e o preco e dizer que é uma super promoção
     * 
     */
    public static void main(String[] args) {

        //alguns produtos eletronicos

        Produto p1 = new Produto("TV ","30 polegadas", 1000.00, 0.30, true);
        Produto p2 = new Produto("TV","52 polegadas", 2000.00, 0.20, false);
        Produto p3 = new Produto("TV","100 polegadas", 3000.00, 0.35, false);
        Produto p4 = new Produto("Air-Frayer","25 lt", 400.00, 0.35, true);
        Produto p5 = new Produto("Luminaria","110 watts", 100.00, 0.30, true);
        Produto p6 = new Produto("Panela Eletrica","240 watts", 3000.00, 0.15, false);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> promocao = p-> p.desconto>=0.30;
        Predicate<Produto> frete= p->p.frete == true;
        Function<Produto, String> mensagem = p-> "Super promoção de "+p.nome+" "+p.descricao+" ------- por apenas:R$"+p.preco+" com frete gratis" ;
        

        

        listaProdutos.stream()
        .filter(promocao)
        .filter(frete)
        .map(mensagem)
        .forEach(System.out::println);

        
        
    }

}
