package test2404;

/**
 * 2진수 만들기
 *
 * Integer.toBinaryString 2진수 만드는 메서드
 * Integer.bitCount 2진수 중 1의 숫자 구하는 메서드
 */
public class Code16 {

    public static void main(String[] args) {
        int solution = solution(78);
        System.out.println(solution);
    }

    public static int solution(int n) {
        Object[] objects = makeBinaryAndCountOne(n);

        while (n <= 1_000_000) {
            Object[] results = makeBinaryAndCountOne(++n);

            if (results[1] == objects[1]) {
                break;
            }
        }

        return n;
    }

    // 2진수 만들어서 리턴
    public static Object[] makeBinaryAndCountOne(int n) {
        Object[] objects = new Object[2];

        if (n == 1 || n == 0) {
            objects[0] = String.valueOf(n);
            objects[1] = n;
            return objects;
        }

        StringBuilder sb = new StringBuilder();
        int quotient = n;
        int left = 0;
        int count = 0;

        do {
            left = quotient % 2;
            quotient = quotient / 2;

            sb.append(left);

            if (left == 1) {
                count++;
            }
        } while (quotient >= 2);

        sb.append(quotient);

        objects[0] = sb.reverse().toString();
        objects[1] = count;

        return objects;
    }
}
