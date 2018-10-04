package ru.stqa.pft.sandbox;

/**
 * Created by MasterJedi on 04.10.2018.
 */
public class Square {
    public double squareSideLen;

    public Square(double squareSideLen){
        this.squareSideLen = squareSideLen;
    }

    public double area() {
        return this.squareSideLen * this.squareSideLen;
    }

}
