package pl.martyna.designpatterns.facade;

public class ShapeDrawer {

    private Shape circle;
    private Shape line;
    private Shape star;

    public ShapeDrawer(){
        this.circle = new Circle();
        this.line = new Line();
        this.star = new Star();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawStar(){
        this.star.draw();
    }

    public void drawLine(){
        this.line.draw();
    }
}

