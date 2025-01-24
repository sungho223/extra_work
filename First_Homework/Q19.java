package First_Homework;

// Scanner 이용.
// 2의 배수만 입력하는 문제를 만든다.
// 만약, 2의 배수가 아니거나 0 또는 음수를 입력하면
// "게임을 마칩니다" 를 출력하며 반복문을 종료한다.

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 ");
            int n = sc.nextInt();

            if (n == 0 || n % 2 != 0 || n < 0) {
                System.out.println("게임을 마칩니다.");
                break;

            } else {
                System.out.println(n + "는 2의 배수입니다.");
            }
        }
        sc.close();
    }
}

// 숫자를 입력하세요 8
// 8는 2의 배수입니다.
// 숫자를 입력하세요 0
// 게임을 마칩니다.