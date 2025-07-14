package backjoon2025.july.practice_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 10진법
        int b = Integer.parseInt(st.nextToken()); // 진법
        StringBuilder sb = new StringBuilder();
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n >= b) {
            int rest = n % b;
            sb.append(digits.charAt(rest));
            n = n / b;
        }
        sb.append(digits.charAt(n));
        sb.reverse();
        System.out.println(sb);
    }
}

/**
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