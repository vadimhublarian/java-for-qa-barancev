package ru.stqa.pft.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        hello("World");
        hello("user");
        hello("Nick");

        Square mySquare = new Square(5);
        System.out.println("An area of a square with a side " + mySquare.squareSideLen + " = " + mySquare.area());

        Rectangle myRectangle = new Rectangle(4, 6);
        System.out.println("An area of a rectangle with a side " + myRectangle.sideAlen + " and " + myRectangle.sideBlen + " = " + myRectangle.area());
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}