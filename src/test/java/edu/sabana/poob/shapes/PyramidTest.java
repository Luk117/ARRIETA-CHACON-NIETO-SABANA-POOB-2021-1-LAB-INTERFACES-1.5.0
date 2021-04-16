package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {

    private static Pyramid p1;
    private static Pyramid p2;
    private static Pyramid p3;

    @BeforeAll
    public static void setUp() {
        p1 = new Pyramid();
        p2 = new Pyramid("blue", 10, 10, 10, 18);
        p3 = new Pyramid("red", 15, 15, 15, 30);
    }


    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(3, (int) p1.getSuperficialArea());
        assertEquals(473, (int) p2.getSuperficialArea());
        assertEquals(1152, (int) p3.getSuperficialArea());
    }


    @Test
    public void shouldCalculateVolume() {

        assertEquals(0, (int) p1.getVolume());
        assertEquals(600, (int) p2.getVolume());
        assertEquals(2250, (int) p3.getVolume());
    }
}