package com.mundosus.shapes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezTest {
    @Test
    void shouldCreateTrapez() {
        var podstawa1 = 11d;
        var podstawa2 = 12d;
        var height = 13d;
        Trapez trapez = new Trapez(podstawa1,podstawa2,height);
    }

    @Test
    void shouldCalculateArea() {
        var podstawa1 = 11d;
        var podstawa2 = 12d;
        var height = 13d;
        Trapez trapez = new Trapez(podstawa1,podstawa2,height);

        var result = trapez.calculateArea();

        Assertions.assertThat(result).isEqualTo(((podstawa1+podstawa2)*height)/2);

    }

    @Test
    void shouldCalculatePerimeter() {
        var podstawa1 = 11d;
        var podstawa2 = 12d;
        var height = 13d;

        Trapez trapez = new Trapez(podstawa1,podstawa2,height);

        var result = trapez.calculatePerimeter();

        Assertions.assertThat(result).isEqualTo(podstawa1+podstawa2+height*2);
    }
}