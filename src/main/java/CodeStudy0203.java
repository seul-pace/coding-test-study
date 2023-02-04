import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class CodeStudy0203 {

    /**
     * 코딩 테스트
     * https://school.programmers.co.kr/learn/courses/30/lessons/120866
     *
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}});
        System.out.println(result);
    }

    public static class Solution {
        public Solution() {}

        public int solution(int[][] board) {
            int answer = 0;

            // 안전 지대 정보 arr
            int[][] answerArr = new int[board.length][board.length];

            // 비안전 지대 체크
            for (int i=0; i<board.length; i++) {
                for (int j=0; j<board.length; j++) {
                    if (board[i][j] == 1) { // 폭탄이 존재하면?
                        answerArr[i][j] = 1; // 해당 칸도 안전하지 못 하고,

                        // 나머지 칸 세팅
                        /*
                        i-1/j-1 i-1/j   i-1/j+1
                        i/j-1   i/j     i/j+1
                        i+1/j-1 i+1/j   i+1/j+1
                         */

                        boolean canMinusJ = j - 1 >= 0;
                        boolean canPlusJ = j + 1 <= board.length - 1;

                        // 1번 줄
                        if (i - 1 >= 0) {
                            if (canMinusJ) {
                                answerArr[i-1][j-1] = 1;
                            }
                            answerArr[i-1][j] = 1;
                            if (canPlusJ) {
                                answerArr[i-1][j+1] = 1;
                            }
                        }
                        // 2번 줄
                        if (canMinusJ) {
                            answerArr[i][j-1] = 1;
                        }
                        if (canPlusJ) {
                            answerArr[i][j+1] = 1;
                        }
                        // 3번 줄
                        if (i + 1 <= board.length - 1) {
                            if (canMinusJ) {
                                answerArr[i+1][j-1] = 1;
                            }
                            answerArr[i+1][j] = 1;
                            if (canPlusJ) {
                                answerArr[i+1][j+1] = 1;
                            }
                        }
                    }
                }
            }

            // 안전한 칸 합
//            AtomicInteger total = new AtomicInteger();
//            Arrays.stream(answerArr).forEach(arr -> {
//                total.addAndGet(Long.valueOf(Arrays.stream(arr).filter(a -> a == 0).count()).intValue());
//            });
//
//            return total.get();

            // 속도가 느려서 아래 코드로 대체
            int total = 0;
            for(int i = 0; i < answerArr.length; i++) {
                for (int j = 0; j < answerArr.length; j++) {
                    if (answerArr[i][j] == 0) total++;
                }
            }

            return total;
        }
    }

}
