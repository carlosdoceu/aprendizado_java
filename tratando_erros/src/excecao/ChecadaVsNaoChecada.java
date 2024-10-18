package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();    
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro02();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }


    // Exceção Não checada ou não verificada
    private static void geraErro1() {
       throw new RuntimeException("Erro 1\n");
    }

    //Exceção checada ou verificada
    private static void geraErro02() throws Exception {
        throw new Exception("Erro 2\n");

    }
}
