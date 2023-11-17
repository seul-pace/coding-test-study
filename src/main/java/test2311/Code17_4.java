package test2311;

/**
 * 각 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Code17_4 {

    public static int solution(int n) {
        int answer = 0;

        String[] arr = String.valueOf(n).split("");
        for (String s : arr) {
            answer += Integer.parseInt(s);
        }

        /*
        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }
        이런 방법이..
         */

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 987;

        int result1 = solution(n1);
        int result2 = solution(n2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
