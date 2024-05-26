package army;

public class Healer extends Warrior implements SpecialAbility {

    public Healer(int cost, int health, int damage, int dodge, int defence) {
        super(cost, health, damage, dodge, defence);
    }

    @Override
    public void RangeAbility() {
        //хил
    }
}
