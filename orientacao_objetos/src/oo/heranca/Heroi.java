package oo.heranca;

public class Heroi extends Jogador {

    public Heroi(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean atacar(Jogador oponente) {
        boolean ataque = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque || ataque2 || ataque3;

    }

}
