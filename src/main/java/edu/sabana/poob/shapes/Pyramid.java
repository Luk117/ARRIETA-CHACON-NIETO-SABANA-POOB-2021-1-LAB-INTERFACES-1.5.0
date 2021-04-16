package edu.sabana.poob.shapes;

import org.junit.jupiter.api.Test;

public class Pyramid extends Triangle implements GeometricShape3D {

    private double height = 1;


    public Pyramid() {
        super();

    }

    public Pyramid(String color, double side1, double side2, double side3, double height) {
        super(color, side1, side2, side3);
        this.height = height;
    }

    public double getPerimeter() {
        double perimeter = side1 * 4;
        return perimeter;

    }

    @Override
    public double getSuperficialArea() {
        double a = (side1) / 2;
        double sh = Math.sqrt((a * a) + (height * height));
        double la = (((getPerimeter()) / 2) * sh);
        double ba = side1 * side1;
        double totalarea = ba + la;
        return totalarea;


    }

    @Override
    public double getVolume() {
        double ba = side1 * side1;
        double vol = (ba * this.height) / 3;
        return vol;
    }
}


