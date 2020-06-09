package pl.martyna.designpatterns.bridge.device;

import pl.martyna.designpatterns.bridge.powersource.PowerSource;

public class Dryer extends Device {

    public Dryer(PowerSource powerSource) {
        super(powerSource);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The dryer is working.");
    }
}
