package pl.martyna.designpatterns.facade;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class ShapeFacadeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ShapeDrawer shapeDrawer;

    public ShapeFacadeTest() {
        shapeDrawer = new ShapeDrawer();
    }

    @Before
    public void setUpOutStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreOutStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldDrawCircle(){

        shapeDrawer.drawCircle();
        assertEquals("o\n", outContent.toString());
    }

    @Test
    public void shouldDrawLine(){

        shapeDrawer.drawLine();
        assertEquals("___\n", outContent.toString());
    }

    @Test
    public void shouldDrawStar(){

        shapeDrawer.drawStar();
        assertEquals("*\n", outContent.toString());
    }
}
