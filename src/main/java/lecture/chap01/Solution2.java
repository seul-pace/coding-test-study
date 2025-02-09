package lecture.chap01;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        Solution2 solution = new Solution2();
        String result = solution.solution(inputString);

        System.out.println(result);
        return;
    }

    public String solution(String inputString) {
//        StringBuilder sb = new StringBuilder();
//
//        char[] charArray = inputString.toCharArray();
//        for(char c : charArray) {
//            if (c < 97) {
//                sb.append(Character.toLowerCase(c));
//            } else {
//                sb.append(Character.toUpperCase(c));
//            }
//        }
//
//        return sb.toString();
        String answer = "";
        for (char x : inputString.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            } else {
//                answer += Character.toLowerCase(x);
//            }
            if (x >= 97 && x < 122) {
                answer += (char) (x - 32);
            } else {
                answer += (char) (x + 32);
            }
        }
        return answer;
    }
}
