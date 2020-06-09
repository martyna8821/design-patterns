package pl.martyna.designpatterns.bridge.powersource;

public class Socket implements PowerSource {

    @Override
    public void power() {
        System.out.println("Using power from socket.");
    }
}
