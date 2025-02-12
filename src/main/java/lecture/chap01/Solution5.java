package lecture.chap01;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Solution5 T = new Solution5();
        System.out.println(T.reverseOnlyAlphabet(str));
    }

    public String reverseOnlyAlphabet(String str) {
        String answer;

        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
//        int lt = 0;
//        int rt = str.length() - 1;
//        char[] arr = str.toCharArray();
//
//        while (lt < rt) {
//            if (!Character.isAlphabetic(str.charAt(lt))) {
//                lt++;
//            } else if (!Character.isAlphabetic(str.charAt(rt))) {
//                rt--;
//            } else {
//                char c = arr[lt];
//                arr[lt] = arr[rt];
//                arr[rt] = c;
//                lt++;
//                rt--;
//            }
//        }
//        return String.valueOf(arr);
    }
}
