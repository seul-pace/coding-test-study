package backjoon2025.august.practice_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    // 2798: 블랙잭...! 카드 n개 받아서 가장 m에 가까운 합을 리턴
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;
        int gap = Integer.MAX_VALUE;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == m) {
                        System.out.println(sum);
                        return;
                    } else if (sum < m) {
                        int temp = m - sum;

                        if (temp < gap) {
                            gap = temp;
                            result = sum;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
