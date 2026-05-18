package org.example;

public class Aldeao extends Personagem implements Guerreiro, Coletador {
    public Aldeao(){
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeão está caminhando";
    }

    @Override
    public String atacar() {
        return "Aldeão está socando";
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão está coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão está coletando ouro";
    }
}

