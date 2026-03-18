package org.example;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAXIMA = 23;
    private static final int MINUTO_MAXIMO = 59;
    private static final int SEGUNDO_MAXIMO = 59;


    public String toString(){
        return String.format ("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void setHorario(int h, int m, int s){

        if (h < 0 || h > HORA_MAXIMA) {
            return;
        }
        if (m < 0 || m > MINUTO_MAXIMO) {
            return;
        }
        if (s < 0 || s > SEGUNDO_MAXIMO) {
            return;
        }
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public void setHorario(int h, int m){
        this.setHorario(h, m, 0);
    }

    public void setHorario(int h){
        this.setHorario(h, 0, 0);
    }




















    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
