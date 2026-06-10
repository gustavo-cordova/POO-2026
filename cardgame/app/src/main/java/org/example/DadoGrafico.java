package org.example;

import edu.princeton.cs.algs4.Draw;

import java.util.Random;

public class DadoGrafico extends Dado implements Elemento{

    private double x;
    private double y;

    public DadoGrafico(double x, double y, int valorFace, int stats, Random r) {
        super(valorFace, stats, r);
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar(Draw draw) {
        draw.picture(x, y, "dados/"+this.valorFace+".png");
        draw.show();
    }
}
