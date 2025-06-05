package backjoon2025.june;

import java.util.Scanner;

public class Study05 {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        double result = Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]);

        System.out.print(result);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) % Integer.parseInt(arr[1]));
    }
}

