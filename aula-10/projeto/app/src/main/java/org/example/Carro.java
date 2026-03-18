package org.example;

public class Carro {

    public String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;


    public static final int VELOCIDADE_MAXIMA = 300;
    private static final int VELOCIDADE_MINIMA = 0;



    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = VELOCIDADE_MAXIMA;
    }

    public int acelerar(int i){
        velocidadeAtual = (velocidadeAtual + i <= 200) ? velocidadeAtual+i : 300;
        return velocidadeAtual;
    }

    public void freiar(int d){
        velocidadeAtual = (velocidadeAtual - d >= 0) ? velocidadeAtual-d : 0;
    }






}
