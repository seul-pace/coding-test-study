package backjoon2025.june.practice_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

/**
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         while (true) {
 *             StringTokenizer st = new StringTokenizer(br.readLine());
 *             int a = Integer.parseInt(st.nextToken());
 *             int b = Integer.parseInt(st.nextToken());
 *
 *             if (a + b == 0) {
 *                 break;
 *             }
 *
 *             bw.write(String.valueOf(a + b));
 *             bw.newLine();
 *         }
 *
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *
 *         for(int i = 1; i <= n; i++) {
 *             for(int j = n - i; j > 0; j--) {
 *                 System.out.print(" ");
 *             }
 *             for(int j = 1; j <= i; j++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *
 *         for(int i = 1; i <= n; i++) {
 *             for(int j = 1; j <= i; j++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         String number = br.readLine();
 *         int n = Integer.parseInt(number);
 *
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         for (int i = 1; i <= n; i++) {
 *             StringTokenizer st = new StringTokenizer(br.readLine());
 *             int a = Integer.parseInt(st.nextToken());
 *             int b = Integer.parseInt(st.nextToken());
 *             bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
 *             bw.newLine();
 *         }
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         String number = br.readLine();
 *         int n = Integer.parseInt(number);
 *
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         for (int i = 1; i <= n; i++) {
 *             StringTokenizer st = new StringTokenizer(br.readLine());
 *             int a = Integer.parseInt(st.nextToken());
 *             int b = Integer.parseInt(st.nextToken());
 *             bw.write("Case #" + i + ": " + (a + b));
 *             bw.newLine();
 *         }
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         String number = br.readLine();
 *         int n = Integer.parseInt(number);
 *
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         for (int i = 0; i < n; i++) {
 *             StringTokenizer st = new StringTokenizer(br.readLine());
 *             int a = Integer.parseInt(st.nextToken());
 *             int b = Integer.parseInt(st.nextToken());
 *             bw.write(String.valueOf(a + b)); // 숫자 그대로 출력하려면 String 형태로 write
 *             bw.newLine();
 *         }
 *         bw.flush();
 *         bw.close();
 *     }
 *
 *  public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *
 *         for (int i = 0; i < n / 4; i++) {
 *             System.out.print("long ");
 *         }
 *         System.out.println("int");
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *
 *         // 금액
 *         String priceString = sc.nextLine();
 *         int price = Integer.parseInt(priceString);
 *         // 개수
 *         String numberString = sc.nextLine();
 *         int number = Integer.parseInt(numberString);
 *         // 물품
 *         for (int i = 0; i < number; i++) {
 *             String input = sc.nextLine();
 *             String[] arr = input.split(" ");
 *
 *             price -= (Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
 *         }
 *
 *         if (price == 0) {
 *             System.out.println("Yes");
 *         } else {
 *             System.out.println("No");
 *         }
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int limit = sc.nextInt();
 *         long answer = 0L;
 *
 *         for (int i = 1; i <= limit; i++) {
 *             answer += i;
 *         }
 *
 *         System.out.println(answer);
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         String number = sc.nextLine();
 *         int n = Integer.parseInt(number);
 *
 *         int[] answers = new int[n];
 *
 *         for(int i = 0; i < n; i++) {
 *             String input = sc.nextLine();
 *             String[] arr = input.split(" ");
 *
 *             answers[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
 *         }
 *
 *         for(int i = 0; i < n; i++) {
 *             System.out.println(answers[i]);
 *         }
 *     }
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         String number = sc.nextLine();
 *         int n = Integer.parseInt(number);
 *
 *         int[] answers = new int[n];
 *
 *         for(int i = 0; i < n; i++) {
 *             String input = sc.nextLine();
 *             String[] arr = input.split(" ");
 *
 *             answers[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
 *         }
 *
 *         for(int i = 0; i < n; i++) {
 *             System.out.println(answers[i]);
 *         }
 *     }
 *
 *
 * public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt();
 *
 *         for (int i = 1; i <= 9; i++) {
 *             System.out.println(n + " * " + i + " = " + (n * i));
 *         }
 *     }
 */