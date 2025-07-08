package backjoon2025.july.practice_intermediate;

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
        int isPalindrome = 1;

        String word = br.readLine();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = 0;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}

/**
 *
 * public static void main(String[] args) throws IOException {
 *         Scanner sc = new Scanner(System.in);
 *         int n = Integer.parseInt(sc.nextLine());
 *
 *         for (int i = 0; i < n; i++) {
 *             for (int j = n - 1 - i; j > 0; j--) {
 *                 System.out.print(" ");
 *             }
 *             for (int k = 0; k <= i; k++) {
 *                 System.out.print("*");
 *             }
 *             for (int l = 1; l <= i; l++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 *
 *         for (int i = 0; i < n - 1; i++) {
 *             for (int j = 0; j <= i; j++) {
 *                 System.out.print(" ");
 *             }
 *             for (int k = n - 1 - i; k > 0; k--) {
 *                 System.out.print("*");
 *             }
 *             for (int l = 0; l < n - 2 - i; l++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         int[] chess = {1, 1, 2, 2, 2, 8};
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *
 *         for (int i = 0; i < chess.length; i++) {
 *             int whiteChess = Integer.parseInt(st.nextToken());
 *             bw.write((chess[i] - whiteChess) + " ");
 *         }
 *
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) {
 *         System.out.println("         ,r'\"7");
 *         System.out.println("r`-_   ,'  ,/");
 *         System.out.println(" \\. \". L_r'");
 *         System.out.println("   `~\\/");
 *         System.out.println("      |");
 *         System.out.println("      |");
 *     }
 */