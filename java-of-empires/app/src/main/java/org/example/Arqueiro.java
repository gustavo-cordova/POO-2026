package org.example;

public class Arqueiro extends Personagem {
    public Arqueiro(){
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "Arqueiro está correndo";
    }

    @Override
    public String atacar() {
        return "Arqueiro está atirando flechas";
    }
}
