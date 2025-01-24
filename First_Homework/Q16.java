package First_Homework;

// 정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
// 다섯 값 중 2, 5, 8의 배수인 것들만 출력한다.

public class Q16 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int num3 = (int) (Math.random() * 100);
        int num4 = (int) (Math.random() * 100);
        int num5 = (int) (Math.random() * 100);

        System.out.println();
        System.out.println("num1: " + num1 + "\nnum2: " + num2 + "\nnum3: " + num3 + "\nnum4: " + num4 + "\nnum5: " + num5);

        if (num1 % 2 == 0 && num1 % 5 == 0 && num1 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num1);
        }
        if (num2 % 2 == 0 && num2 % 5 == 0 && num2 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num2);
        }
        if (num3 % 2 == 0 && num3 % 5 == 0 && num3 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num3);
        }
        if (num4 % 2 == 0 && num4 % 5 == 0 && num4 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num4);
        }
        if (num5 % 2 == 0 && num5 % 5 == 0 && num5 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num5);
        }
    }
}

// num1: 80
// num2: 83
// num3: 95
// num4: 79
// num5: 15
// 조건을 만족하는 값: 80