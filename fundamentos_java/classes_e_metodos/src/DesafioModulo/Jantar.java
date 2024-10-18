package DesafioModulo;

public class Jantar { 

    public static void main(String[] args) {
        /**Classe jantar vai ter o metodo main 
        vai instanciar pessoa , instanciar 2  comida s

        Pessoa vai ter peso, nome, vai ter metodo chamado comer e vai receber um parametro um outro objeto da classe comida 
        A classe comida vai ter nome e peso
        QUando passar o objeto comida para o metodo comer da pessoa
        pegar o peso da comida e acrescentar o peso da pessoa 
        

        criar 3 classes
        Jantar - la criar 2 comidas e fazer a pessoa comer a comida e mostrar o antes e depois 
        */

        Pessoa p1 = new Pessoa("Joao", 80);

        System.out.printf("Pessoa ANTES de comer:\nNome: %s \nPeso:%.2fkg ",p1.nomePessoa , p1.pesoPessoa);

        p1.comerPrato("Feijoada", 0.91);
        p1.comerPrato("Batata", 1.51);
        p1.comerPrato("Manteiga", 1.61);
        p1.comerPrato("Carne", 1.31);
        p1.comerPrato("Arroz", 1.21);
        p1.comerPrato("Leite", 1.11);
        p1.comerPrato("Cebola", 1.11);

      

        System.out.printf("\nPessoa DEPOIS de comer:\nNome: %s \nPeso:%.2fkg ",p1.nomePessoa , p1.pesoPessoa); 

        

    }

}
