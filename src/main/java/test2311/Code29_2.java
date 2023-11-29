package test2311;

import java.util.ArrayList;
import java.util.List;

public class Code29_2 {

    public static void main(String[] args) {
        int[] result = solution("banana");
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] array = s.split("");
        List<String > strArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (strArray.contains(array[i])) {
                String joinStrArray = String.join("", strArray);
                int index = joinStrArray.lastIndexOf(array[i]);
                answer[i] = i - index;
            } else {
                answer[i] = -1;
            }
            strArray.add(array[i]);
        }

        return answer;
    }
}
