package Problem_2;

import Problem_2.Appetizer.French_Fry;
import Problem_2.Appetizer.Onion_Rings;
import Problem_2.Burger.Beef;
import Problem_2.Burger.Burger;
import Problem_2.Burger.Veggi;
import Problem_2.Drinks.Coffee;
import Problem_2.Drinks.Coke;
import Problem_2.Drinks.Water;

public class problem2_demo {
    public static void main(String[] args) {
        Burger burger1 = new Beef();
        burger1 = new French_Fry(burger1);
        burger1 = new Cheese(burger1);
        System.out.println("Description: " + burger1.getDescription() + "\nCost: " + burger1.Cost());

        Burger burger2 = new Veggi();
        burger2 = new Onion_Rings(burger2);
        burger2 = new Water(burger2);
        System.out.println("Description: " + burger2.getDescription() + "\nCost: " + burger2.Cost());

        Burger burger3 = new Veggi();
        burger3 = new French_Fry(burger3);
        burger3 = new Coke(burger3);
        System.out.println("Description: " + burger3.getDescription() + "\nCost: " + burger3.Cost());

        Burger burger4 = new Veggi();
        burger4 = new Onion_Rings(burger4);
        burger4 = new Coffee(burger4);
        burger4 = new Water(burger4);
        System.out.println("Description: " + burger4.getDescription() + "\nCost: " + burger4.Cost());

        Burger burger5 = new Beef();
        System.out.println("Description: " + burger5.getDescription() + "\nCost: " + burger5.Cost());
    }
}
