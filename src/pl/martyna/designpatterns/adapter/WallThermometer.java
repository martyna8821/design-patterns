package pl.martyna.designpatterns.adapter;

public class WallThermometer implements Thermometer {

    @Override
    public double getTemperature() {
        return 23.6;
    }
}
