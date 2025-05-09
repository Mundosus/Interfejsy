package com.mundosus.shapes.builders;

import com.mundosus.shapes.Square;
import java.util.Scanner;

public class SquareBuilder implements ShapeBuilder<Square> {

    private double side;

    @Override
    public ShapeBuilder<Square> obtainData(Scanner scanner) {
        System.out.print("Enter side length: ");
        this.side = scanner.nextDouble();
        scanner.nextLine(); // czyści enter
        return this;
    }

    @Override
    public Square build() {
        return new Square(side); // <- najważniejsze!
    }
}
