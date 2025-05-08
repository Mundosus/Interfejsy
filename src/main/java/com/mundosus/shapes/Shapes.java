package com.mundosus.shapes;

import com.mundosus.shapes.builders.ShapeBuilder;
import com.mundosus.shapes.builders.SquareBuilder;

public enum Shapes {
    SQUARE(new SquareBuilder());
    private ShapeBuilder<? extends Shape> builder;

    Shapes(ShapeBuilder<? extends Shape> builder) {
        this.builder = builder;
    }

    public ShapeBuilder<? extends Shape> getBuilder() {
        return builder;
    }
}
