// void main (){

//     int[] vetor = new int[3];

//     vetor[0] = 10;
//     vetor[1] = 2;
//     vetor[2] = 5;


//     int [][] matriz = new int[2][3];

//     matriz [1][2] = 10;


void main (){


    int [][] quadrado = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i < quadrado.length; i++) {
            for(int j=0; j < quadrado[i].length; j++) { 

                if (i != j) {

                    IO.print(" ");
                }

                else {

                    IO.print(quadrado[i][j]);

                }

            }

        IO.println();
    }

}