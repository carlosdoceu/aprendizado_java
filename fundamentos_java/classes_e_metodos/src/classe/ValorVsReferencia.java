package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição de valor por tipo primitivo

        a++;
        b--;
        System.out.println(a+" "+b);




        Data d1 = new Data();
        Data d2 = d1; //atribuição por referência (objetos)

        d1.diaD = 31;
        d2.mesD = 12;

        d1.anoD = 2024;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }


    static void voltarDataParaValorPadrao(Data d){
        d.diaD = 1;
        d.mesD = 1;
        d.anoD = 1970;
    }   

}
