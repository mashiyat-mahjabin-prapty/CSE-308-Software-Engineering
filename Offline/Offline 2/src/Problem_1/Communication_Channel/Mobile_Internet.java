package Problem_1.Communication_Channel;

public class Mobile_Internet extends Com_Channel {
    @Override
    public String Medium_name() {
        return "Mobile Internet";
    }

    @Override
    public String get_module() {
        return "Sim Card";
    }

    @Override
    public double connection_cost() {
        return 50.0;
    }

    @Override
    public double module_cost() {
        return 150.0;
    }
}
