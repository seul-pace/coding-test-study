package test2311;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * 문자열 다루기 기본
 *
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class Code27_2 {

    public static void main(String[] args) {
        boolean result1 = solution("a234");
        boolean result2 = solution("1234");
        boolean result3 = solution("1234567");

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;

        /**
         나는 Character를 이용해서 찾았지만 다른 방법도 많다

         1. 정규식 이용 방법
         if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");

         2. 정규식 이용 방법 2
         return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false : true;
         -> 문자가 존재하면 해당 문자열만 남게 될 것이다, 숫자만 존재하면 구분자가 되어 배열엔 아무런 값도 없음

         3. Integer로 변환하여 try-catch를 이용해 잡는 방법

         등이 있다
         */
    }
}
