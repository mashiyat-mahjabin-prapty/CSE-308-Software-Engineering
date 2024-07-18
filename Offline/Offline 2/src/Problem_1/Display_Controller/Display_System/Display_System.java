package Problem_1.Display_Controller.Display_System;

abstract public class Display_System {
    abstract public double getPrice();
    abstract public String getName();
    @Override
    public String toString()
    {
        return "Display Type: " + getName();
    }
}
