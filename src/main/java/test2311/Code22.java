package test2311;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class Code22 {

    public static void main(String[] args) {
        // 5, 1, 2, 6, 8 -> 5, 2, 6, 8 ... 장난하나 ㅠ 잘못 이해했네

        int[] result1 = solution(new int[]{4, 3, 2, 1});
        for (int i : result1) {
            System.out.println(i);
        }

        System.out.println("--------");

        int[] result2 = solution(new int[]{10});
        for (int i : result2) {
            System.out.println(i);
        }

        System.out.println("--------");

        int[] result3 = solution(new int[]{5, 1, 2, 6, 8});
        for (int i : result3) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        for (int number : arr) {
            min = Math.min(min, number);
        }

        int answerIndex = 0;
        for (int number : arr) {
            if (number == min) continue;
            answer[answerIndex++] = number;
        }

        return answer;

        /*
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();

        아........
         */
    }
}
