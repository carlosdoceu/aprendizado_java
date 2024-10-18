package oo.heranca.desafio;

public interface I_Luxo {

    void ligarAr();

    void desligarAr();

    default int velocidadeDoAR() {
        return 2;
    };

}
