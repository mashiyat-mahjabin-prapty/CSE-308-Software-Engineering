package Problem_1.Display_Controller;

import Problem_1.Display_Controller.Processor.Processor;
import Problem_1.Display_Controller.Display_System.Display_System;

abstract public class Display_Unit {
    abstract public Processor getProductControl();
    abstract public Display_System getProductDisplay();
    abstract public void CreateDisplay();
    @Override
    public String toString()
    {
        return getProductDisplay().toString() + "\n" + getProductControl().toString();
    }
    public double getCost()
    {
        return getProductDisplay().getPrice()+getProductControl().getProcessor_cost();
    }
}
