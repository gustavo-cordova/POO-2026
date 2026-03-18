package org.example;

public class Personagem {

    private int power;
    private int speed;
    private int magic;

    private final int TOTAL_PONTOS = 10;

    public void upparPower(int incrementa) {
        if (this.power+this.speed+this.magic+incrementa <= TOTAL_PONTOS){
            this.power += incrementa;
        }
    }

    public void upparSpeed(int incrementa) {
        if (this.power+this.speed+this.magic+incrementa <= TOTAL_PONTOS){
            this.speed += incrementa;
        }
    }

    public void upparMagic(int incrementa) {
        if (this.power+this.speed+this.magic+incrementa <= TOTAL_PONTOS){
            this.magic += incrementa;
        }
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "magic=" + magic +
                ", speed=" + speed +
                ", power=" + power +
                '}';
    }
}
