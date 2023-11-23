package test2311;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class Code23 {

    public static void main(String[] args) {
        String result1 = solution("abcde");
        String result2 = solution("a");
        String result3 = solution("qwer");

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static String solution(String s) {
        String[] arr = s.split("");

        int index = arr.length / 2;

        return (arr.length % 2 == 0 ? arr[index - 1] : "") + arr[index];
    }

    // Character.toString(s.charAt(ans/2));
    // 굳이 split 하지 않아도 char형으로 계산할 수 있음!
}
