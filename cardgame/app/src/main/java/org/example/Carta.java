package org.example;

public class Carta {

    protected Naipe naipe;
    protected Valores valor;

    public Carta(Naipe naipe, Valores valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "naipe=" + naipe +
                ", valor=" + valor +
                '}';
    }
}
