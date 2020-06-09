package pl.martyna.designpatterns.bridge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.martyna.designpatterns.bridge.device.Device;
import pl.martyna.designpatterns.bridge.device.Dryer;
import pl.martyna.designpatterns.bridge.device.Lamp;
import pl.martyna.designpatterns.bridge.powersource.Battery;
import pl.martyna.designpatterns.bridge.powersource.Socket;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Base64;

import static junit.framework.TestCase.assertEquals;

public class DevicePowerSourceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpOutStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreOutStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldUseSocket(){

        Device dryer = new Dryer(new Socket());

        dryer.turnOn();

        assertEquals("Using power from socket.\nThe dryer is working.\n", outContent.toString());
    }

    @Test
    public void shouldUseBattery(){

        Device batteryLamp = new Lamp(new Battery());

        batteryLamp.turnOn();

        assertEquals("Using battery.\nThe lamp is lit.\n", outContent.toString());
    }

    @Test
    public void shouldUseSolarPanel(){
        Device solarLamp = new Lamp(() -> System.out.println("Using solar power."));

        solarLamp.turnOn();

        assertEquals("Using solar power.\nThe lamp is lit.\n", outContent.toString());
    }
}
