package backjoon2025.july.practice_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String lines = br.readLine();
        String[] arr = lines.split(" ");
        int n = Integer.parseInt(arr[0]); // 바구니 개수
        int m = Integer.parseInt(arr[1]); // 공 넣는 횟수

        int[] buckets = new int[n];

        for (int i = 0; i < m; i++) {
            String inputs = br.readLine();
            String[] inputArr = inputs.split(" ");

            int start = Integer.parseInt(inputArr[0]) - 1;
            int end = Integer.parseInt(inputArr[1]) - 1;
            int number = Integer.parseInt(inputArr[2]);

            for (int j = start; j <= end; j++) {
                buckets[j] = number;
            }
        }

        for (int i = 0; i < buckets.length; i++) {
            bw.write(buckets[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}

/**

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int max = 0;
 int index = 0;

 for (int i = 0; i < 9; i++) {
 int n = Integer.parseInt(br.readLine());

 if (max < n) {
 max = n;
 index = i + 1;
 }
 }
 bw.write(String.valueOf(max));
 bw.newLine();
 bw.write(String.valueOf(index));
 bw.flush();
 bw.close();
 }


 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int N = Integer.parseInt(br.readLine());
 String line = br.readLine();
 String[] split = line.split(" ");

 int max = Integer.parseInt(split[0]);
 int min = Integer.parseInt(split[0]);

 for (int i = 0; i < N; i++) {
 max = Math.max(max, Integer.parseInt(split[i]));
 min = Math.min(min, Integer.parseInt(split[i]));
 }

 bw.write(min + " " + max);
 bw.flush();
 bw.close();
 }


 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 String firstLine = br.readLine();
 String A = br.readLine();

 String[] split = firstLine.split(" ");
 int n = Integer.parseInt(split[0]);
 int x = Integer.parseInt(split[1]);
 String[] a = A.split(" ");

 for (int i = 0; i < n; i++) {
 if (Integer.parseInt(a[i]) < x) {
 bw.write(Integer.parseInt(a[i]) + " ");
 }
 }

 bw.flush();
 bw.close();
 }

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 int limit = Integer.parseInt(sc.nextLine());

 String inputNumbers = sc.nextLine();
 String[] inputs = inputNumbers.split(" ");
 int compareNumber = sc.nextInt();
 int result = 0;

 for (int i = 0; i < limit; i++) {
 if (compareNumber == Integer.parseInt(inputs[i])) {
 result++;
 }
 }

 System.out.println(result);
 }
 */
