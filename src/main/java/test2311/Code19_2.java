package test2311;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Code19_2 {

    public static void main(String[] args) {
        long n = 118372;

        long result = solution(n);
        System.out.println("result = " + result);
    }

    public static long solution(long n) {
        StringBuilder sb = new StringBuilder();

        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        Arrays.stream(arr)
                .collect(Collectors.toList())
                .forEach(sb::append);

        return Long.parseLong(sb.toString());

        /* StringBuilder가 reverse가 되네... 그냥 sort 해주고 reverse 해주면 되네용
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
         */
    }
}
