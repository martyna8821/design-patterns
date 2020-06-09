package pl.martyna.designpatterns.bridge;

import pl.martyna.designpatterns.bridge.device.Device;
import pl.martyna.designpatterns.bridge.device.Dryer;
import pl.martyna.designpatterns.bridge.device.Lamp;
import pl.martyna.designpatterns.bridge.powersource.Battery;
import pl.martyna.designpatterns.bridge.powersource.Socket;

public class Client {

    public static void main(String[] args){

        Device dryer = new Dryer(new Socket());
        Device lamp = new Lamp(new Socket());
        Device batteryLamp = new Lamp(new Battery());

        dryer.turnOn();
        lamp.turnOn();
        batteryLamp.turnOn();
    }
}
