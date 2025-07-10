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
        int max = 0;
        int a = 1, b = 1;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (max < n) {
                    max = n;
                    a = i + 1;
                    b = j + 1;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(a + " " + b);
        bw.flush();
        bw.close();
    }
}

/**
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