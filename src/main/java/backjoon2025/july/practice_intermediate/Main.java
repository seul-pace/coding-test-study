package backjoon2025.july.practice_intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double classCount = 0.0;
        double sum = 0.0;

        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            double score = getScore(arr[2]);
            if (score != -1.0) {
                double credit = Double.parseDouble(arr[1]);
                sum += (score * credit);
                classCount += credit;
            }
        }

        System.out.println(sum / classCount);
    }

    private static double getScore(String grade) {
        double score = 0.0;
        switch(grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
            default:
                score = -1.0;
        }
        return score;
    }
}

/**
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int n = Integer.parseInt(br.readLine());
 *
 *         Map<String, Integer> map = new HashMap<>();
 *         int result = n;
 *
 *         for (int i = 0; i < n; i++) {
 *             String input = br.readLine();
 *             String[] arr = input.split("");
 *             String beforeWord = "";
 *             map.clear();
 *
 *             for (String a : arr) {
 *                 Integer count = map.getOrDefault(a, -1);
 *
 *                 if (count != -1) {
 *                     if (!beforeWord.equals(a)) {
 *                         result--;
 *                         break;
 *                     }
 *                 }
 *
 *                 map.put(a, ++count);
 *                 beforeWord = a;
 *             }
 *         }
 *         System.out.println(result);
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         String input = br.readLine();
 *
 *         String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
 *
 *         for (int i = 0; i < arr.length; i++) {
 *             input = input.replaceAll(arr[i], ".");
 *         }
 *
 *         System.out.println(input.length());
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         String input = br.readLine().toUpperCase();
 *
 *         Map<Character, Integer> countedMap = new HashMap<>();
 *         int max = 0;
 *
 *         // 겹치는 거 뽑기
 *         for (int i = 0; i < input.length(); i++) {
 *             char c = input.charAt(i);
 *             Integer count = countedMap.getOrDefault(c, 0);
 *
 *             countedMap.put(c, ++count);
 *             max = Math.max(max, count);
 *         }
 *
 *         int overlapCount = 0;
 *         char result = 0;
 *         // 많이 사용된 알파벳
 *         for (Character c : countedMap.keySet()) {
 *             if (countedMap.get(c) == max) {
 *                 result = c;
 *                 overlapCount++;
 *             }
 *         }
 *
 *         if (overlapCount > 1) {
 *             System.out.println("?");
 *         } else {
 *             System.out.println(result);
 *         }
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int isPalindrome = 1;
 *
 *         String word = br.readLine();
 *
 *         for (int i = 0; i < word.length() / 2; i++) {
 *             if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
 *                 isPalindrome = 0;
 *                 break;
 *             }
 *         }
 *
 *         System.out.println(isPalindrome);
 *     }
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