package oo.composicao;

public class Motor {
    boolean motorOn = false;
    double fatorInjecao = 1.0;

    int giros(){
        if(!motorOn){
            return 0;
        } 
        return (int) Math.round(fatorInjecao * 3000);
    }


}
