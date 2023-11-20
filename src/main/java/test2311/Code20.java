package test2311;

/**
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Code20 {

    public static long solution(int a, int b) {
        if (a == b) return a;

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        long sum = 0;

        for(long i = min; i <= max; i++) {
            sum += i;
        }

        return sum;

        /*
        아...
        (b - a + 1) * (a + b) / 2;
        이거 쓰면 됨 ㅠ
         */
    }

    public static void main(String[] args) {
        long result1 = solution(3, 5);
        long result2 = solution(3, 3);
        long result3 = solution(5, 3);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
