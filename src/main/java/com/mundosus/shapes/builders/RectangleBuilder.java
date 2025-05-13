package com.mundosus.shapes.builders;

import com.mundosus.shapes.Rectangle;

import java.util.Scanner;

public class RectangleBuilder implements ShapeBuilder<Rectangle> {

    private double width;
    private double height;

    @Override
    public ShapeBuilder<Rectangle> obtainData(Scanner scanner) {
        System.out.print("Enter width: ");
        this.width = scanner.nextDouble();
        System.out.print("Enter height: ");
        this.height = scanner.nextDouble();
        scanner.nextLine(); // flush
        return this;
    }

    @Override
    public Rectangle build() {
        return new Rectangle(width, height);
    }
}
