package test2401;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 * 배열 두 배 만들기
 */
public class Code02 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3, 4, 5});

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;

        // Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
