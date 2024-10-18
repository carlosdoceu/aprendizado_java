package streams.desafios;

public class Produto {
    final double preco, desconto;
    final String nome;
    final String descricao;
    boolean frete = false;


    

    @Override
    public String toString() {
        return "Produto ["+nome+" - Preco: "+ this.getPreco() +", Desconto: "+desconto+"%, Frete: "+frete+"]" +"(Descricao: "+descricao+")";
    }

    public double getPreco() {
        var novoPreco = preco-(preco*desconto);
        return novoPreco;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFrete() {
        return frete;
    }

    public void setFrete(boolean frete) {
        this.frete = frete;
    }

    public Produto(String nome, String decricao, double preco, double desconto, boolean frete) {
        this.preco = preco;
        this.descricao = decricao;
        this.desconto = desconto;
        this.nome = nome;
        this.frete = frete;
    }

}
