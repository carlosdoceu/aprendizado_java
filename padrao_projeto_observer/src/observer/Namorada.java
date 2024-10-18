package observer;

public class Namorada implements ObservadorChegadoAniversariante {

    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados");
        System.out.println("APagar as luzes");
        System.out.println("Fazer Silencio");
        System.out.println("SURPRESA!!!!");
    }

}
