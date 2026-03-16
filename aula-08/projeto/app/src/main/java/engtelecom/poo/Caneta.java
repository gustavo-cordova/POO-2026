package engtelecom.poo;

public class Caneta {

    private String cor;

    private double nivelTinta;

    private boolean tampaAberta = false;


    public void setCor(String c){
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void setNivelTinta(double n) {
        nivelTinta = n;
    }

    public double getNiveltinta(){
        return nivelTinta;
    }

    public boolean istampaAberta(){
        return tampaAberta;
    }

    public void abreFechaTampa() {
        tampaAberta = !tampaAberta;
    }

    public String desenhar (int x1, int x2, int y1, int y2) {

        if (istampaAberta()){
            return "A tampa está fechada. Abra-a primeiro";
        }

        double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        double consumo = distancia * 0.01;

        if (consumo > nivelTinta){
            return "Não há tinta suficiente";
        }

        nivelTinta -= consumo;
        return String.format("Desenhei %.2f cm e consumi %.2f de tinta", distancia, consumo);

    }

}
