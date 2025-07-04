package backjoon2025.july.practice_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

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
}

/**

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
