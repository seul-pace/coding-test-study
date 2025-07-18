package backjoon2025.july.practice_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = 1;

        if (a >= v) {
            System.out.println(day);
            return;
        }
        int meter = v - a;
        day += (meter / (a - b));
        if (meter % (a - b) != 0) {
            day += 1;
        }
        System.out.println(day);
    }
}
/**
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int n = Integer.parseInt(br.readLine());
 *         int i = 0;
 *         int sum = 0;
 *
 *         do {
 *             sum += (++i);
 *         } while(sum < n);
 *
 *         int startNumber = (sum - i + 1);
 *         int diffNumber = n - startNumber;
 *         int child = 1;
 *         int parents = 1;
 *
 *         if(i % 2 == 0) { // 짝수인 경우
 *             // 위-> 아래
 *             // 언제나 분자가 1
 *             // 분자 증가, 분모 감소
 *             child = i - diffNumber;
 *             parents += diffNumber;
 *
 *         }else {
 *             // 아래 -> 위
 *             // 언제나 분모가 1
 *             // 분자 감소, 분모 증가
 *             child += diffNumber;
 *             parents = i - diffNumber;
 *         }
 *
 *         System.out.printf("%d/%d", parents, child);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int n = Integer.parseInt(br.readLine());
 *
 *         int room = 1;
 *         int index = 0;
 *
 *         while (6 * index + 1 < n) {
 *             index += (room++);
 *         }
 *
 *         System.out.println(room);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         int n = Integer.parseInt(br.readLine());
 *         int result = 2;
 *         for (int i = 0; i < n; i++) {
 *             result += (int) Math.pow(2, i);
 *         } // 걍 Math.pow(2, n) + 1 하면 result 였음 ㅜ
 *         br.close();
 *         System.out.println(result * result);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *         int n = Integer.parseInt(br.readLine());
 *
 *         for (int i = 0; i < n; i++) {
 *             int money = Integer.parseInt(br.readLine());
 *
 *             int quarter = money / 25;
 *             int restOfQuarter = money % 25;
 *             bw.write(quarter + " ");
 *
 *             int dime = restOfQuarter / 10;
 *             int restOfDime = restOfQuarter % 10;
 *             bw.write(dime + " ");
 *
 *             int nickel = restOfDime / 5;
 *             int restOfNickel = restOfDime % 5;
 *             bw.write(nickel + " ");
 *             bw.write(String.valueOf(restOfNickel));
 *             bw.newLine();
 *         }
 *         bw.flush();
 *         bw.close();
 *         br.close();
 *     }
 *
 * 10진법 -> n진법
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         int n = Integer.parseInt(st.nextToken()); // 10진법
 *         int b = Integer.parseInt(st.nextToken()); // 진법
 *         StringBuilder sb = new StringBuilder();
 *         String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 *
 *         while (n >= b) {
 *             int rest = n % b;
 *             sb.append(digits.charAt(rest));
 *             n = n / b;
 *         }
 *         sb.append(digits.charAt(n));
 *         sb.reverse();
 *         System.out.println(sb);
 *     }
 *
 * n 진법 -> 10진법
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         String n = st.nextToken(); // 표현 값
 *         int numeral = Integer.parseInt(st.nextToken()); // 진법
 *
 *         int result = 0;
 *         for (int i = 0; i < n.length(); i++) {
 *             int temp = (int) Math.pow(numeral, n.length() - i - 1);
 *
 *             char c = n.charAt(i);
 *             int number = Character.isDigit(c) ? c - '0' : (int) c - 'A' + 10;
 *             result += (temp * number);
 *         }
 *         System.out.println(result);
 *     }
 *
 */