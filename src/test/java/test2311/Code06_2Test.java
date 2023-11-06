package test2311;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Code06_2Test {

    private Code06_2 code06;

    @BeforeEach
    void setUp() {
        code06 = new Code06_2();
    }

    @DisplayName("2022년 기준 나이를 입력하면 출생 연도를 리턴한다.")
    @Test
    void letMeGuessYourYear() {
        Assertions.assertEquals(1983, code06.solution(40));
        Assertions.assertEquals(2000, code06.solution(23));
    }

}