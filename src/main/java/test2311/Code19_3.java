package test2311;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Code19_3 {

    public static void main(String[] args) {
        boolean result1 = solution(10);
        boolean result2 = solution(12);
        boolean result3 = solution(11);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static boolean solution(int x) {
        int sum = Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::valueOf)
                .sum();

        return x % sum == 0;

        // int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
    }
}
