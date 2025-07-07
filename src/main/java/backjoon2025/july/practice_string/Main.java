package backjoon2025.july.practice_string;

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

        int index = 0;
        while (index++ < 100) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) {
                break;
            }

            bw.write(input);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

/**

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int sum = 0;

 String input = br.readLine();

 for (int i = 0; i < input.length(); i++) {
 char dial = input.charAt(i);

 switch (dial) {
 case 'A':
 case 'B':
 case 'C':
 sum += 3;
 break;
 case 'D':
 case 'E':
 case 'F':
 sum += 4;
 break;
 case 'G':
 case 'H':
 case 'I':
 sum += 5;
 break;
 case 'J':
 case 'K':
 case 'L':
 sum += 6;
 break;
 case 'M':
 case 'N':
 case 'O':
 sum += 7;
 break;
 case 'P':
 case 'Q':
 case 'R':
 case 'S':
 sum += 8;
 break;
 case 'T':
 case 'U':
 case 'V':
 sum += 9;
 break;
 case 'W':
 case 'X':
 case 'Y':
 case 'Z':
 sum += 10;
 break;
 default:
 }
 }

 bw.write(String.valueOf(sum));
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 StringTokenizer st = new StringTokenizer(br.readLine());

 StringBuilder sb = new StringBuilder(st.nextToken());
 int a = Integer.parseInt(sb.reverse().toString());

 sb = new StringBuilder(st.nextToken());
 int b = Integer.parseInt(sb.reverse().toString());

 bw.write(String.valueOf(Math.max(a, b)));

 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 StringTokenizer st = new StringTokenizer(br.readLine());
 bw.write(st.countTokens() + "");

 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int n = Integer.parseInt(br.readLine());

 for (int i = 0; i < n; i++) {
 StringTokenizer st = new StringTokenizer(br.readLine());

 int r = Integer.parseInt(st.nextToken());
 String[] arr = st.nextToken().split("");

 for (int j = 0; j < arr.length; j++) {
 for (int k = 0; k < r; k++) {
 bw.write(String.valueOf(arr[j]));
 }
 }
 bw.newLine();
 }
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 String input = br.readLine();

 for (int i = 97; i < 123; i++) {
 bw.write(input.indexOf((char) i) + " ");
 }
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int n = Integer.parseInt(br.readLine());
 int sum = 0;
 for (int i = 0; i < n; i++) {
 sum += Character.getNumericValue(br.read());
 }
 bw.write(String.valueOf(sum));
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 System.out.println(br.read());
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int n = Integer.parseInt(br.readLine());

 for (int i = 0; i < n; i++) {
 String input = br.readLine();
 bw.write(input.charAt(0)
 + String.valueOf(input.charAt(input.length() - 1)));
 bw.newLine();
 }
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 String s = br.readLine();
 int i = Integer.parseInt(br.readLine());
 char c = s.charAt(i - 1);

 bw.write(Character.toString(c));
 bw.flush();
 bw.close();
 }

 */
