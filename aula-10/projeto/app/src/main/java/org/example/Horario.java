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

    public int setHorario(int h, int m, int s){
        this.hora = h; if (h > HORA_MAXIMA) return h;
        this.minuto = m; if (m > MINUTO_MAXIMO) return m;
        this.segundo = s; if (s > SEGUNDO_MAXIMO) return s;
        return s;
    }


}
