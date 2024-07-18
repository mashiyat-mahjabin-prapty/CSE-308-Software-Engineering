package Problem_2.Appetizer;

import Problem_2.Burger.Burger;

public class French_Fry extends Appetizer{
    Burger burger;

    public French_Fry(Burger burger)
    {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with French Fry";
    }

    @Override
    public int Cost() {
        return burger.Cost() + 80;
    }
}
