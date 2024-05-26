package army;

public class Magician extends Warrior implements SpecialAbility {

    public Magician(int cost, int health, int damage, int dodge, int defence) {
        super(cost, health, damage, dodge, defence);
    }

    @Override
    public void RangeAbility() {
        //клон
    }
}
