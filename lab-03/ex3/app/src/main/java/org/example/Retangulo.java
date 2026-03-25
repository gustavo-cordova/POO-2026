package org.example;

public class Retangulo {

    int altura;
    int largura;
    String codificacao ;

    public Retangulo(int altura, int largura, String codificacao) {
        if (!(this.setAltura(altura) && (this.setLargura(largura) && (this.setCodificacao(codificacao))))) {
            this.altura = altura;
            this.largura = largura;
            this.codificacao = codificacao;

        }

    }

    public Retangulo() {
        this(3, 4, "ascii");
    }

    public int calcularArea(int altura, int largura){
        return largura * altura;
    }

    public int calcularPerimetro (int altura, int largura){
        return  2*(largura + altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", codificacao='" + codificacao + '\'' +
                '}';
    }

    public boolean setAltura(int altura) {
        if (this.altura <= 0){
            return false ;
        }
        this.altura = altura;
        return true;
    }

    public boolean setLargura(int largura) {
        if (this.largura <= 0){
            return false;
        }
        this.largura = largura;
        return true;
    }

    public boolean setCodificacao(String codificacao) {
        if (!codificacao.equalsIgnoreCase("utf8")){
            this.codificacao = "ascii";
            return false;
        }
        else {
            this.codificacao = "utf8";
            return true;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCodificacao() {
        return codificacao;
    }


}
