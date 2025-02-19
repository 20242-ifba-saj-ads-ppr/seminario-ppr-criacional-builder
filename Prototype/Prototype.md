## Padrão Prototype
O padrão Prototype é um padrão de projeto criacional que permite a clonagem de objetos já existentes. Isso é útil quando a criação de um objeto envolve processos custosos de inicialização, como cálculos complexos, carregamento de dados ou consumo de memória. No Prototype, um objeto serve como um modelo base, permitindo que novas instâncias sejam criadas a partir dele por meio de cópias diretas. Essas cópias preservam o estado do objeto original e podem ser modificadas conforme o contexto.

### Exemplo de Necessidade:
Considere um jogo onde diferentes inimigos são criados dinamicamente durante a execução. Cada inimigo tem um conjunto de atributos, como vida, velocidade, força e resistência. Criar inimigos do zero pode ser ineficiente, especialmente se houver um grande número de instâncias sendo criadas constantemente. Sem o uso do Prototype, cada inimigo criado precisaria: Alocar memória para a nova instância; Definir atributos individualmente; Executar cálculos de inicialização; Repetir o processo desnecessariamente. O padrão Prototype melhora essa situação ao permitir a clonagem direta de objetos, reduzindo a carga no Garbage Collector e minimizando operações repetitivas.


### Exemplo UML:
@startuml
' Interface Prototype
interface Prototype {
    + clone() : Prototype
}

' Classe base Entity
class Entity implements Prototype {
    + type : String
    + health : int
    + speed : int
    + damage : int
    + clone() : Prototype
    + reset(health, speed, damage)
}

' Subclasses específicas
class Enemy extends Entity {
    + ai : String
}

class Player extends Entity {
    + controller : int
}

Entity ..|> Prototype
Enemy ..|> Entity
Player ..|> Entity
@enduml


## Exemplo JS:
```js

class Entity {
    constructor(type, health, speed, damage) {
        this.type = type;
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }

    // Implementação do padrão Prototype
    clone() {
        const clone = this.constructor;
        const properties = Object.assign({}, this);
        return new clone(...Object.values(properties));
    }

    reset(health, speed, damage) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }
}

class Enemy extends Entity {
    constructor(health, speed, damage, ai) {
        super("enemy", health, speed, damage);
        this.ai = ai;
    }
}

class Player extends Entity {
    constructor(health, speed, damage, controller) {
        super("player", health, speed, damage);
        this.controller = controller;
    }
}

// Criando um inimigo e clonando-o
const enemy1 = new Enemy(5, 1, 3, "melee");
const enemy2 = enemy1.clone(); 
// Clone rápido do inimigo existente
```

& Implementado por: Adriano Victor e Pedro Victor Hipolito
