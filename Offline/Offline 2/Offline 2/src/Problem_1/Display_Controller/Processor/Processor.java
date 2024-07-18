package Problem_1.Display_Controller.Processor;

abstract public class Processor {
    abstract public String getProcessor_name();
    abstract public double getProcessor_cost();
    @Override
    public String toString()
    {
        return "Processor: " + getProcessor_name();
    }
}
