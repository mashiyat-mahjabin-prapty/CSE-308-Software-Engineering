package Problem_1.Display_Controller;

import Problem_1.Builder.DeluxeType;
import Problem_1.Display_Controller.Processor.Processor;
import Problem_1.Display_Controller.Processor.RPi;
import Problem_1.Display_Controller.Display_System.Display_System;
import Problem_1.Display_Controller.Display_System.LCD;

public class Deluxe extends Display_Unit {
    Display_System displaySystem;
    Processor processor;

    public Deluxe()
    {
        CreateDisplay();
    }

    @Override
    public Processor getProductControl() {
        return new RPi();
    }

    @Override
    public Display_System getProductDisplay() {
        return new LCD();
    }

    @Override
    public void CreateDisplay() {
        displaySystem = getProductDisplay();
        processor = getProductControl();
    }
}
