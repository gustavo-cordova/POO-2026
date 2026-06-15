package org.example;

public class Calculadora {

    public int soma (int a, int b){
        return a+b;
    }

    /**
     * Recebe três lados e indica o tipo do trinângulo.
     * @param a lado a
     * @param b lado b
     * @param c lado c
     * @return equilátero, isósceles, escaleno e não é um triângulo
     */
    public String tipoTriangulo(int a, int b, int c){

        if (a <= 0 || b <= 0 || c <= 0){
            return "não é um triângulo";
        }

        if (a == b && b == c && c == a){
        return "equilátero";
        }

        if (a == b && b != c || a == c && c != b || b == c && c!= a){
            return "isósceles";
        }

        if (a!=b && b!=c && c!=a){
            return "escaleno";
        }
        
        return "não é um triângulo";
    }
}

