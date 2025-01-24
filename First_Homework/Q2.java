package First_Homework;

// 무한 구구단을 출력합니다.
// 사용자가 입력한 구구단의 결과를 출력합니다.
// 만약, 3을 입력했다면, 구구단 3단을 출력합니다.
// 만약, -1을 입력했다면, 구구단 출력 프로그램을 종료해야합니다.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("정수를 입력하세요: ");
            int n = sc.nextInt();

            for (int j = n; j <= 9; j++) {
                System.out.println(n + " * " + j + " = " + (n * j));
            }

            if (sc.nextInt() == -1)
                break;

        }

        sc.close();
    }
}

// 정수를 입력하세요: 
// 3
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// -1