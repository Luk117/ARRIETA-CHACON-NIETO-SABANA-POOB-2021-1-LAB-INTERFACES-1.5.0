package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleSolidTest {
    private static RectangleSolid rs1;
    private static RectangleSolid rs2;
    private static RectangleSolid rs3;

    @BeforeAll
    public static void setUp() {
        rs1 = new RectangleSolid("red",30,7,5);
        rs2 = new RectangleSolid("navy",20,5,2);
        rs3 = new RectangleSolid("blood orange", 10,4,2);}

    @Test
    public void shouldCalculateVolume() {

        assertEquals(1050, (int) rs1.getVolume());
        assertEquals(200, (int) rs2.getVolume());
        assertEquals(80, (int) rs3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(790, (int) rs1.getSuperficialArea());
        assertEquals(300, (int) rs2.getSuperficialArea());
        assertEquals(136, (int) rs3.getSuperficialArea());
    }
}