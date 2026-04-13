package org.example;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro(String m, Motor p){
        this.marca = m;
        this.propulsor = p;
    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }

    public void trocarMotor(Motor p){
        this.propulsor = p;
    }
}
