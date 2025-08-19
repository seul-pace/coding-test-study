package backjoon2025.august.practice_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 머리 쓰기 싫음 그냥 쭉 더하기
        int index = 666;
        int cnt = 1; // 666부터 시작
        while (cnt != n) {
            index++;
            String value = String.valueOf(index);
            if (value.contains("666")) {
                cnt++;
            }
        }
        System.out.println(index);
    }
}

/**
 *
 * // 1018: B, W로 주어진 배열에서 체스판을 만들기 위해 각각 다른 값으로 만들기 위한 최소 변경 수 구하기
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *         int n = Integer.parseInt(st.nextToken()); // 행
 *         int m = Integer.parseInt(st.nextToken()); // 열
 *
 *         // 입력 받기
 *         Boolean[][] input = new Boolean[n][m];
 *         for (int i = 0; i < n; i++) {
 *             String temp = br.readLine();
 *             String[] arr = temp.split("");
 *
 *             for (int j = 0; j < m; j++) {
 *                 // B = true / W = false
 *                 input[i][j] = arr[j].equals("B");
 *             }
 *         }
 *
 *         int result = Integer.MAX_VALUE;
 *         // 계산
 *         for (int i = 0; i <= n - 8; i++) {
 *             for (int j = 0; j <= m - 8; j++) {
 *                 int count = countPaintChessboard(i, j, input);
 *                 if (count == 0) {
 *                     System.out.println(count);
 *                     return;
 *                 } else {
 *                     result = Math.min(result, count);
 *                 }
 *             }
 *         }
 *
 *         System.out.println(result);
 *     }
 *     private static int countPaintChessboard(int startX, int startY, Boolean[][] arr) {
 *         int result = Integer.MAX_VALUE;
 *
 *         boolean startFlag = true;
 *         boolean flag = true; // 번갈아 가기 위한 표식
 *         for (int l = 0; l < 2; l++) { // 첫 번째 색상의 가짓수를 2개로 둔다
 *             int temp = 0;
 *
 *             for (int i = startX; i < startX + 8; i++) {
 *                 for (int j = startY; j < startY + 8; j++) {
 *                     boolean currentColor = arr[i][j];
 *                     if (flag) {
 *                         if (currentColor != startFlag) {
 *                             temp++;
 *                         }
 *                     } else {
 *                         if (currentColor == startFlag) {
 *                             temp++;
 *                         }
 *                     }
 *                     flag = !flag;
 *                 }
 *                 flag = !flag;
 *             }
 *
 *             // 한 번 더 돌리기
 *             result = Math.min(result, temp);
 *             startFlag = !startFlag;
 *         }
 *
 *         return result;
 *     }
 *
 * // 19532: 연립방정식 풀이
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *         int a = Integer.parseInt(st.nextToken());
 *         int b = Integer.parseInt(st.nextToken());
 *         int c = Integer.parseInt(st.nextToken());
 *         int d = Integer.parseInt(st.nextToken());
 *         int e = Integer.parseInt(st.nextToken());
 *         int f = Integer.parseInt(st.nextToken());
 *
 *         int y = (c * d - a * f) / (b * d - a * e);
 *         int x = (c * e - b * f) / (a * e - b * d);
 *
 *         System.out.println(x + " " + y);
 *     }
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
