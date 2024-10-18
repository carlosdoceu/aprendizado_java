package oo.heranca.testes;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class MainJogo {
    public static void main(String[] args) {

        Monstro  monstro = new Monstro(10, 10);

       

        Heroi heroi = new Heroi(10,11);
     
      
        System.out.println(monstro.y);
        System.out.println(monstro.x);

        System.out.println("Vida do monstro : " + monstro.hp);
        System.out.println("Vida do Heroi: " + heroi.hp);


        monstro.atacar(heroi);
        heroi.atacar(monstro);
    
        System.out.println("Vida do monstro : " + monstro.hp);
        System.out.println("Vida do Heroi: " + heroi.hp);

    }
}
