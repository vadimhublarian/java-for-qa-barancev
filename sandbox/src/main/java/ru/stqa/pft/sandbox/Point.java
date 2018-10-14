package ru.stqa.pft.sandbox;

/**
 * Created by MasterJedi on 14.10.2018.
 * sandbox
 */
public class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        // AB = √(Xb - Xa)^2 + (Yb - Ya)^2
        return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
    }
}
