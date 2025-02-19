## Padrão Object Pool
O Object Pool é um padrão de projeto criacional que reduz o custo de criação e destruição de objetos ao reutilizar instâncias em vez de instanciar novas. Esse padrão é útil em cenários onde a criação de objetos é cara, como no gerenciamento de conexões a banco de dados, renderização de gráficos ou alocação de memória intensiva.

### Exemplo de Melhora:
Imagine um jogo onde diversos projéteis são disparados por armas a todo momento. Se cada projétil for criado do zero, o sistema terá que alocar memória para cada nova instância, e quando o projétil desaparecer, o Garbage Collector terá que limpar a memória repetidamente. Isso pode gerar pausas e impactar a fluidez do jogo. Sendo assim, reutilizar os projéteis através de uma Pool oferece maior performance no sistema, visto que irá gerar menos carga para o gerenciamento de memória, além de descartar novos cálculos complexos vinculados ao contexto de criar novas instâncias repetidamente.

### Exemplo UML:
@startuml
' Classe que gerencia o pool de objetos
class EntityPool {
    - pool : List<Entity>
    - createFn : () -> Entity
    - maxSize : int
    + acquire() : Entity
    + release(Entity)
}

' Classe base Entity
class Entity {
    + type : String
    + health : int
    + speed : int
    + damage : int
}

' Subclasse Enemy utilizada no pool
class Enemy extends Entity {
    + ai : String
}

EntityPool --> Entity : "gerencia"
Entity <|-- Enemy
@enduml


## Exemplo JS:

```js

// Implementação do Pool de Objetos

class EntityPool {
    constructor(createFn, maxSize = 5) {
        this.createFn = createFn; 
        this.pool = [];
        this.maxSize = maxSize;

        for (let i = 0; i < maxSize; i++) {
            this.pool.push(this.createFn());
        }
    }

    // Obtém um objeto do pool (ou cria um novo se necessário)
    acquire() {
        return this.pool.length > 0 ? this.pool.pop() : this.createFn();
    }

    // Libera um objeto e o devolve ao pool
    release(obj) {
        if (this.pool.length < this.maxSize) {
            this.pool.push(obj);
        }
    }
}

// Criando um pool de inimigos do tipo "ranged"
const rangedEnemyPool = new EntityPool(() => new Enemy(5, 2, 3, "ranged"), 3);

// Pegando uma entidade do pool
const enemy3 = rangedEnemyPool.acquire();

```

& Implementado por: Adriano Victor e Pedro Victor Hipolito
