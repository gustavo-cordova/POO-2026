package org.example;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String t, Pessoa a){
        this.titulo = t;
        this.autor = a;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){

        Capitulo primeiro = new Capitulo(t);
        capitulos.add(primeiro);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "capitulos=" + capitulos +
                '}';
    }
}
