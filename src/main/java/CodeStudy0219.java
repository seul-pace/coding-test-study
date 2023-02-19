import java.util.List;

public class CodeStudy0219 {

    /**
     * 3진법 뒤집기
     * https://school.programmers.co.kr/learn/courses/30/lessons/68935
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(45);
        System.out.println(result);
    }

    public static class Solution {
        public Solution() {}

        public int solution(int n) {
            int answer = 0;
            // 45 -> 1200 -> 0021 -> 7
            // 0* 3^3 0
            // 0* 3^2 1
            // 2* 3^1 2
            // 1* 3^0 3

            StringBuilder ternaryScaleString = new StringBuilder();

            if (n < 3) {
                ternaryScaleString.append(n);
            }

            while(n >= 3) {
                ternaryScaleString.append(n % 3);
                n = n / 3;

                if (n < 3) {
                    ternaryScaleString.append(n);
                    break;
                }
            }

            String[] ternaryScaleArray = ternaryScaleString.toString().split("");

            for(int i=0; i < ternaryScaleArray.length; i++) {
                answer += Integer.parseInt(ternaryScaleArray[i]) * Math.pow(3, ternaryScaleArray.length - i - 1);
            }

            return answer;
        }
    }

    /*
    알고보니,

    // 10진법 => 3진법 => 거꾸로
    StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
    // 거꾸로 3진법 => 10진법
    return Integer.parseInt(String.valueOf(sb), 3);

    이렇게 해결이 가능하다.......

    Integer.toString(n, k)
    10진법인 n을 k진법으로 변경하는 것

    Integer.parseInt(n, k)
    k진법인 n을 10진법으로 변경하는 것
     */

}
