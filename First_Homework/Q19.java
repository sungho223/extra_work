package First_Homework;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 ");
            int n = sc.nextInt();
            if (n == 0 || n % 2 != 0) {
                System.out.println("게임을 마칩니다.");
                break;
            } else {
                System.out.println(n + "는 2의 배수입니다.");
            }
        }
        sc.close();
    }
}
