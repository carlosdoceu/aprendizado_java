package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadoAniversariante> observadores = new ArrayList<>();

    public void regristarObservador(ObservadorChegadoAniversariante observador) {
        observadores.add(observador);

    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou?");
            valor = entrada.nextLine();


            if ("sim".equalsIgnoreCase(valor)) {

                //criar o evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());


                observadores.forEach(o-> o.chegou(evento));
                valor = "sair";
                entrada.close(); 
            }else{

                System.out.println("Alarme Falso");
                
            }
        }

    }

}
