package Problem_1.Builder;

import Problem_1.Communication_Channel.Com_Channel_Factory;
import Problem_1.Display_Controller.Optimal;

public class OptimalType implements IBuilder{
    Product product = new Product();

    public OptimalType(int numDisplay, String comChannel)
    {
        BuildDisplayUnit(numDisplay);
        BuildComChannel(comChannel);
    }

    @Override
    public void BuildDisplayUnit(int numDisplay) {
        product.addDisplay(numDisplay, new Optimal());
    }

    @Override
    public void BuildComChannel(String name) {
        Com_Channel_Factory com_channel_factory = new Com_Channel_Factory();
        product.setComChannel(com_channel_factory.getChannel(name));
    }
    @Override
    public Product getProduct() {
        return product;
    }
}
