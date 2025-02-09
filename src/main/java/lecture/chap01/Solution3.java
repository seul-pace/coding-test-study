package lecture.chap01;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        Solution3 T = new Solution3();
        String result = T.solution(inputString);
        System.out.println(result);

        return;
    }

    public String solution(String inputString) {
        String answer = "";
        // 내 풀이
//        for (String s : inputString.split(" ")) {
//            if (s.length() > answer.length()) {
//                answer = s;
//            }
//        }

        int m = Integer.MIN_VALUE;
//        String[] s = inputString.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }

        int pos;
        // 띄어쓰기를 발견 (없으면 -1)
        while ((pos = inputString.indexOf(' ')) != -1) {
            String tmp = inputString.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            // 앞에 비교했던 단어를 잘라내서 위에서 substring 할 때 편하게 하려고 ㅎ
            inputString = inputString.substring(pos + 1);
        }
        // 위의 while 문에서 마지막 단어는 체크되지 않아서 한 번 더 체크
        if (inputString.length() > m) {
            answer = inputString;
        }
        // 이 방법 구린 듯
        return answer;
    }
}
