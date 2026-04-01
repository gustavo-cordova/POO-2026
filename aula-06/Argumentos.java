public class Argumentos {
    public static void main(String[] args) {
                
        if (args.length < 2) {
            System.out.println("ERRO:  Digite pelo menos dois parâmetros");
            return;
        } 
        
        System.out.println(args[0]);
        System.out.println(args[1]);


       

        
        
        String nome = IO.readln("Entre com seu nome: ");
        System.out.println("Bom dia " + nome);
    }
}