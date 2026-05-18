## UML JAVA OF EMPIRES

```mermaid
classDiagram
    
    class Personagem{
        <<abstract>>
        -vida: int
        -ataque: int
        -velocidade: int
        +Personagem(int: vida, int: ataque, int: velocidade )
        +mover() String*
        +atacar() String*
    }
    
    class Aldeao{
    }
    
    class Arqueiro{
    }
    
    class Cavaleiro{
    }
    
    Personagem<|--Aldeao
    Personagem<|--Arqueiro
    Personagem<|--Cavaleiro
    
```