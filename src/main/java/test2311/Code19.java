package test2311;

/**
 * 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class Code19 {

    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        double floor = Math.floor(sqrt);

        if (floor * floor == n) {
            return (long) ((floor + 1) * (floor + 1));
        }

        return -1;
        /* ㅇ.ㅇ,,
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
         */
    }

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 3;

        long result1 = solution(n1);
        long result2 = solution(n2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

}
