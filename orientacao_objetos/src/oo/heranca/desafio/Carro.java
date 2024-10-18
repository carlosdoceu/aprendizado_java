package oo.heranca.desafio;

public class Carro {
    public double velocidadeAtual;
    protected final int VELOCIDADE_MAXIMO;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMO = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMO) {
            velocidadeAtual = VELOCIDADE_MAXIMO;
        }
        velocidadeAtual += getDelta();

    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;

        } else {
            velocidadeAtual = 0;
        }

    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    // metodo acelerar // frear


    

}
