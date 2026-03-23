package org.example;

public class Horario {

    public int hora;
    public int minuto;
    public int segundo;

    public Horario(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    };

    public Horario(int hora, int minuto, int segundo) {
        if (!(this.setHora(hora) && this.setMinuto(minuto) && this.setSegundo(segundo))){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int hora, int minuto){
        this(hora, minuto, 0);
    }

    public Horario(int hora){
        this(hora, 0 ,0);

    }

    public boolean setHora(int hora) {
        if (hora > 23 || hora < 0) {
            return false;
        }
        this.hora = hora;
        return true;
    }

    public boolean setMinuto(int minuto) {
        if (minuto > 59 || minuto < 0){
            return false;
        }
        this.minuto = minuto;
        return true;
    }

    public boolean setSegundo(int segundo) {
        if (segundo > 59 || segundo < 0){
            return false;
        }
        this.segundo = segundo;
        return true;
    }

    @Override
    public String toString() {
        return String.format ("%02d:%02d:%02d", hora, minuto, segundo);    }
}

    private String converterParaExtenso (int valor){
        switch (){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";



            case 20 -> "vinte"
    }

    public String paraExtendo(){
            int horasDezenas = (this.hora / 10) * 10;
            int horaUnidades = (this.hora % 10;

            String h = (this.hora == 1) ? "uma" : (this.hora == 2) ? "duas" : (hora < 20) ?
            converterParaExtenso(hora):converterParaExtenso(horasDezenas) + " " + converterParaExtenso(horaUnidades);
        };
