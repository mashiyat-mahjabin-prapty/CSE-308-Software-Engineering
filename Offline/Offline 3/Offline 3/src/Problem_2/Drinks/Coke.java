package Problem_2.Drinks;

import Problem_2.Burger.Burger;

public class Coke extends Drink{
    Burger burger;

    public Coke(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Coke";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 45;
    }
}
