package backjoon2025.july.geometric1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 10101: 세 각을 받아 삼각형의 종류 구분
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (a + b + c != 180) {
            System.out.println("Error");
        } else if (a != b && a != c && b != c) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
        }
    }
}

/**
 *
 * // 9063: 좌표를 받고 좌표들을 포함하는 가장 작은 직사각형의 너비
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st;
 *         int n = Integer.parseInt(br.readLine());
 *
 *         int minX = Integer.MAX_VALUE;
 *         int maxX = Integer.MIN_VALUE;
 *         int minY = Integer.MAX_VALUE;
 *         int maxY = Integer.MIN_VALUE;
 *
 *         for (int i=0; i<n; i++) {
 *             st = new StringTokenizer(br.readLine());
 *             int x = Integer.parseInt(st.nextToken());
 *             int y = Integer.parseInt(st.nextToken());
 *
 *             minX = Math.min(minX, x);
 *             maxX = Math.max(maxX, x);
 *             minY = Math.min(minY, y);
 *             maxY = Math.max(maxY, y);
 *         }
 *
 *         System.out.println((maxX - minX) * (maxY - minY));
 *     }
 *
 * // 15894: 가장 아랫층 수부터 피라미드 모양 도형의 전체 둘레 구하기
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         System.out.println(Long.parseLong(br.readLine()) * 4); // 입력 값이 10의 9승까지 가능해서..
 *     }
 *
 * // 3009: 직사각형의 3개의 x, y 좌표가 주어지고 나머지 1개 찾기 (3개밖에 안 들어온다는 전제 하에 이게 제일 빠름)
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         StringTokenizer st;
 *         StringBuffer sb = new StringBuffer();
 *
 *         int x1, x2 = -1, y1, y2 = -1;
 *
 *         // 1번
 *         st = new StringTokenizer(br.readLine());
 *         x1 = Integer.parseInt(st.nextToken());
 *         y1 = Integer.parseInt(st.nextToken());
 *
 *         // 2번
 *         st = new StringTokenizer(br.readLine());
 *         int x = Integer.parseInt(st.nextToken());
 *         int y = Integer.parseInt(st.nextToken());
 *
 *         if (x != x1) {
 *             x2 = x;
 *         } else {
 *             x1 = -1;
 *         }
 *         if (y != y1) {
 *             y2 = y;
 *         } else {
 *             y1 = -1;
 *         }
 *
 *         // 3번
 *         st = new StringTokenizer(br.readLine());
 *         x = Integer.parseInt(st.nextToken());
 *         y = Integer.parseInt(st.nextToken());
 *
 *         if (x1 == -1) {
 *             sb.append(x).append(" ");
 *         } else {
 *             if (x == x1) {
 *                 sb.append(x2).append(" ");
 *             } else {
 *                 sb.append(x1).append(" ");
 *             }
 *         }
 *         if (y1 == -1) {
 *             sb.append(y);
 *         } else {
 *             if (y == y1) {
 *                 sb.append(y2);
 *             } else {
 *                 sb.append(y1);
 *             }
 *         }
 *
 *         System.out.println(sb);
 *     }
 *
 * // 1085: x,y 좌표에서 0,0 에서 w,h 까지의 직사각형의 경계선까지 거리
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 *         String input = br.readLine();
 *         String[] arr = input.split(" ");
 *         int x = Integer.parseInt(arr[0]);
 *         int y = Integer.parseInt(arr[1]);
 *         int w = Integer.parseInt(arr[2]);
 *         int h = Integer.parseInt(arr[3]);
 *
 *         System.out.println(Math.min(Math.min(w - x, h - y), Math.min(x, y)));
 *     }
 *
 * // 27323번: x, y 받아서 너비 구하기
 * public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         System.out.println(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
 *     }
 */
