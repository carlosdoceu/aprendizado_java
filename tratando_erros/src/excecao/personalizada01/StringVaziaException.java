package excecao.personalizada01;

public class StringVaziaException extends RuntimeException{

    private String nomeAtributo;

    public StringVaziaException(String atributo){
        this.nomeAtributo = atributo;
    }

    public String getMessage() {
        return String.format("O valor do atributo '%s' esta vazio", nomeAtributo);
    }

}
