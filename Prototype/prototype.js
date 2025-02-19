class Enemy {
    constructor(name, health, attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    clone() {
        return new Enemy(this.name, this.health, this.attack);
    }
}

class EnemyDirector {
    static cloneWithBuffs(enemy, extraHealth, extraAttack) {
        const clone = enemy.clone();
        clone.health += extraHealth;
        clone.attack += extraAttack;
        return clone;
    }
}

const orcBuffed = EnemyDirector.cloneWithBuffs(baseOrc, 50, 5);
const baseOrc = new Enemy("Orc", 100, 15);
const clonedOrc = baseOrc.clone();
