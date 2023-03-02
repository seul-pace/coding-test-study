import java.util.Arrays;

public class CodeStudy0302 {

    /**
     * 최솟값 만들기
     * https://school.programmers.co.kr/learn/courses/30/lessons/12941
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        System.out.println(result);
    }

    static class Solution {
        public Solution() {}

        public int solution(int []A, int []B)
        {
            int answer = 0;

            Arrays.sort(A);
            Arrays.sort(B);

            for (int i=0; i<A.length; i++) {
                answer += A[i] * B[B.length - i - 1];
            }

            return answer;
        }
    }

}
