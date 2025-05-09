package com.mundosus.shapes.builders;

import com.mundosus.shapes.Shape;

import java.util.Scanner;

public interface ShapeBuilder<T extends Shape> {

    ShapeBuilder<T> obtainData(Scanner scanner);

    T build();
}
