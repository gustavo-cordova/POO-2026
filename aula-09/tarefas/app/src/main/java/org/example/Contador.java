package org.example;

public class Contador {

    private int valorAtual;

    public void setContador(int valor) {
        this.valorAtual += valor;
    }

    public void incrementaContador(){
        this.valorAtual++;
    }

    public int getContador(){
        return valorAtual;
    }

}
