package classe;

public class DataTeste {
    public static void main(String[] args) {
       Data dataD = new Data();
       dataD.diaD = 28;
       dataD.mesD = 10;
       dataD.anoD = 2024;

       Data dataS = new Data();
       dataS.diaS = "Vinte e oito";
       dataS.mesS = "Outubro";
       dataS.anoS = "2024";


       System.out.printf("Aniversario da Gessica é %s de %s de %s", dataS.diaS, dataS.mesS, dataS.anoS);
       System.out.printf("\n%d/%d/%d", dataD.diaD, dataD.mesD, dataD.anoD);

    var dataObtida = new Data(32,12,2020);

       System.out.printf("\n%s", dataObtida.obterDataFormatada());


    }
    
}
