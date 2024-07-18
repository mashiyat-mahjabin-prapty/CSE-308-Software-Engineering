public class ObserverAvg implements IObserver{
    private int count;
    private int sum;
    private double avg;
    public ObserverAvg()
    {
        count = 0;
        sum = 0;
    }
    @Override
    public void update(int i)
    {
        sum += i;
        avg = sum / ((count+1)*1.0);

        //System.out.println("Average temperature calculated");
        System.out.println("At " + count + "th hour the average temperature is: " + avg);

        count++;
    }
}
