package engtelecom.poo;


public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Uso incorreto! Digite a forma e as dimensões.");
            System.out.println("Exemplos: triangulo 5");
            System.out.println("          retangulo 4 5");
            return;
        }

        switch (args[0]) {
            case "triangulo":
                int tamanhoTriangulo = Integer.parseInt(args[1]);
                fazTriangulo(tamanhoTriangulo);
                break;

            case "losango":
                int tamanhoLosango = Integer.parseInt(args[1]);
                fazLosango(tamanhoLosango);
                break;

            case "retangulo":
                if (args.length < 3) {
                    System.out.println("Informe altura e largura");
                    System.out.println("Exemplo: retangulo 4 5");
                    break;
                }
               int largura = Integer.parseInt(args[1]);
               int altura = Integer.parseInt(args[2]);
               fazRetangulo(largura, altura);
                break;

            default:
                System.out.println
                ("Forma desconhecida. Escolha: triangulo, losango ou retangulo.");
        }



    }

        public static void fazTriangulo(tamanhoTriangulo int tamanhoTriangulo){

            for (int linha = 1; linha <= tamanhoTriangulo ; linha++) {
                for (int coluna = 1; coluna <= linha ; coluna++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
