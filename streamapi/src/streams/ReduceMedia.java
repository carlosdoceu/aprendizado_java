package streams;

public class ReduceMedia {
    private double total;
    private int quantidade;

    public ReduceMedia adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor(){
        return total/quantidade;
    }

    public static ReduceMedia combinar(ReduceMedia m1, ReduceMedia m2){
        ReduceMedia resultado = new ReduceMedia();
        resultado.total= m1.total + m2.total;
        resultado.quantidade = m1.quantidade + m2.quantidade;
        return resultado;
    }

}
