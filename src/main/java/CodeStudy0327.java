import java.util.LinkedList;
import java.util.Queue;

public class CodeStudy0327 {

    /**
     * 스택/큐
     * 다리를 지나는 트럭
     * https://school.programmers.co.kr/learn/courses/30/lessons/42583
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println(result);
    }
}

class Solution {
    public Solution() {}

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {
            queue.add(-1);
        }

        // 트럭 배열의 인덱스
        int index = 0;

        // 현재 다리 위의 중량
        int presentWeight = 0;

        // 현재 다리 위의 트럭 대수
        int presentCount = 0;

        // 지난 초
        int sec = 0;

        // 건넌 트럭의 수
        int truckCount = 0;

        do {
            Integer truck = queue.peek();

            if (truck != null && truck != -1) {
                // 트럭이 나왔으면 지난 트럭 대수는 추가하고, 중량은 truck만큼 빼고, 다리 위의 트럭 대수는 1 빼기
                truckCount++;
                presentWeight -= truck;
                presentCount--;
            }
            queue.poll();

            if (index <= truck_weights.length - 1) {
                int tempTruck = truck_weights[index];

                if (presentWeight + tempTruck <= weight
                        && presentCount <= bridge_length) {
                    // 트럭 올릴 수 있으면 트럭 넣어주고, index 증가
                    queue.add(tempTruck);
                    index++;
                    presentCount++;
                    presentWeight += tempTruck;
                } else {
                    queue.add(-1);
                }
            }

            sec ++;

        } while (truckCount != truck_weights.length);

        return sec;
    }
}
