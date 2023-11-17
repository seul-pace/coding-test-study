package test2311;

import java.util.ArrayList;

/**
 * 약수의 합 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class Code17_3 {

    public static int solution(int n) {
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for (int index = 1; index <= n; index++) {
//            if (n % index == 0) {
//                if (arr.contains(index)) {
//                    break;
//                }
//                int quotient = n / index;
//
//                arr.add(index);
//
//                if (arr.contains(quotient)) {
//                    break;
//                }
//                arr.add(quotient);
//            }
//        }
//
//        return arr.stream().mapToInt(x -> x).sum();

        // 난 위처럼 풀었는데... 코드가 복잡해지네... -> 절반만 돌게 하고 싶어서인데
        // 아래처럼 되네;
        // 마지막에 한 번 더하면 돼? 그러네... 절반까지만 하면 그 이상은 안 되는구나 오.. 오 똑똑해
        int answer = 0;
        for(int i = 1 ; i <= n/2; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        return answer+n;
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 5;

        int result1 = solution(n1);
        int result2 = solution(n2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
