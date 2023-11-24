package test2311;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class Code24 {

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});

        System.out.println("result1 = " + result1);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        // IntStream 쓰는 방법도 있음
        return answer;
    }
}
