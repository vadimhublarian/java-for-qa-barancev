package ru.stqa.pft.sandbox;

/**
 * Created by MasterJedi on 04.10.2018.
 */
public class Rectangle {
    public double sideAlen;
    public double sideBlen;

    public Rectangle(double sideAle, double sideBlen){
        this.sideAlen = sideAle;
        this.sideBlen = sideBlen;
    }

    public double area() {
        return this.sideAlen * this.sideBlen;
    }
}
