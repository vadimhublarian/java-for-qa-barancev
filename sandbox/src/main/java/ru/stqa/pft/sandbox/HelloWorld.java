package ru.stqa.pft.sandbox;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        hello("World");
        hello("user");
        hello("Nick");

        double squareSideLen = 5;
        System.out.println("An area of a square with a side " + squareSideLen + " = " + area(squareSideLen));

        double sideAlen = 4;
        double sideBlen = 6;
        System.out.println("An area of a rectangle with a side " + sideAlen + " and " + sideBlen + " = " + area(sideAlen, sideBlen));
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}