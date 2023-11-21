package test2311;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class Code21 {

    public static void main(String[] args) {
        int result1 = solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        int result2 = solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            sum += (signs[i] ? absolutes[i] : absolutes[i] * -1);
        }

        return sum;
    }

}
