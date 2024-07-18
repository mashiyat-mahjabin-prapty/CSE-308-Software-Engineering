package Problem_1.Display_Controller;

import Problem_1.Display_Controller.Processor.Arduino;
import Problem_1.Display_Controller.Processor.Processor;
import Problem_1.Display_Controller.Display_System.Display_System;
import Problem_1.Display_Controller.Display_System.LED;

public class Optimal extends Display_Unit {
    Display_System displaySystem;
    Processor processor;

    public Optimal()
    {
        CreateDisplay();
    }

    @Override
    public Processor getProductControl() {
        return new Arduino();
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
