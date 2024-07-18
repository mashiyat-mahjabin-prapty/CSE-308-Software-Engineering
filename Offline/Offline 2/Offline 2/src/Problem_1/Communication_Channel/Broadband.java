package Problem_1.Communication_Channel;

public class Broadband extends Com_Channel {

    @Override
    public String Medium_name() {
        return "Wifi";
    }

    @Override
    public String get_module() {
        return "Wifi Module";
    }

    @Override
    public double connection_cost() {
        return 80.0;
    }

    @Override
    public double module_cost() {
        return 200.0;
    }

}
