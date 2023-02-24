import java.util.ArrayList;
import java.util.List;

public class CodeStudy0224 {

    /**
     * 월간 코드 챌린지 시즌2, 약수의 개수와 덧셈
     * https://school.programmers.co.kr/learn/courses/30/lessons/77884
     *
     * 약수 구하기는 아래 글을 참고함
     * https://mine-it-record.tistory.com/522
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(24, 27);
        System.out.println(result);
    }

    public static class Solution {
        public Solution() {}

        public int solution(int left, int right) {
            int answer = 0;

            for (int i=left; i<=right; i++) {
                if (getDivisorCount(i) % 2 == 0) {
                    answer += i;
                } else {
                    answer -= i;
                }
            }

            return answer;
        }

        // 약수 리스트 구하기
        public int getDivisorCount(int number) {
            int count = 0;

            for (int i=1; i<=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count ++;
                    if (number / i != i) { // 본인이 아니면 나눠지는 수도 약수니까
                        count ++;
                    }
                }
            }
            return count;
        }

        // 다른 사람 풀이... 이거였다 똑똑하다...
        public int solution2(int left, int right) {
            int answer = 0;

            for (int i=left;i<=right;i++) {
                //제곱수인 경우 약수의 개수가 홀수
                if (i % Math.sqrt(i) == 0) {
                    answer -= i;
                }
                //제곱수가 아닌 경우 약수의 개수가 짝수
                else {
                    answer += i;
                }
            }

            return answer;
        }
    }

}
