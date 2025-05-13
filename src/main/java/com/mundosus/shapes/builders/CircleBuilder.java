package com.mundosus.shapes.builders;

import com.mundosus.shapes.Circle;

import java.util.Scanner;

public class CircleBuilder implements ShapeBuilder<Circle> {

    private double radius;

    @Override
    public ShapeBuilder<Circle> obtainData(Scanner scanner) {
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        return this;
    }

    @Override
    public Circle build() {
        return new Circle(radius);
    }
}
