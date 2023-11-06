package test2311;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Code06Test {

    private Code06 test06;

    @BeforeEach
    void setUp() {
        test06 = new Code06();
    }

    @Test
    void test01() {
        Assertions.assertEquals(12, test06.solution(3, 4));
    }

}