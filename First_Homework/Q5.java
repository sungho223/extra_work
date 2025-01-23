package First_Homework;

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
