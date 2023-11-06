package test2311;

/**
 * 개미 군단
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 * 장군 개미 죽어나는 소리 여기까지 들림
 */
public class Code06_3 {

    public int solution(int hp) {
        int answer = 0;

        // 배열에 넣고 for문 돌리기
        int[] ants = new int[]{5,3,1};

        for (int ant : ants) {
            int number = hp / ant;
            hp -= number * ant;
            answer += number;
        }
        
        return answer;
        // hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        // 이런 방법이 있었다...
    }
}
