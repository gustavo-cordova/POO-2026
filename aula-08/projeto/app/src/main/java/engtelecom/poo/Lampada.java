package engtelecom.poo;

public class Lampada {

    // Atributos
    private boolean ligada = false;

    // Métodos

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligaDesliga () {
        ligada = !ligada;
    }

}




