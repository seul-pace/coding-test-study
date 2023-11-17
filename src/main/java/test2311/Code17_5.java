package test2311;

/**
 * todo,, Integer.parseInt() 구현하자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class Code17_5 {

    /* TODO Integer.parseInt() 구현해보기
    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    제한 조건
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 "0"으로 시작하지 않습니다.
    입출력 예
    예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
    str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
     */
    public static int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s1 = "1234";
        String s2 = "-1234";

        int result1 = solution(s1);
        int result2 = solution(s2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
