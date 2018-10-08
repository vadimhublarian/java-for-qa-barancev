package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by MasterJedi on 08.10.2018.
 */
public class SquareTests {
    @Test
    public void testArea(){
        Square square = new Square(5);
        Assert.assertEquals(square.area(), 25.0);
    }
}
