package oo.composicao;

public class Carro {

    Motor motor = new Motor();

    void acelerar(){
        if(motor.fatorInjecao <2.5){
            motor.fatorInjecao+=0.4;}

    }

    void frear() {
        if (motor.fatorInjecao > 0.5)
            motor.fatorInjecao -= 0.4;

    }

    void ligar() {
        motor.motorOn = true;
    }

    void desligar() {
        motor.motorOn = false;
    }

    boolean estaLigado() {
        return motor.motorOn;
    }

}
