public class ObserverMax implements IObserver{
    private int maximumTemp;
    private int count;
    public ObserverMax()
    {
        maximumTemp = Integer.MIN_VALUE;
        count = 0;
    }
    @Override
    public void update(int i)
    {
        if(i > maximumTemp)
        {
            maximumTemp = i;
        }
        //System.out.println("Maximum temperature updated");
        System.out.println("At " + count + "th hour the maximum temperature is: " + maximumTemp);

        count++;
    }
}
