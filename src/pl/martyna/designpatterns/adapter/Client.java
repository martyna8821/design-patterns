package pl.martyna.designpatterns.adapter;

public class Client {

    public static void main(String[] args){
        Thermometer wallThermometer = new WallThermometer();
        System.out.format("Thermometer shows %.2f celsius degrees\n", wallThermometer.getTemperature());

        Thermometer adaptedThermometer = new FahrenheitTemperatureAdapter(new ElectricFahrenheitTemperatureGauge());
        System.out.format("Thermometer shows %.2f celsius degrees\n", adaptedThermometer.getTemperature());
    }
}
