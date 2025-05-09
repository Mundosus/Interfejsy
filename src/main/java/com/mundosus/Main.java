package com.mundosus;

import com.mundosus.shapes.Shape;
import com.mundosus.shapes.Shapes;
import com.mundosus.shapes.builders.ShapeBuilder;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            var shapeBuilder = chooseShape();
            var shape = shapeBuilder.obtainData(scanner).build();
            printResult(shape);
            System.out.println("\n=== Do you want to continue (Press Y to continue) ===");
            var shouldContinue = scanner.nextLine().trim();
            if (shouldStop(shouldContinue)) {
                return;
            }
        } while (true);
    }

    private static void printResult(Shape shape) {
        do {
            System.out.println("\n=== Please pick what do you want to calculate ===");
            System.out.println("\n=== 1. Area ===");
            System.out.println("\n=== 2. Perimeter ===");
            var choice = scanner.nextInt();
            scanner.nextLine(); //Flush scanner buffer
            switch (choice) {
                case 1:
                    System.out.println(shape.calculateArea());
                    return;
                case 2:
                    System.out.println(shape.calculatePerimeter());
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);
    }

    private static boolean shouldStop(String shouldContinue) {
        return !shouldContinue.equalsIgnoreCase("y");
    }

    private static ShapeBuilder<? extends Shape> chooseShape() {
        var allShapes = Shapes.values();
        System.out.println("\n=== Please pick a shape ===");
        var iterationCounter = 1;
        for (Shapes shape : allShapes) {
            System.out.println(iterationCounter + ". " + shape.name() + "\n");
            ++iterationCounter;
        }
        System.out.print("Your choice: ");
        var choice = scanner.nextInt();
        System.out.print("Your picked: " + choice);
        scanner.nextLine(); //Flush scanner buffer
        return allShapes[choice - 1].getBuilder();
    }
}
