package Problem_1.Builder;

import Problem_1.Communication_Channel.Com_Channel;
import Problem_1.Display_Controller.Display_Unit;

public class Product {
    int numDisplay;
    Display_Unit displayUnit;
    Com_Channel comChannel;
    static float web_app_cost = 10000;

    public void addDisplay(int num, Display_Unit displayUnit)
    {
        numDisplay = num;
        this.displayUnit = displayUnit;
    }

    public void setComChannel(Com_Channel comChannel)
    {
        this.comChannel = comChannel;
    }

    public void show()
    {
        System.out.println("Product Completed as below:");
        System.out.println(displayUnit);
        System.out.println("Number of display units: " + numDisplay);
        System.out.println(comChannel);
    }

    public void getCost()
    {
        double cost;
        cost = numDisplay*displayUnit.getCost();
        cost += comChannel.connection_cost()*12.0+comChannel.module_cost();
        cost += web_app_cost;
        System.out.println("The cost of the system is: " + cost);
    }
}
