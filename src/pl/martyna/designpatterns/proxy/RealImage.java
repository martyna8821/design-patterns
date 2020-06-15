package pl.martyna.designpatterns.proxy;

import java.nio.file.FileSystemNotFoundException;

public class RealImage implements Image{

    private String imageName;

    public RealImage(String imageName){
        this.imageName = imageName;
        this.loadImage();
    }

    private void loadImage(){
        System.out.println("Loading image from system");
    }

    @Override
    public void display(){
        System.out.println("Displaying image...");
    }
}
