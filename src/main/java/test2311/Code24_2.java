package test2311;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Code24_2 {

    public static void main(String[] args) {
        String result1 = solution(3);
        System.out.println("result1 = " + result1);

        String result2 = solution(4);
        System.out.println("result2 = " + result2);
    }

    public static  String solution(int n) {
//        StringBuilder sb = new StringBuilder();
//        boolean flag = true;
//
//        for (int i = 0; i < n; i++) {
//            if (flag) {
//                sb.append("수");
//            } else {
//                sb.append("박");
//            }
//            flag = !flag;
//        }
//        return sb.toString();

        // 이거 진짜 새로운 방법이다 똑똑하다..
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
