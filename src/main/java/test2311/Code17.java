package test2311;

/**
 * 짝수 홀수 감별사
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */
public class Code17 {

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        String result1 = solution(num1);
        String result2 = solution(num2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
