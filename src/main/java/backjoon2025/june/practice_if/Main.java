package backjoon2025.june.practice_if;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}

/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();
    Boolean result = false;

    if (year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0) {
            result = true;
        }
    }

    System.out.println(result.compareTo(false));
}*/

/*
* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }*/

/*
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String[] arr = input.split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);

    if (a > b) {
        System.out.print(">");
    } else if (a < b) {
        System.out.println("<");
    } else {
        System.out.println("==");
    }
}*/
