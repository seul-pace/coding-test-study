package lecture.chap01;
import java.util.Scanner;

/**
 * 문자 찾기
 */
public class Solution1 {

    // 내 풀이
//    public static class Main {
//        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            String string = in.next();
//            String character = in.next();
//            int result = countCharacter(string, character);
//            System.out.println(result);
//            return ;
//        }
//
//        public static int countCharacter(String string, String character) {
//            int result = 0;
//            String[] splitStringArr = string.toLowerCase().split("");
//            character = character.toLowerCase();
//
//            for(String splitString : splitStringArr) {
//                if (splitString.equals(character)) {
//                    result++;
//                }
//            }
//            return result;
//        }
//    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(s.solution(str, c));
    }

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }
}
