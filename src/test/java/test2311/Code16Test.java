package test2311;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Code16Test {

    private Code16 code16;

    @BeforeEach
    public void setUp() {
        code16 = new Code16();
    }

    @Test
    public void drinkOneCoffee() {
        int[] result = code16.solution(5500);

        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(0, result[1]);
    }

    @Test
    public void drinkMoreCoffee() {
        int[] result = code16.solution(15_000);

        Assertions.assertEquals(2, result[0]);
        Assertions.assertEquals(4_000, result[1]);
    }

}