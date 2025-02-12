package lecture.chap01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        List<String> request = new ArrayList<>();

        while(limit-- > 0) {
            String inputString = sc.next();
            request.add(inputString);
        }

        Solution4 T = new Solution4();
        T.solution(request);

        return;
    }

    public void solution(List<String> inputs) {
        List<String> result = new ArrayList<>();

        inputs.forEach(input -> result.add(this.reverseString(input)));

        for(String r : result) {
            System.out.println(r);
        }
    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
