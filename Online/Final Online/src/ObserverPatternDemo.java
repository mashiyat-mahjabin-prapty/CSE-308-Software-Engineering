import java.util.Random;

public class ObserverPatternDemo {
    private static int changeTemperature()
    {
        int i;
        Random random = new Random();
        i = random.nextInt()%30;
        if(i < 0) i = -i;
        return i;
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverMax observerMax = new ObserverMax();
        ObserverAvg observerAvg = new ObserverAvg();

        subject.register(observerMax);
        subject.register(observerAvg);

        for (int i = 0; i < 24; i++)
        {
            int j = changeTemperature();
            //System.out.println("At " + i + "th hour the temperature is: " + j);
            if(i == 15) subject.unregister(observerMax);
            if(i == 21) subject.register(observerMax);
            subject.setTemperature(j);
            System.out.println();
        }
    }
}
