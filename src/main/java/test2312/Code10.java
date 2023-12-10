package test2312;

/**
 * 소수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Code10 {

    public static void main(String[] args) {
        int result1 = solution(10);
        int result2 = solution(5);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) answer++;
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
