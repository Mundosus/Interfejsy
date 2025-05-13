package com.mundosus.shapes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldCalculatePerimeter() {

        var width = 10d;
        var height = 10d;
        Rectangle rectangle = new Rectangle(width,height);

        var result = rectangle.calculatePerimeter();

        Assertions.assertThat(result).isEqualTo(2*(width+height));


    }

    @Test
    void shouldCalculateArea() {
        //given
        var width = 10d;
        var height = 10d;
        Rectangle rectangle = new Rectangle(width,height);

        //when
        double result = rectangle.calculateArea();

        //than
        Assertions.assertThat(result).isEqualTo(width*height);





    }
}