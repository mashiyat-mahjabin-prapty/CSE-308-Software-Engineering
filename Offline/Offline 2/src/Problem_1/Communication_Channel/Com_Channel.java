package Problem_1.Communication_Channel;

abstract public class Com_Channel {
    abstract public String Medium_name();
    abstract public String get_module();
    abstract public double connection_cost();
    abstract public double module_cost();
    @Override
    public String toString()
    {
        return "Communication Channel: " + Medium_name() + "\nCommunication Module: " + get_module();
    }
}
