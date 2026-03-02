void main() {

    // int n1 = Integer.parseInt(IO.readln("Entre com a primeira nota: "));
    // int n2 = Integer.parseInt(IO.readln("Entre com a segunda nota: "));
    // int n3 = Integer.parseInt(IO.readln("Entre com a terceira nota: "));
    // int n4 = Integer.parseInt(IO.readln("Entre com a quarta nota: "));

    // int media = ((n1+n2+n3+n4) / 4);
    // IO.println(media);


    double [] notas = new double[4];

    for (int i = 0; i < notas.length; i++) {
        notas[i] = Double.parseDouble (IO.readln("Entre com a " + (i+1) + " nota: "));
       }

    double soma = 0;


    for(double d : notas) {
        soma+=d;
    }
    
    
    int media = Math.round((float)soma/4);

    IO.println("Média: " + media);



   

}