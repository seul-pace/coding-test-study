package backjoon2025.july.practice_decimal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) return;

        int index = 2;
        do {
            if (n % index == 0) {
                n = n / index;
                bw.write(String.valueOf(index));
                bw.newLine();
                index = 2;
            } else {
                index++;
            }
        } while (n != 1);

        bw.flush();
        br.close();
        bw.close();
    }
}

/**
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         int m = Integer.parseInt(br.readLine());
 *         int n = Integer.parseInt(br.readLine());
 *
 *         int sum = 0;
 *         int min = n;
 *
 *         for (int i = n; i >= m; i--) {
 *             if (isPrimeNumber(i)) {
 *                 sum += i;
 *                 min = Math.min(min, i);
 *             }
 *         }
 *
 *         if (sum == 0) {
 *             System.out.println(-1);
 *         } else {
 *             System.out.println(sum);
 *             System.out.println(min);
 *         }
 *     }
 *
 *     public static boolean isPrimeNumber(int number) {
 *         if (number == 1) return false;
 *
 *         for (int i = 2; i <= number/2; i++) {
 *             if (number % i == 0) return false;
 *         }
 *         return true;
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         int n = Integer.parseInt(br.readLine());
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *         int result = 0;
 *         boolean isPrimeNumber = true;
 *
 *         while (n-- > 0) {
 *             int token = Integer.parseInt(st.nextToken());
 *
 *             if (token == 1) continue;
 *
 *             for (int i = 2; i < token; i++) {
 *                 if (token % i == 0) {
 *                     isPrimeNumber = false;
 *                     break;
 *                 }
 *             }
 *
 *             if (isPrimeNumber) {
 *                 result++;
 *             }
 *             isPrimeNumber = true;
 *         }
 *
 *         System.out.println(result);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         int n;
 *         List<Integer> aliquots = new LinkedList<>();
 *         while ((n = Integer.parseInt(br.readLine())) != -1) {
 *             for (int i = 1; i < n; i++) {
 *                 // 약수 여부
 *                 if (n % i == 0) {
 *                     aliquots.add(i);
 *                 }
 *             }
 *             if (aliquots.isEmpty() || !isPerfectNumber(n, aliquots)) {
 *                 bw.write(n + " is NOT perfect.");
 *             } else {
 *                 bw.write(makePerfectNumberFormal(n, aliquots));
 *             }
 *             aliquots.clear();
 *             bw.newLine();
 *         }
 *
 *         bw.flush();
 *         br.close();
 *         bw.close();
 *     }
 *
 *     public static boolean isPerfectNumber(int n, List<Integer> aliquots) {
 *         return n == aliquots.stream().mapToInt(i -> i).sum();
 *     }
 *
 *     public static String makePerfectNumberFormal(int n, List<Integer> aliquots) {
 *         StringBuilder sb = new StringBuilder(n + " = ");
 *         aliquots.forEach(i -> sb.append(i).append(" + "));
 *         sb.delete(sb.length() - 2, sb.length());
 *         return sb.toString();
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         int n = Integer.parseInt(st.nextToken());
 *         int k = Integer.parseInt(st.nextToken());
 *
 *         int count = 0;
 *         int aliquot = 0;
 *
 *         for (int i = 1; i <= n; i++) {
 *             if (n % i == 0) {
 *                 count++;
 *
 *                 if (count == k) {
 *                     aliquot = i;
 *                     break;
 *                 }
 *             }
 *         }
 *
 *         if (count < k) {
 *             aliquot = 0;
 *         }
 *         System.out.println(aliquot);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         String factor = "factor";
 *         String multiple = "multiple";
 *         String neither = "neither";
 *
 *         StringTokenizer st;
 *         while (true) {
 *             st = new StringTokenizer(br.readLine());
 *
 *             int a = Integer.parseInt(st.nextToken());
 *             int b = Integer.parseInt(st.nextToken());
 *
 *             if (a == 0 && b == 0) {
 *                 break;
 *             }
 *
 *             // 로직 on . . .
 *             if (a > b) {
 *                 if (a % b == 0) {
 *                     bw.write(multiple);
 *                 } else {
 *                     bw.write(neither);
 *                 }
 *             } else {
 *                 if (b % a == 0) {
 *                     bw.write(factor);
 *                 } else {
 *                     bw.write(neither);
 *                 }
 *             }
 *             bw.newLine();
 *         }
 *
 *         br.close();
 *         bw.flush();
 *         bw.close();
 *     }
 */