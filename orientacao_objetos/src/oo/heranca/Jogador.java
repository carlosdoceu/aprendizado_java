package oo.heranca;

public class Jogador {
    public int x;
    public int y;
    public int hp = 100;

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param direcao - direção que o jogador deseja andar
     * @return - true se o jogador conseguiu andar na direção indicada
     */
    boolean andar(DirecaoEnum direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                x++;
                break;
            case LESTE:
                y++;
                break;
            case OESTE:
                x--;
                break;

        }

        return true;

    }

    public boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.hp -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.hp -= 10;
            return true;

        } else {
            return false;
        }

    }

}
