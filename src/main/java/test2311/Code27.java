package test2311;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class Code27 {

    public static String solution(String s) {
        return Arrays.stream(s.split(""))
                .sorted((s1, s2) -> {
                    int result = 0;
                    char c1 = s1.charAt(0);
                    char c2 = s2.charAt(0);

                    if (c1 > c2) {
                        result = -1;
                    } else if (c1 < c2) {
                        result = 1;
                    }
                    return result;
                })
                .collect(Collectors.joining());

        /*

        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();

        아 reverse 있는데 또 까먹음 ㅠ 아 ㅠ
         */
    }

    public static void main(String[] args) {
        String result = solution("Zbcdefg");
        System.out.println("result = " + result);
    }
}
