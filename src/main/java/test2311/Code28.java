package test2311;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class Code28 {

    public static void main(String[] args) {
        int result1 = solution("3141592", "271");
        System.out.println("result1 = " + result1);
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long pToLong = Long.parseLong(p);

        for (int i = 0; i <= t.length() - size; i++) {
            String substringT = t.substring(i, i +size);
            if (Long.parseLong(substringT) <= pToLong) {
                answer++;
            }
        }

        return answer;
    }

    /**
     * 1. int로 하면 자릿수 때문에 크기가 안 맞음
     *
     * 2. stream으로 표현 가능
     long targetNumber = Long.parseLong(p);
     int targetNumberLength = p.length();

     return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
     .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
     .mapToLong(Long::parseLong)
     .filter(number -> number <= targetNumber)
     .count();
     */
}
