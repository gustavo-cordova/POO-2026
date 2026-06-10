````mermaid
classDiagram
    
    class Dado{
        #valor: int
        #estatisticas: int[]
        #numeroFaces: int
        +jogar() int
        +imprimirEst()String
        }
 
 class dadoGUI{
     -x: int
     -y: int
     +desenhar(Draw d) void
     }
     
     
     
     

Dado<|--dadoGUI

````

````mermaid
classDiagram

    class Draw{

    }
    
    class Elemento{
        <<interface>>
        +desenhar(Draw d)void
    }

    class Dado{
        #valorface: int
        #numeroFaces: int
        #estatisticas: int[]
        +imprimirEst()String
    }
    
    class Carta{
        #naipe: String
        #valor: String
        #viradaPraCima: boolean
    }
    
    class DadoGUI{
        -x: int
        -y: int
    }
    
    class CartaGUI{
        -x: int
        -y: int
    }
 
        
    Draw<..Elemento
    Elemento<|..DadoGUI
    Elemento<|..CartaGUI
    DadoGUI--|>Dado
    CartaGUI--|>Carta
    
    
    
    
    


````