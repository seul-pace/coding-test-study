package lecture.chap01;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Solution6 T = new Solution6();
        String result = T.solution(input);

        System.out.println(result);
    }

    public String solution(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, 0);
        }
        StringBuilder sb = new StringBuilder();
        for(Character key : map.keySet()) {
            sb.append(key);
        }
        return sb.toString();
    }

}
