package classe;

public class Data {

    int diaD, mesD, anoD;
    String diaS, mesS, anoS;

    Data() {
        diaD = 05;
        mesD = 05;
        anoD = 1998;

    }

    

    Data(int dia, int mes, int ano) {
        this.diaD = dia;
        this.mesD = mes;
        this.anoD = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", diaD, mesD, anoD);
    }


    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}
