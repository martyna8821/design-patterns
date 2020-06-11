package pl.martyna.designpatterns.facade;

public class ClientApp {

    public static void main(String[] args){
        System.out.println("Facade Pattern");

        ShapeDrawer shapeDrawer = new ShapeDrawer();

        shapeDrawer.drawCircle();
        shapeDrawer.drawLine();
        shapeDrawer.drawStar();
    }
}

