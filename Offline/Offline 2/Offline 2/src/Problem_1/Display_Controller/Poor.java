package Problem_1.Display_Controller;

import Problem_1.Display_Controller.Processor.ATMega32;
import Problem_1.Display_Controller.Processor.Processor;
import Problem_1.Display_Controller.Display_System.Display_System;
import Problem_1.Display_Controller.Display_System.LED;

public class Poor extends Display_Unit {
    Display_System displaySystem;
    Processor processor;

    public Poor()
    {
        CreateDisplay();
    }

    @Override
    public Processor getProductControl() {
        return new ATMega32();
    }

    @Override
    public Display_System getProductDisplay() {
        return new LED();
    }

    @Override
    public void CreateDisplay() {
        displaySystem = getProductDisplay();
        processor = getProductControl();
    }
}
