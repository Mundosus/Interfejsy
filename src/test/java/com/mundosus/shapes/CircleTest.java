package com.mundosus.shapes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldCalculateArea() {
        //given
        var radius = 12d;
        Circle circle = new Circle(radius);

        //when
        double result = circle.calculateArea();



        //then
        Assertions.assertThat(result).isEqualTo(Math.PI * radius * radius);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        var radius = 12d;
        Circle circle = new Circle(radius);

        //when
        double result = circle.calculatePerimeter();

        //then
        Assertions.assertThat(result).isEqualTo(2 * Math.PI * radius);
    }
}