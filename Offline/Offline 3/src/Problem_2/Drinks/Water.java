package Problem_2.Drinks;

import Problem_2.Burger.Burger;

public class Water extends Drink {
    Burger burger;

    public Water(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Water";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 25;
    }
}
