package edu.sabana.poob.shapes;

public class Triangle extends Shape implements GeometricShape2D {
    public double side1=1.0;
    public double side2=1.0;
    public double side3=1.0;


    public Triangle(){

    }

    public Triangle (String color, double side1, double side2, double side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }


    public Triangle(String color) {
        super(color);

    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double getArea(){
        double sp = (side1 + side2 + side3)/2;
        return Math.sqrt(sp * (sp -side1)* (sp -side2)* (sp -side3));
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s and sides: %s,%s,%s"
                ,this.getClass().getSimpleName()
                ,this.color == null ? "NONE" : this.color
                ,this.side1
                ,this.side2
                ,this.side3);
    }

    public boolean isIsosceles() {
        boolean result = false;
        if (side1 == side2 && side1 != side3 || side1 != side2 && side3 == side1 || side3 == side2 && side3 != side1) {
            result = true;
        }
        return result;
    }

    public boolean isEquilateral(){
        if (side1==side2 && side2==side3) {
            return true;
        }
        return false;
    }


}