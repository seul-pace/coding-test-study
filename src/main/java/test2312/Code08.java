package test2312;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Code08 {

    public static void main(String[] args) {
        int result = solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println("result = " + result);

        int result2 = solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("result2 = " + result2);
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> list = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() / m; i++) {
            int tempIndex = i * m;

            int min = list.get(tempIndex);
            for (int j = 0; j < m; j++) {
                min = Math.min(min, list.get(tempIndex + j));
            }
            answer += min * m;
        }

        return answer;

        /*
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;

        // 이런 방법이; 충격적이다..
        // 나는 왜 for문을 앞에서부터 생각할 생각만 했을가
        // 결국 같은 얘긴데

         */
    }
}
