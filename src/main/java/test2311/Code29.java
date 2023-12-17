package test2311;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */
public class Code29 {

    static int answer = 0;

    public static void main(String[] args) {
        int result = solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
        System.out.println("result = " + result);
    }

    public static int solution(int[] number) {

        for (int i = 0; i < number.length; i++) {
            calculate(0, 0, i, number.length, number);
        }

        return answer;
    }

    public static void calculate(int count, int sum, int startIndex, int endIndex, int[] number) {
        if (count == 3) {
            if (sum == 0) {
                answer += 1;
            }
        }

        for (int i = startIndex; i < endIndex; i++) {
            int tempSum = sum;
            tempSum += number[i];
            calculate(count + 1, tempSum, i + 1, endIndex, number);
        }
    }
}
