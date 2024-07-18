package Problem_1.Builder;

public interface IBuilder {
    void BuildDisplayUnit(int num);
    void BuildComChannel(String name);
    Product getProduct();
}
