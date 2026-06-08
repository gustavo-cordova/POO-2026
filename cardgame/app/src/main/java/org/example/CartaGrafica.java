package org.example;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;
import java.awt.*;

public class CartaGrafica extends Carta{

    private boolean praCima;
//    private String cor;
    private double x;
    private double y;
    private double lado;


    public CartaGrafica(Naipe naipe, Valores valor, double x, double y, boolean praCima) {
        super(naipe, valor);
        this.praCima = praCima;
        this.x = x;
        this.y = y;
    }

    public boolean clicouDentro(double x, double y){
        ImageIcon imageIcon = new ImageIcon("1o.png");
        Image image = imageIcon.getImage();

        int largura = 72;
        int altura = 96;

        return false;
    }

    public void desenharCarta (Draw draw){
        draw.picture(x, y, "cartas/"+valor.inicial+naipe.incial+".png");
        draw.show();
    }

}

