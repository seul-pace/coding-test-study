package backjoon2025.july.time_complexity;

import java.util.Scanner;

public class Main {

    // 24264: 특정 알고리즘의 시간 복잡도 구하기 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Long.parseLong(sc.next());
        System.out.println(l * l); // 반복문이 중첩되어 n 제곱 만큼 실행 (=수행 횟수)
        System.out.println(2); // 제곱이니까 2
    }
}

/**
 *
 * // 24263: 특정 알고리즘의 시간 복잡도 구하기 문제
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         System.out.println(sc.next()); // 들어오는 만큼 반복문 진행
 *         System.out.println(1); // 차수,,
 *     }
 *
 * // 24262: 특정 알고리즘의 시간 복잡도 구하기 문제
 *     public static void main(String[] args) {
 *         System.out.println(1); // 어떤 값이 들어가든 1번만 수행해서 횟수는 1
 *         System.out.println(0); // 시간 복잡도는 O(1) -> 최고차항 = 0
 *     }
 */
