package Problem_2.Burger;

public class Chicken extends Burger{
    public Chicken() {
        description = "Chicken Burger";
    }
    @Override
    public int Cost() {
        return 180;
    }
}
