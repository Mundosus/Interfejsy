package com.mundosus.shapes;

import com.mundosus.shapes.builders.*;

public enum Shapes {
    SQUARE(new SquareBuilder()),
    RECTANGLE(new RectangleBuilder()),
    CIRCLE(new CircleBuilder()),
    TRIANGLE(new TriangleBuilder()); // <- dodajemy tutaj

    private final ShapeBuilder<? extends Shape> builder;

    Shapes(ShapeBuilder<? extends Shape> builder) {
        this.builder = builder;
    }

    public ShapeBuilder<? extends Shape> getBuilder() {
        return builder;
    }
}
