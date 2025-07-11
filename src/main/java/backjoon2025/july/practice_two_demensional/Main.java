package backjoon2025.july.practice_two_demensional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] paper = new int[100][100];

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) result++;
            }
        }

        System.out.println(result);
    }
}

/**
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *         int index;
 *         String[][] result = new String[5][15];
 *
 *         // 입력
 *         for(int i = 0; i < 5; i++) {
 *             index = 0;
 *             String input = br.readLine();
 *             for(int j = 0; j < input.length(); j++) {
 *                 result[i][index++] = Character.toString(input.charAt(j));
 *             }
 *         }
 *         // 출력
 *         for (int i = 0; i < 15; i++) {
 *             for (int j = 0; j < 5; j++) {
 *                 if (result[j][i] != null) {
 *                     bw.write(String.valueOf(result[j][i]));
 *                 }
 *             }
 *         }
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *         StringTokenizer st;
 *         int max = 0;
 *         int a = 1, b = 1;
 *
 *         for(int i = 0; i < 9; i++) {
 *             st = new StringTokenizer(br.readLine());
 *             for(int j = 0; j < 9; j++) {
 *                 int n = Integer.parseInt(st.nextToken());
 *                 if (max < n) {
 *                     max = n;
 *                     a = i + 1;
 *                     b = j + 1;
 *                 }
 *             }
 *         }
 *
 *         bw.write(String.valueOf(max));
 *         bw.newLine();
 *         bw.write(a + " " + b);
 *         bw.flush();
 *         bw.close();
 *     }
 *
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         StringTokenizer st = new StringTokenizer(br.readLine());
 *         int n = Integer.parseInt(st.nextToken());
 *         int m = Integer.parseInt(st.nextToken());
 *
 *         int[][] a = new int[n][m];
 *         int[][] b = new int[n][m];
 *
 *         for (int i = 0; i < n; i++) {
 *             st = new StringTokenizer(br.readLine());
 *
 *             for(int j = 0; j < m; j++) {
 *                 a[i][j] = Integer.parseInt(st.nextToken());
 *             }
 *         }
 *         for (int i = 0; i < n; i++) {
 *             st = new StringTokenizer(br.readLine());
 *
 *             for(int j = 0; j < m; j++) {
 *                 b[i][j] = Integer.parseInt(st.nextToken());
 *             }
 *         }
 *         // 출력
 *         for (int i = 0; i < n; i++) {
 *             for(int j = 0; j < m; j++) {
 *                 bw.write((a[i][j] + b[i][j]) + " ");
 *             }
 *             bw.newLine();
 *         }
 *
 *         bw.flush();
 *         bw.close();
 *     }
 */