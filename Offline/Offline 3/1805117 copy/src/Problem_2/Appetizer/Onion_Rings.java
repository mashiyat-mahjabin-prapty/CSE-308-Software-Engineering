package Problem_2.Appetizer;

import Problem_2.Burger.Burger;

public class Onion_Rings extends Appetizer{
    Burger burger;

    public Onion_Rings(Burger burger)
    {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Onion rings";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 100;
    }
}
