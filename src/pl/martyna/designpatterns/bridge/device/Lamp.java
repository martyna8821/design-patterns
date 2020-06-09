package pl.martyna.designpatterns.bridge.device;

import pl.martyna.designpatterns.bridge.powersource.PowerSource;

public class Lamp extends Device {

    public Lamp(PowerSource powerSource) {
        super(powerSource);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The lamp is lit.");
    }
}
