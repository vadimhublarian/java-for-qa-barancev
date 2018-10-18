package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vadim Khublarian on 10/18/18.
 */
public class PointTests {
    @Test
    public void testDistance() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);

        Assert.assertEquals(new Point(0, 0).distance(new Point(2, 0)), 2.0);
        Assert.assertEquals(new Point(2, 0).distance(new Point(0, 0)), 2.0);
        Assert.assertEquals(new Point(0, 0).distance(new Point(0, 0)), 0.0);
        Assert.assertEquals(new Point(2, 0).distance(new Point(2, 0)), 0.0);
        Assert.assertEquals(new Point(0, 0).distance(new Point(2, 0)), 2.0);
    }
}
