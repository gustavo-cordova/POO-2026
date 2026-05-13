package org.example;

public class Cavaleiro extends Personagem {
    public Cavaleiro(){
        super(50, 3, 2);
    }

    @Override
    public String mover() {
        return "Cavaleiro está cavalgando";
    }

    @Override
    public String atacar() {
        return "Cavaleiro está usando a espada";
    }
}
