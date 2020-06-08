package pl.martyna.designpatterns.adapter;

import org.junit.Test;
import pl.martyna.designpatterns.adapter.*;

import static org.junit.Assert.assertEquals;


public class FahrenheitTemperatureAdapterTest {

    @Test
    public void convertsToCelsiusTemperatureTest(){
        Thermometer electricAdapter = new FahrenheitTemperatureAdapter(new ElectricFahrenheitTemperatureGauge());
        Thermometer zeroTempAdapter = new FahrenheitTemperatureAdapter(() -> (32.0));
        Thermometer roomTempAdapter = new FahrenheitTemperatureAdapter(() -> (70.0));
        Thermometer negativeTempAdapter = new FahrenheitTemperatureAdapter(() -> (0.5));

        assertEquals(electricAdapter.getTemperature(), 10, 0.1);
        assertEquals(zeroTempAdapter.getTemperature(), 0, 0.1);
        assertEquals(roomTempAdapter.getTemperature(), 21.1, 0.1);
        assertEquals(negativeTempAdapter.getTemperature(), -17.5, 0.1);
    }
}
