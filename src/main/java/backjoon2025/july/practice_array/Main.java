package backjoon2025.july.practice_array;

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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] result = new int[n];
        int[] temp;
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            // 역순 만들기
            temp = new int[b - a + 1];
            for (int j = b; j >= a; j--) {
                temp[index++] = result[j];
            }
            index = 0;

            // 역순 넣기
            for (int j = a; j <= b; j++) {
                result[j] = temp[index++];
            }
            index = 0;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

/**

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int n = Integer.parseInt(br.readLine());
 int[] scores = new int[n];
 int maxScore = 0;

 StringTokenizer st = new StringTokenizer(br.readLine());
 for (int i = 0; i < n; i++) {
 int score = Integer.parseInt(st.nextToken());
 maxScore = Math.max(maxScore, score);
 scores[i] = score;
 }

 double sum = 0.0;
 for (int i = 0; i < n; i++) {
 sum += ((double) scores[i] / maxScore) * 100.0;
 }
 System.out.println(sum / n);
 }

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int n = Integer.parseInt(br.readLine());
 int[] scores = new int[n];
 int maxScore = 0;

 StringTokenizer st = new StringTokenizer(br.readLine());
 for (int i = 0; i < n; i++) {
 int score = Integer.parseInt(st.nextToken());
 maxScore = Math.max(maxScore, score);
 scores[i] = score;
 }

 double sum = 0.0;
 for (int i = 0; i < n; i++) {
 sum += ((double) scores[i] / maxScore) * 100.0;
 }
 System.out.println(sum / n);
 }

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 //        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 Set<Integer> set = new HashSet<>();

 for (int i = 0; i < 10; i++) {
 int input = Integer.parseInt(br.readLine());
 set.add(input % 42);
 }

 System.out.println(set.size());
 }

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 int[] students = new int[30];

 for (int i = 0; i < 28; i++) {
 int student = Integer.parseInt(br.readLine());
 students[student - 1] = 1;
 }

 for (int i = 0; i < 30; i++) {
 if (students[i] == 0) {
 bw.write(String.valueOf(i + 1));
 bw.newLine();
 }
 }
 bw.flush();
 bw.close();
 }

 public static void main(String[] args) throws IOException {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 String input = br.readLine();
 String[] split = input.split(" ");
 int n = Integer.parseInt(split[0]);
 int m = Integer.parseInt(split[1]);

 int[] result = new int[n + 1]; // 0 1 2 3 4 5
 // 값 초기화
 for (int i = 0; i <= n; i++) {
 result[i] = i;
 }

 int temp = 0;
 for (int i = 0; i < m; i++) {
 StringTokenizer st = new StringTokenizer(br.readLine());
 int a = Integer.parseInt(st.nextToken());
 int b = Integer.parseInt(st.nextToken());

 temp = result[a];
 result[a] = result[b];
 result[b] = temp;
 }

 for (int i = 1; i <= n; i++) {
 bw.write(result[i] + " ");
 }

 bw.flush();
 bw.close();
 }

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
