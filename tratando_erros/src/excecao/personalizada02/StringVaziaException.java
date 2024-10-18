package excecao.personalizada02;

public class StringVaziaException extends Exception{

    private String nomeAtributo;

    public StringVaziaException(String atributo){
        this.nomeAtributo = atributo;
    }

    public String getMessage() {
        return String.format("O valor do atributo '%s' esta vazio", nomeAtributo);
    }

}
