package backjoon2025.july.practice_decimal;

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

        String factor = "factor";
        String multiple = "multiple";
        String neither = "neither";

        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            // 로직 on . . .
            if (a > b) {
                if (a % b == 0) {
                    bw.write(multiple);
                } else {
                    bw.write(neither);
                }
            } else {
                if (b % a == 0) {
                    bw.write(factor);
                } else {
                    bw.write(neither);
                }
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
