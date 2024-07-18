package Problem_2.Drinks;

import Problem_2.Burger.Burger;

public class Coffee extends Drink {
    Burger burger;

    public Coffee(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Coffee";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 150;
    }
}
