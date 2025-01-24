package First_Homework;

// 파라미터로 정수를 전달하면, 해당 숫자가 소수(Prime number)인지 확인하고
// 소수라면 true, 아니라면 false를 반환시키는 메소드를 만들고 실행 후 결과를 출력해보세요.

import java.util.Scanner;

public class Q5 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(i); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + "은 소수입니다.");
        } else {
            System.out.println(n + "은 소수가 아닙니다.");
        }

        sc.close();
    }
}

// 2
// 2은 소수입니다.