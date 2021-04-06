package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle(10,"Red");
        r2 = new Rectangle(14.5, "red");
        r3 = new Rectangle(15.0, 23.5);
        r4 = new Rectangle(15.0, 23.5);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(314, (int) r1.getArea());
        assertEquals(660, (int) r2.getArea());
        assertEquals(1735, (int) r3.getArea());
        assertEquals(3, (int) r4.getArea());
    }

    @Test
    public void shouldCalculateDiagonal() {

        assertEquals(62, (int) r1.getDiagonal());
        assertEquals(91, (int) r2.getDiagonal());
        assertEquals(147, (int) r3.getDiagonal());
        assertEquals(6, (int) r4.getDiagonal());
    }


    @Test
    public void shouldPrintRectangle() {

        assertEquals("This is a Rectangle with color NONE and radius 10", r1.toString());
        assertEquals("This is a Rectangle with color NONE and radius 14.5", r2.toString());
        assertEquals("This is a Rectangle with color red and radius 23.5", r3.toString());
        assertEquals("This is a Rectangle with color NONE and radius 1", r4.toString());
    }

}
}
