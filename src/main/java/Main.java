import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // 123456을 열심히 뒤집기
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> result = reverse(list);

        int[] arr2 = list.stream()
                .mapToInt(Integer::intValue).toArray();

        System.out.println();
    }

    public static List<Integer> reverse(List<Integer> list) {
        if (list.size() == 1) return list;

        Collections.reverse(list);

        int k = list.size() / 2;
        if (list.size() % 2 != 0) {
            k = k + 1;
        }

        List<Integer> sublist1 = list.subList(0, k);
        List<Integer> sublist2 = list.subList(k, list.size());

        List<Integer> result = new ArrayList<>();
        result.addAll(reverse(sublist1));
        result.addAll(reverse(sublist2));
        return result;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = Integer.parseInt(sc.next());
//
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // input
//        int n = Integer.parseInt(sc.next());
//        int[][] arr = new int[][]{};
//        for (int i = 0; i < n; i++) {
//            String[] tempLineArr = sc.nextLine().split(" ");
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = Integer.parseInt(tempLineArr[j]);
//            }
//        }
//        String positions = sc.nextLine();
//        String[] splitPositions = positions.split(" ");
//        int r = Integer.parseInt(splitPositions[0]);
//        int c = Integer.parseInt(splitPositions[0]);
//
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        String[] s = input.split(" ");
//        int a = Integer.parseInt(s[0]);
//        int b = Integer.parseInt(s[1]);
//        int c = Integer.parseInt(s[2]);
//
//        int sum = 0;
//        for (int i=a; i<=b; i++) {
//            if (i % 3 == 0 || i % c == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
}
