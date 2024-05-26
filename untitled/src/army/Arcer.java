package army;

public class Arcer extends Warrior implements IClonable, SpecialAbility{

    public Arcer(int cost, int health, int damage, int dodge, int defence) {
        super(cost, health, damage, dodge, defence);
    }

    @Override
    public void RangeAbility() {
        //выстрел из далека
    }

    @Override
    public void CanBeCloned() {

    }
}
