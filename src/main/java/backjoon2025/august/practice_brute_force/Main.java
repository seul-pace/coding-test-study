package backjoon2025.august.practice_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 19532: 연립방정식 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int y = (c * d - a * f) / (b * d - a * e);
        int x = (c * e - b * f) / (a * e - b * d);

        System.out.println(x + " " + y);
    }
}

/**
 *
 * // 2231: 분해합, n이 주어지면 1부터 각 숫자 + 자리의 합을 더한 값이 n인 경우 중 가장 작은 값 구하기
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int n = Integer.parseInt(br.readLine());
 *         int answer = 0;
 *
 *         // 시작 숫자 구하기
 *         int start = n - (String.valueOf(n).length() * 9);
 *         for (int i = start; i < n; i++) {
 *             int sum = i;
 *             int temp = i;
 *             while (temp != 0) {
 *                 sum += temp % 10;
 *                 temp /= 10;
 *             }
 *
 *             if (sum == n) {
 *                 answer = i;
 *                 break;
 *             }
 *         }
 *         // 꽤 여러 번 틀렸는데...
 *         // 메모리나 수행 시간의 문제는 아니었고, n보다 11이 작은 경우는 당연히 없을 줄 알고 0으로 했는데 오류 남
 *         // 이거 때문에 오류인 줄 알고 각 자릿수의 합 구하는 법, 시작 숫자 구하는 것을 수정함
 *         // 시작 숫자 구하는 건 맞는 접근이었으나 고민하기 싫어서 반 갈라서 시작했는데 시작 숫자 구하는 것을 조금 더 고민해보는 방향이 좋았을 듯
 *
 *         System.out.println(answer);
 *     }
 *
 * // 2798: 블랙잭...! 카드 n개 받아서 가장 m에 가까운 합을 리턴
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         int n = Integer.parseInt(st.nextToken());
 *         int m = Integer.parseInt(st.nextToken());
 *
 *         int[] arr = new int[n];
 *         st = new StringTokenizer(br.readLine());
 *         for (int i = 0; i < n; i++) {
 *             arr[i] = Integer.parseInt(st.nextToken());
 *         }
 *
 *         Arrays.sort(arr);
 *
 *         int result = 0;
 *         int gap = Integer.MAX_VALUE;
 *
 *         for (int i = 0; i < n-2; i++) {
 *             for (int j = i+1; j < n-1; j++) {
 *                 for (int k = j+1; k < n; k++) {
 *                     int sum = arr[i] + arr[j] + arr[k];
 *
 *                     if (sum == m) {
 *                         System.out.println(sum);
 *                         return;
 *                     } else if (sum < m) {
 *                         int temp = m - sum;
 *
 *                         if (temp < gap) {
 *                             gap = temp;
 *                             result = sum;
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *         System.out.println(result);
 *     }
 */
