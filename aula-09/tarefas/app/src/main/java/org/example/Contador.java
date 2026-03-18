package org.example;

public class Contador {

    private int valorAtual;

    public void setContador(int valor) {
        this.valorAtual += valor;
        IO.println("Contador começa em " + valor);
    }

    public void incrementaContador(){
        this.valorAtual++;
        IO.println("+ 1");
    }

    public void getContador(){
        IO.println("Contador está em " + this.valorAtual + " agora");
    }

}
