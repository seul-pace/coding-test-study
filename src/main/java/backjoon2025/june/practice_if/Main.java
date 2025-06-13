package backjoon2025.june.practice_if;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int prize = 0;

        if (a == b && b == c) {
            // 3개 다 같은 수
            prize = 10_000 + a * 1_000;
        } else if (a == b || b == c || a == c) {
            // 2개만 같은 수
            if (a == b || b == c) {
                prize = 1_000 + b * 100;
            } else {
                prize = 1_000 + c * 100;
            }
        } else {
            // 전부 다른 수
            int max = Math.max(a, b);
            max = Math.max(max, c);
            prize = max * 100;
        }

        System.out.println(prize);
    }
}

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine();
        int inputCost = sc.nextInt();

        // 시간 -> 분
        String[] arr = inputTime.split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        int total = hour * 60 + minute + inputCost;

        // 시간/분 변환
        int h = total / 60;
        int m = total % 60;

        if (h >= 24) {
            h = h - 24;
        }

        System.out.println(h + " " + m);
    }
 */

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        // 45분 빼기
        int minute = m - 45;
        int hour = h;
        if (minute < 0) {
            // 이전 시간 가져오기
            hour = h - 1;
            if (hour < 0) {
                hour = 23;
            }
            // 분 조정
            minute += 60;
        }
        System.out.println(hour + " " + minute);
    }
 */

/*public static void main(String[] args) {
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
}*/

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
