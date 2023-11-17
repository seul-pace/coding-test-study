package test2311;

/**
 * 나머지가 1이 되는 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class Code17_2 {

    public static int solution(int n) {
        int index = 1;
        int rest = 0;

        n -= 1;

        do {
            index++;
            rest = n % index;
        } while (rest != 0);

        return index;

        /*
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }
        나 진짜 바보다 ㅎ 나머지 1에 꽂혀서
         */
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 12;

        int result1 = solution(n1);
        int result2 = solution(n2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
