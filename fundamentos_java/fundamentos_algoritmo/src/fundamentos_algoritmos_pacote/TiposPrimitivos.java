package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroVoos = 5678;
        int Id = 23654435;
        long pontosAcumulados = 3_321_345_543L;

        // tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_543_543_103.01;

        // tipo bolleano
        boolean estadaDeFerias = false;

        //tipo de caractere
        char status = 'A';

        //dias de empresa
        System.out.println(anosDeEmpresa *365);
        System.out.println(numeroVoos/2);
        System.out.println(Id+"Ganha"+salario);
        System.out.println("Ferias"+estadaDeFerias);
        System.out.println(pontosAcumulados/vendasAcumuladas);
        System.out.println("Status"+status);
    }
}
