package org.example;

public class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade){
        this.vida = vida;
        this.ataque=ataque;
        this.velocidade=velocidade;
    }

    public String mover(){
        return "está se movendo";
    }

    public String atacar(){
        return "está atacando";
    }


}
