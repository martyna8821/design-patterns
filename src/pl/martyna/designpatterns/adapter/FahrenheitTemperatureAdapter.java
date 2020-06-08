package pl.martyna.designpatterns.adapter;

public class FahrenheitTemperatureAdapter implements Thermometer {

    private FahrenheitTemperatureGauge fahrenheitTemperatureGauge;

    public FahrenheitTemperatureAdapter(FahrenheitTemperatureGauge fahrenheitTemperatureGauge){
        this.fahrenheitTemperatureGauge = fahrenheitTemperatureGauge;
    }

    @Override
    public double getTemperature() {
        return (this.fahrenheitTemperatureGauge.getTemperature()-32.0)/1.8;
    }
}
