package test2311;

/**
 * 머쓱이의 아아메 많이 마시기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120819
 *
 * 쉬운 문제 풀면서 감 익히자,, 이런 초보 문제 푼다고 머쓱해하지 말자,,
 */
public class Code16 {

    public int[] solution(int money) {
        int coffee = 5_500;
        int[] answer = new int[2];

        answer[0] = money / coffee;
        answer[1] = money % coffee;

        return answer;

        // return new int[] { money / 5500, money % 5500 };
        // 이렇게 깔끔한 한 줄로도 처리 가능하다... 충격적임
    }

}
