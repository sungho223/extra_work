package First_Homework;

import java.util.Scanner;

public class Q3 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double min(double a, double b) {
        return a - b;
    }

    public static double times(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String z = sc.next();
            if (z.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }

            double num1 = sc.nextInt();
            double num2 = sc.nextInt();

            switch (z) {
                case "+":
                    System.out.println("결과는 " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("결과는 " + min(num1, num2));
                    break;
                case "*":
                    System.out.println("결과는 " + times(num1, num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("결과는 " + div(num1, num2));
                    } else {
                        System.out.println("0으로는 나눌 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("정확한 연산자를 입력하세요");
                    break;
            }

        }
        sc.close();
    }

}
