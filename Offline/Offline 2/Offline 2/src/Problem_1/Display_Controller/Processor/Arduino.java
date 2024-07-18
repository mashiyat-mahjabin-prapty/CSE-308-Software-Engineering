package Problem_1.Display_Controller.Processor;

public class Arduino extends Processor {
    public Arduino()
    {
        //System.out.println("A new Arduino Controller created");
    }
    public String getProcessor_name()
    {
        return "Arduino";
    }
    public double getProcessor_cost()
    {
        return 300.0;
    }
}
