package test2312;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 명예의 전당
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
public class Code04 { // [10, 10, 10, 20, 20, 100, 100]

    public static void main(String[] args) {
        int[] result = solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

//    public static int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//
//        ArrayList<Integer> array = new ArrayList<>();
//
//        for (int i = 0; i < score.length; i++) {
//            array.add(score[i]);
//            array.sort(Comparator.reverseOrder());
//
//            answer[i] = i < k - 1 ? array.get(i) : array.get(k - 1);
//        }
//
//        return answer;
//    }

    // 딱 알맞은 PriorityQueue가 있다고 해서 바꿔보기
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 일단 넣고
            queue.add(score[i]);

            // 만약 사이즈가 넘었으면 (어차피 우선순위 지정되어 있을 테니) 첫 번째 값 제거
            if (queue.size() > k) {
                queue.poll();
            }

            // 정답은 일단.. 첫 번째 값 제거하지 않고 반환만
            answer[i] = queue.peek();
        }

        return answer;
    }
}
