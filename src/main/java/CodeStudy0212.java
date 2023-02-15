
public class CodeStudy0212 {

    static int COUNT;
    static int MAX_COUNT;

    /**
     * 피로도
     * https://school.programmers.co.kr/learn/courses/30/lessons/87946
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(80, new int[][]{{80,20},{50,40},{30,10}});

        // expect: 3
        System.out.println(result);
    }

    public static class Solution {

        public Solution() {}

        public int solution(int k, int[][] dungeons) {
            COUNT = 0;
            MAX_COUNT = 0;

            return enterDungeon(dungeons, k, COUNT);
        }

        /**
         * 던전 입장 함수
         * @param dungeons 아직 사용자가 들르지 않은 던전 array
         * @param k 남은 피로도
         * @param count 현재까지 던전 입장 횟수
         * @return 계산된 던전 방문 횟수
         */
        public int enterDungeon(int[][] dungeons, int k, int count) {

            for(int i=0; i<dungeons.length; i++) {
                int tiredness = k;
                int cnt = count;

                // 던전 입장이 가능하면
                if (dungeons[i][0] <= tiredness && tiredness - dungeons[i][1] >= 0) {
                    tiredness -= dungeons[i][1];
                    cnt++;

                    // 더이상 피로도가 없거나 입장 가능한 던전이 없으면
                    if(tiredness <= 0 || dungeons.length == 1) {
                        COUNT = cnt;
                        break;
                    }

                    // 피로도도 있고 입장 가능한 던전도 존재한 상황
                    int[][] removedDungeons = removeElementInArray(dungeons, i);
                    int tempCnt = enterDungeon(removedDungeons, tiredness, cnt);
                    MAX_COUNT = Math.max(tempCnt, MAX_COUNT);
                } else {
                    COUNT = cnt;
                }
            }
            return Math.max(MAX_COUNT, COUNT);
        }

        public int[][] removeElementInArray(int[][] arr, int index) {
            int[][] result = new int[arr.length - 1][arr[0].length];

            System.arraycopy(arr, 0, result, 0, index);
            System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);

            return result;
        }
    }
}
