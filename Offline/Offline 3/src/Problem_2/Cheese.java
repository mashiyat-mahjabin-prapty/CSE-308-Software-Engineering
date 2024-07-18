package Problem_2;

import Problem_2.Burger.Burger;

public class Cheese extends Decorator{
    Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Cheese";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 25;
    }
}
