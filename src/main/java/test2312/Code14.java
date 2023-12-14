package test2312;

public class Code14 {

    public static void main(String[] args) {
        String result = solution("jaron");
        System.out.println("result = " + result);
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string).reverse();
        return sb.toString();
    }
}
