package army;

public class Infantryman extends Warrior implements IClonable, SpecialAbility{

    public Infantryman(int cost, int health, int damage, int dodge, int defence) {
        super(cost, health, damage, dodge, defence);
    }

    @Override
    public void RangeAbility() {
        //бафф тяжёлого
    }

    @Override
    public void CanBeCloned() {

    }
}
