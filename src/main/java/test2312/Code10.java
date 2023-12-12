package test2312;

/**
 * 소수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Code10 {

    public static void main(String[] args) {
        int result1 = solution2(10);
        int result2 = solution2(5);

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

    // 에라토스테네서의 체 방식 이용
    public static int solution2(int n) {
        int answer = 0;

        // n까지의 소수의 갯수를 구하는 문제?
        // 배열로 n+1까지의 배열을 만들고,
        // 1. 소수인 index들은 값이 모두 false가 될 것이다
        // 2. 그러면 다 구한 다음에 false인 거 카운트만 하면 된다

        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        // 2부터 루트n까지 배수들을 체크해준다
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 이미 체크된 거면 지나가기
            if (prime[i]) {
                continue;
            }

            // 배수들을 체크할 값의 다음 배수부터
            // 계속 배수들을 체크해서 true 처리
            for (int j = i*i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

        // 카운트 한다
        for (int i = 0; i < prime.length; i++) {
            if (!prime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
