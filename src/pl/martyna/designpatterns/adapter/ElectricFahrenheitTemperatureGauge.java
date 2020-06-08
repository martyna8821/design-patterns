package pl.martyna.designpatterns.adapter;

public class ElectricFahrenheitTemperatureGauge implements FahrenheitTemperatureGauge {

    @Override
    public double getTemperature() {
        return 50.0;
    }
}
