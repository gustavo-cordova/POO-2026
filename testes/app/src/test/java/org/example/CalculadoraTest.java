package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class CalculadoraTest {

//        @Test
//        public void soma() {
//            Calculadora c = new Calculadora();
//
//            assertEquals(2, c.soma(1, 1), "positivos");
//        }

        @Test
        public void triangulo(){

            Calculadora c = new Calculadora();

            assertEquals("equilátero", c.tipoTriangulo(3, 3, 3));
            assertEquals("isósceles", c.tipoTriangulo(2, 3, 3) );
            assertEquals("isósceles", c.tipoTriangulo(3, 2, 3) );
            assertEquals("isósceles", c.tipoTriangulo(3, 3, 2) );
            assertEquals("escaleno", c.tipoTriangulo(4, 5, 6));
            assertEquals("escaleno", c.tipoTriangulo(5, 4, 6));
            assertEquals("escaleno", c.tipoTriangulo(6, 5, 4));
            assertEquals("escaleno", c.tipoTriangulo(4, 6, 5));
            assertEquals("não é um triângulo", c.tipoTriangulo(0,0,0));
            assertEquals("não é um triângulo", c.tipoTriangulo(3, 3, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(3, 0, 3));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, 3, 3));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, 0, 3));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, 3, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(3, 0, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(-1, -1, -1));
            assertEquals("não é um triângulo", c.tipoTriangulo(-1, -1, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(-1, 0, -1));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, -1, -1));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, 0, -1));
            assertEquals("não é um triângulo", c.tipoTriangulo(0, -1, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(-1, 0, 0));
            assertEquals("não é um triângulo", c.tipoTriangulo(-4, -5, -6));
            assertEquals("não é um triângulo", c.tipoTriangulo(-4, -5, 6));
            assertEquals("não é um triângulo", c.tipoTriangulo(-4, 5, -6));
            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//            assertEquals("não é um triângulo", c.tipoTriangulo(4, -5, -6));
//


        }
    }
