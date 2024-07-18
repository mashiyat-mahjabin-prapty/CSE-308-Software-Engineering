import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    private int temperature;
    List<IObserver> observerList = new ArrayList<>();

    public int getTemperature()
    {
        return temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;

        notifyObservers(temperature);
    }

    @Override
    public void register(IObserver o)
    {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o)
    {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedTemperature)
    {
        for (int i = 0; i < observerList.size(); i++)
        {
            observerList.get(i).update(updatedTemperature);
        }
    }
}
