package pl.martyna.designpatterns.proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.martyna.designpatterns.facade.ShapeDrawer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static junit.framework.TestCase.assertEquals;

public class ImageProxyTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Image imageProxy;

    @Before
    public void setUpOutStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreOutStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldLoadOnce(){
        imageProxy = new ProxyImage("fileName");
        Random random = new Random();
        int displayQuantity = random.nextInt(30);

        for(int i = 0; i < displayQuantity; i++){
            imageProxy.display();
        }
        int countDisplayed = ( outContent.toString().split("Displaying image...\n", -1).length ) - 1;
        int countLoad = ( outContent.toString().split("Loading image from system\n", -1).length ) - 1;

        assertEquals(displayQuantity, countDisplayed);
        assertEquals(1 ,countLoad);
    }
}
