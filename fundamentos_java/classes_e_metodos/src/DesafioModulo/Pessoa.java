package DesafioModulo;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;
    
    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }


    public double comerPrato(String nomePrato, double pesoPrato){
        Comida comida = new Comida(nomePrato, pesoPrato);

        return pesoPessoa+=comida.pesoPrato;
    }

}
