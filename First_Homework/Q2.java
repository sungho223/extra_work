package First_Homework;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("정수를 입력하세요: ");
            int n = sc.nextInt();
    
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
            if (sc.nextInt() == -1)
                break;

        }

        sc.close();
    }
}
