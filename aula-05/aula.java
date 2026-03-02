void main () {

    // String nome = "2.4"; // 'apóstrofo' e "aspas" ... "aspas duplas" 'aspas simples'
    // int a = 10;
    // a = Integer.parseInt(nome);
    // double d = Double.parsedouble(nome);

    


    // String nome = IO.readln("Entre com o seu nome: ");
    // IO.println("Olá " + nome); 
    // ou System.out.printf ("Olá %s", nome);
    // ou IO.println (String.format("Olá $s, nome))";



    String name = IO.readln("Entre com o seu nome: ");
    int birthYear =  Integer.parseInt(IO.readln("Entre com seu ano de nascimento: "));
    // IO.println("Ano de nascimeto: " + birthYear);
    IO.println("Seu nome é " + name + ", você nasceu em " + birthYear + " e possui " + (2026 - birthYear) + " anos");

}