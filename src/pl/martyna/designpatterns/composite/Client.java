package pl.martyna.designpatterns.composite;

public class Client {

    public static void main(String[] args){

        Matryoshka redMatryoshka = new Matryoshka("red");
        Matryoshka greenMatryoshka = new Matryoshka("green");
        Matryoshka blueMatryoshka = new Matryoshka("blue");

        MatryoshkaNesting dolls = new MatryoshkaNesting();
        dolls.addDoll(redMatryoshka, greenMatryoshka, null);
        dolls.addDoll(blueMatryoshka);
        dolls.open();
    }
}
