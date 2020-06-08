package pl.martyna.designpatterns.adapter;

public class Client {

    public static void main(String[] args){
        Thermometer wallThermometer = new WallThermometer();
        System.out.format("Thermometer shows %.2f celsius degrees\n", wallThermometer.getTemperature());

        Thermometer adaptedElectricThermometer = new FahrenheitTemperatureAdapter(new ElectricFahrenheitTemperatureGauge());
        System.out.format("Thermometer shows %.2f celsius degrees\n", adaptedElectricThermometer.getTemperature());

        Thermometer negativeTempAdapter = new FahrenheitTemperatureAdapter(() -> (0.0));
        System.out.format("Thermometer shows %.2f celsius degrees\n", negativeTempAdapter.getTemperature());
    }
}
