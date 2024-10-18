package oo.desafio;

public class Produto {

    String nome;
    double preco;
    

    Produto(){

    }
    Produto(String nomeProduto, double precoProduto) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + "]";
    }


    

}
