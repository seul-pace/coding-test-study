package test2311;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Code06_3Test {

    private Code06_3 code06;

    @BeforeEach
    void setUp() {
        code06 = new Code06_3();
    }

    @Test
    void 여치를_가장_적은_수로_잡기() {
        assertEquals(5, code06.solution(23));
        assertEquals(6, code06.solution(24));
        assertEquals(201, code06.solution(999));
    }

}