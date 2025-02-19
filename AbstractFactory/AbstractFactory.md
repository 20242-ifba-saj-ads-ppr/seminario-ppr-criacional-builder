## Padrão Abstract Factory
O Abstract Factory é um padrão criacional que fornece uma interface para criação de famílias de objetos relacionados sem especificar suas classes concretas. Ele permite que o sistema seja projetado de forma flexível e extensível, promovendo a separação entre a lógica de criação e o uso. Diferente de uma simples fábrica (Factory Method), a Abstract cria múltiplos objetos relacionados de uma vez, garantindo que todos sigam um mesmo conjunto de regras e funcionem em conjunto.

### Motivação
Considere um jogo onde há diferentes tipos de personagens, como humanos, elfos e orcs. Cada raça possui variações de classes, como guerreiro, mago e arqueiro. Sem o Abstract Factory, a criação de personagens exigiria múltiplas verificações de tipo espalhadas pelo código, tornando a manutenção difícil e violando o princípio de responsabilidade única. Mas, com o Abstract Factory é possível: Criar famílias inteiras de personagens sem precisar modificar o código que os utiliza; Garantir compatibilidade entre os objetos criados; Facilitar expansões futuras. Esse padrão melhora legibilidade e modularidade, tornando o código escalável e organizado.

### Exemplo UML:
@startuml
' Interface para a Abstract Factory
interface EntityFactory {
    + createEntity(type: String, health: int, speed: int, damage: int) : Entity
}

' Implementação concreta da fábrica
class ConcreteEntityFactory implements EntityFactory

' Classe base Entity
class Entity {
    + type : String
    + health : int
    + speed : int
    + damage : int
}

' Subclasses específicas
class Enemy extends Entity {
    + ai : String
}

class Player extends Entity {
    + controller : int
}

ConcreteEntityFactory ..|> EntityFactory
ConcreteEntityFactory --> Entity : "cria"
Entity <|-- Enemy
Entity <|-- Player
@enduml


## Exemplo JS:
```js
// Objeto que contém as funções para criar cada tipo de entidade

const buildEntity = {
    player: (entity) => {
        return new Player(entity.health, entity.speed, entity.damage, entity.controller);
    },
    enemy: (entity) => {
        return new Enemy(entity.health, entity.speed, entity.damage, entity.ai);
    },
};

// Abstract Factory que instancia entidades dinamicamente
class EntityFactory {
    static createEntity({ type, health = 3, speed = 1, damage = 1, ai = "basic", controller = 1 }) {
        const entity = { type, health, speed, damage, ai, controller };
        return buildEntity[entity.type](entity);
    }
}

// Criando entidades usando a fábrica abstrata
const player1 = EntityFactory.createEntity({ type: "player" });
const enemy1 = EntityFactory.createEntity({ type: "enemy", health: 5, speed: 1, damage: 3, ai: "melee" });
```

& Implementado por: Adriano Victor e Pedro Victor Hipolito
