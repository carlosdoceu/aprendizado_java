package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;


    // double precoComDesconto(double preco, double desconto){
    //     return preco - (preco * desconto);
    // }
    double precoComDesconto(double preco ,double desconto){
        return preco - (preco * desconto);
    }




}
