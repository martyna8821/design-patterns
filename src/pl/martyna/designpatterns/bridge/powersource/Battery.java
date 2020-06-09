package pl.martyna.designpatterns.bridge.powersource;

public class Battery implements PowerSource {

    @Override
    public void power() {
        System.out.println("Using battery.");
    }
}
