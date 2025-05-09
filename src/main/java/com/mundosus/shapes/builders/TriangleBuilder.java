package com.mundosus.shapes.builders;

import com.mundosus.shapes.Triangle;

import java.util.Scanner;

public class TriangleBuilder implements ShapeBuilder<Triangle> {
    private double base;
    private double height;

    @Override
    public ShapeBuilder<Triangle> obtainData(Scanner scanner) {
        System.out.print("Enter base: ");
        base = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        return this;
    }

    @Override
    public Triangle build() {
        return new Triangle(base, height);
    }
}
