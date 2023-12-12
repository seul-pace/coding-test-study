package test2312;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 * 콜라 문제
 */
public class Code12 {

    public static void main(String[] args) {
        int result1 = solution(2, 1, 20);
        System.out.println("result1 = " + result1);

        int result2 = solution(3, 1, 20);
        System.out.println("result2 = " + result2);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        // 빈 병 20개를 a인 2로 나누면 10*b = 10병이 생김
        // 아직 a보다 많음

        while (n >= a) {
            int newBottle = (n / a) * b;
            answer += newBottle;

            int remainBottle = n % a;

            n = newBottle + remainBottle;
        }

        return answer;

        // 이거 한 줄로 끝내는 사람 있네..
        // return (n > b ? n - b : 0) / (a - b) * b;
    }
}
