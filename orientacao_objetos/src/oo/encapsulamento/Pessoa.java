package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobreNome;


    Pessoa(){
     
    }

    Pessoa(String nome,String sobrenome,int idadepessoa ){
      setIdade(idadepessoa);
      setNome(nome);
      setSobreNome(sobrenome);
    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        idade = Math.abs(idade);
        if(idade >=0 && idade <= 120){
            this.idade = idade;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    

    @Override
    public String toString() {
        return "Olá, meu nome é "+this.nome+" "+this.sobreNome+" tenho "+this.idade+" anos";
    }

 

    
    


}
