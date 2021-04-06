package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;

    @BeforeAll
    public static void setUp() {
        t1 = new Triangle(10,"Red");
        t2 = new Triangle(14.5, "red");
        t3 = new Triangle(15.0, 23.5);
        t4 = new Triangle(15.0, 23.5);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(314, (int) t1.getArea());
        assertEquals(660, (int) t2.getArea());
        assertEquals(1735, (int) t3.getArea());
        assertEquals(3, (int) t4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(62, (int) t1.getPerimeter());
        assertEquals(91, (int) t2.getPerimeter());
        assertEquals(147, (int) t3.getPerimeter());
        assertEquals(6, (int) t4.getPerimeter());
    }

    @Test
    public void isIsosceles() {

        assertEquals(20, (int) t1.isIsosceles());
        assertEquals(29, (int) t2.isIsosceles());
        assertEquals(47, (int) t3.isIsosceles());
        assertEquals(2, (int) t4.isIsosceles());
    }
    @Test
    public void isEquilateral() {

        assertEquals(20, (int) t1.isEquilateral());
        assertEquals(29, (int) t2.isEquilateral());
        assertEquals(47, (int) t3.isEquilateral());
        assertEquals(2, (int) t4.isEquilateral());
    }

    @Test
    public void shouldPrintTriangle() {

        assertEquals("This is a Triangle with color NONE and radius 10", t1.toString());
        assertEquals("This is a Triangle with color NONE and radius 14.5", t2.toString());
        assertEquals("This is a Triangle with color red and radius 23.5", t3.toString());
        assertEquals("This is a Triangle with color NONE and radius 1", t4.toString());
    }

}

}
