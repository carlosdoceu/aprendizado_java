package classe;

public class AreaCirc {
    double raio;
    static final double PI = Math.PI;


    AreaCirc(double raioInicial){
        raio = raioInicial;
      
    }

    double area(){
        return PI * Math.pow(raio,2);
    }
}
