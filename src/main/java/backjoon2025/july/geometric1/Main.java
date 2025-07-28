package backjoon2025.july.geometric1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 1085: x,y 좌표에서 0,0 에서 w,h 까지의 직사각형의 경계선까지 거리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] arr = input.split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        System.out.println(Math.min(Math.min(w - x, h - y), Math.min(x, y)));
    }
}

/**
 *
 * // 27323번: x, y 받아서 너비 구하기
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         System.out.println(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
 *     }
 */
