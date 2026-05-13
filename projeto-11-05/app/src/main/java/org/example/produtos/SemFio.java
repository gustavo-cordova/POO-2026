package org.example.produtos;

import org.example.Dimensao;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }
}

