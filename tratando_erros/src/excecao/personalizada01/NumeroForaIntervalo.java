package excecao.personalizada01;



public class NumeroForaIntervalo extends RuntimeException{


    private String nomeAtributo;
    public NumeroForaIntervalo(String atributo) {
        this.nomeAtributo = atributo;
    }

    public String getMessage(){
        return String.format("O valor do atributo '%s' é negativo", nomeAtributo);
    }



    

}
