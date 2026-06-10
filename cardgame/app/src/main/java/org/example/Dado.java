package org.example;

import java.util.Random;

public class Dado {
    
    protected int valorFace;
    protected int[] stats;
    private Random r;

    
    public Dado(int valorFace, int stats, Random r){

        this.valorFace = 1;
        this.stats= new int[6];
        this.r = new Random();
    }

    public final int jogar(){
        this.valorFace = r.nextInt(1, 7);
        this.stats [this.valorFace - 1]++;
        return this.valorFace;
    }
}
