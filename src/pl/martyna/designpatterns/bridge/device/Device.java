package pl.martyna.designpatterns.bridge.device;

import pl.martyna.designpatterns.bridge.powersource.PowerSource;

public abstract class Device {

    protected PowerSource powerSource;

    public Device(PowerSource powerSource){
        this.powerSource = powerSource;
    }

     public void turnOn(){
        powerSource.power();
    };
}
