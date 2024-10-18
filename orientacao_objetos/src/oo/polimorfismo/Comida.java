package oo.polimorfismo;


public abstract class Comida {
    double peso;



    public Comida(){

    }

    public Comida(double pesoComida){
        setPeso(pesoComida);

    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




    

}
