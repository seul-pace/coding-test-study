public class CodeStudy0305_2 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution("abacaba", "acb");
        System.out.println(result);
    }

    public static class Solution {
        public Solution() {}

        public int solution(String line1, String line2) {
            int answer = 0;

            /**
             * abbbcbbb bbb
             * .bbb....
             * .b_b_b..
             * ...b_b_b
             * .....bbb
             */

            for (int i=0; i<=line1.length() - line2.length(); i++) {
                String substringLine1 = line1.substring(i, i + line2.length());
                if (substringLine1.equals(line2)) answer++;
            }

            String[] splitLine1 = line1.split("");
            for (int i=0; i<splitLine1.length; i++) {
                // 앞 글자부터 다르면 넘어가기
                if (!splitLine1[i].equals(line2.substring(0, 1))) continue;

                // 같으면 공백 추가
                int count = 2; // 더하는 인덱스 수
                while(i + count <= splitLine1.length -1) {
                    String tempString = splitLine1[i];
                    int index = i + count;

                    while(tempString.length() < line2.length()) {
                        try {
                            tempString += splitLine1[index];
                            index += count;

                            if (tempString.equals(line2)) {
                                answer++;
                                break;
                            }
                        } catch (Exception ignore) {
                            break;
                        }
                    }
                    count ++; // 공백 수 더하기
                }
            }

            return answer;
        }
    }
}
