package pl.martyna.designpatterns.composite;

public class Matryoshka implements Doll {

    private String colour;

    public Matryoshka(String colour) {
        this.colour = colour;
    }

    @Override
    public void open() {
        System.out.println(String.format("Opening %s matryoshka.", this.colour));
    }
}
