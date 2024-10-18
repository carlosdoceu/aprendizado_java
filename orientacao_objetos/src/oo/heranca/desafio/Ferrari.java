package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo , I_Luxo{
    boolean ligadoAr = false;
    boolean ligarTurbo = false;

    // ferrari acelera em 15 em 15

    public Ferrari() {
        super(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    // public void acelerar() {
    //     velocidadeAtual += 15;

    // }

    // public void frear() {
    //     velocidadeAtual -= 15;
    // }

    @Override
    public void ligarTurbo() {
       ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligadoAr= true;
        
    }

    @Override
    public void desligarAr() {
       ligadoAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligadoAr){
            return 35;
        }else if(ligarTurbo && ligadoAr){
            return 25;
        }else if(!ligarTurbo && !ligadoAr){
            return 20;
        }else{
            return 15;
        }
        
    }




}
