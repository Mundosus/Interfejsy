package com.mundosus.shapes;

public class Trapez implements Shape{

    private final double podstawa1;
    private final double podstawa2;
    private final double height;

    public Trapez(double podstawa1, double podstawa2, double height) {
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return  ((podstawa1+podstawa2)*height)/2 ;

    }

    @Override
    public double calculatePerimeter() {
        return  podstawa1+podstawa2+height*2;
    }
}
