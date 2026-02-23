void main() {

    int i = 10;
    String resultado = "Iniciando";

    switch (i) {
        case 1:
            resultado = "um";
            break;

        case 2:
            resultado = "dois";
            break;

        case 3:
            resultado = "três";
            break;

        default:
            resultado = "Outro Valor";
            break;
    }

    IO.println(resultado);

    String s = switch(i) {
        case 1 -> "um";
        default -> "Outro";
    };
    IO.println(s);


}