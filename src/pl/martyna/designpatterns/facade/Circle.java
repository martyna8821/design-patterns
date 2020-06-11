package pl.martyna.designpatterns.facade;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("o");
    }
}
