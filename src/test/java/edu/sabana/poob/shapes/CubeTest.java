package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubeTest {
    private static Cube c1;
    private static Cube c2;
    private static Cube c3;
    private static Cube c4;

    @BeforeAll
    public static void setUp() {
        c1 = new Cube(8);
        c2 = new Cube(5);
        c3 = new Cube(3);
        c4 = new Cube("red");
    }
    @Test
    public void shouldCalculateArea() {

        assertEquals(64, (int) c1.getArea());
        assertEquals(25, (int) c2.getArea());
        assertEquals(9, (int) c3.getArea());
        assertEquals(1, (int) c4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(32, (int) c1.getPerimeter());
        assertEquals(20, (int) c2.getPerimeter());
        assertEquals(12, (int) c3.getPerimeter());
        assertEquals(4, (int) c4.getPerimeter());
    }
    @Test
    public void shouldCalculateVolume() {

        assertEquals(512, (int) c1.getVolume());
        assertEquals(125, (int) c2.getVolume());
        assertEquals(27, (int) c3.getVolume());
        assertEquals(1, (int) c4.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(384, (int) c1.getSuperficialArea());
        assertEquals(150, (int) c2.getSuperficialArea());
        assertEquals(54, (int) c3.getSuperficialArea());
        assertEquals(6, (int) c4.getSuperficialArea());
    }
}
