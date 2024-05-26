package army;

abstract class Warrior {
    int cost;
    int health;
    int damage;
    int dodge;
    int defence;
    public Warrior(int cost, int health, int damage, int dodge, int defence) {
        this.cost = cost;
        this.health = health;
        this.damage = damage;
        this.dodge = dodge;
        this.defence = defence;
    }

    public void MeleeAttack() {

    }

}
