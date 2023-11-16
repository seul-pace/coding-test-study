import java.util.Scanner;

public class Main {

    /**
     * 5
     * 1 2 3 4 5
     * 4 6 8 9 10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String a = sc.nextLine();
        String b = sc.nextLine();

        String[] aArr = a.split(" ");
        String[] bArr = b.split(" ");

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(bArr[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(aArr[i] + " ");
            }
        }

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
