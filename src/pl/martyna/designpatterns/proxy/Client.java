package pl.martyna.designpatterns.proxy;

public class Client {

    public static void main(String[] args){
        Image image = new ProxyImage("fileName");
        image.display();
        image.display();
        image.display();
    }
}
