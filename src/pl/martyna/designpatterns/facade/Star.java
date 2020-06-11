package pl.martyna.designpatterns.facade;

public class Star implements Shape {

    @Override
    public void draw() {
        System.out.println("*");
    }
}
