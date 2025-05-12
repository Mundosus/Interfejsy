package com.mundosus.shapes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {


    @Test
    void shouldCalculateArea() {
        //given
        var side = 11.0D;
        var square = new Square(side);
        //when
        var result = square.calculateArea();
        //then
        Assertions.assertThat(result).isEqualTo(side * side);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        var side = 11.0D;
        var numerOfSidesInSquare = 4;
        Square square = new Square(side);
        //when
        var result = square.calculatePerimeter();
        //then
        Assertions.assertThat(result).isEqualTo(numerOfSidesInSquare * side);
    }
}
