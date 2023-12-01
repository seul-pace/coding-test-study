package test2312;

import java.util.HashMap;

/**
https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
public class Code01 {

    public static void main(String[] args) {
        int[] result = solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> nameToYearning = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameToYearning.put(name[i], yearning[i]);
        }

        for (int i = 0;  i <photo.length; i++) {
            String[] p = photo[i];

            for (int j = 0; j < p.length; j++) {
                Integer score = nameToYearning.getOrDefault(p[j], 0);
                answer[i] += score;
            }
        }

        return answer;
    }
}
