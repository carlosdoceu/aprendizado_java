package oo.heranca.testes;

import oo.heranca.desafio.Ferrari;

public class MainDirigir {
    public static void main(String[] args) {

        // Carro carro = new Carro();
        // carro.acelerar();
        // carro.acelerar();
        // System.out.println(carro);

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();
        System.out.println("FERRARI->>" + ferrari.velocidadeAtual);
        ferrari.acelerar();

        System.out.println("FERRARI->>" + ferrari.velocidadeAtual);
        ferrari.ligarTurbo();
        System.out.println("FERRARI->>" + ferrari.velocidadeAtual);
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println("FERRARI->>" + ferrari.velocidadeAtual +" é o Ar esta:");




        // System.out.println("FERRARI->>" + ferrari.velocidadeAtual);
        // System.out.println("Ferrari: " + ferrari);
        // System.out.println("Velocidade Maxima: " + ferrari.VELOCIDADE_MAXIMO);

        // ferrari.frear();
        // System.out.println("FERRARI->>" + ferrari.velocidadeAtual);

        // Civic civic = new Civic();
        // civic.acelerar();
        // System.out.println("CIVIC->>" + civic.velocidadeAtual);

    }
}
