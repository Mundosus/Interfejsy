package com.mundosus.shapes;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter is not exact unless we know all sides. For now, let's return 0.
        return 0;
    }
}
