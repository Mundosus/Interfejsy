package com.mundosus.shapes.builders;

import com.mundosus.shapes.Square;

import java.util.Scanner;

public class SquareBuilder implements ShapeBuilder<Square> {

    //TODO: Add obtaining fields that you need and pass them to square object
    @Override
    public ShapeBuilder<Square> obtainData(Scanner scanner) {
        return this;
    }

    @Override
    public Square build() {
        return null;
    }
}
