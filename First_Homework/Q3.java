package First_Homework;

// 계산기 만들기
// 세 개의 파라미터를 받아 결과를 반환하는 메소드를 만들어 호출합니다.
// 각 파라미터는 문자열, 숫자, 숫자 로 구성되어야 합니다.

// 문자열 파라미터에 할당될 수 있는 값은 "+", "-", "*", "/" 이며
// 숫자 파라미터는 정수, 부동소수점 어느 것을 선택해도 됩니다.

// 만약, 문자열 파라미터에 할당된 값이 "+" 라면, 두 숫자를 더해 결과를 반환하며
// "-" 라면 두 숫자를 뺀 결과를 반환하며
// "*" 라면 두 숫자를 곱한 결과를 반환해야 합니다.
// 마지막으로 "/" 라면 두 숫자를 나눈 값을 반환해야 합니다.

// 계산기는 무한히 반복하며 계산할 수 있어야 하며, 매 반복시 마다
// 파라미터에 할당될 값을 입력할 수 있어야 합니다.

// "exit" 문자열을 입력하면 반복이 종료되어 애플리케이션이 종료되어야 합니다.

import java.util.Scanner;

public class Q3 {

    public static int calc(String z, int a, int b) {
        switch (z) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("0으로는 못나눕니다.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("연산자가 틀렸습니다.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("연산기호를 입력하세요: ");
            String z = sc.next();

            if(z.equals("exit")){
                System.out.println("종료");
                break;
            }

            System.out.println("첫번째 값 입력: ");
            int a = sc.nextInt();

            System.out.println("두번째 값 입력: ");
            int b = sc.nextInt();

            int result = calc(z, a, b);

            System.out.println("결과");
            System.out.println(result);
        }
        sc.close();
    }
}


// 연산기호를 입력하세요: 
// 
// 첫번째 값 입력: 
// 3
// 두번째 값 입력: 
// 2
// 결과
// 1
// 연산기호를 입력하세요:
// +
// 첫번째 값 입력: 
// 1
// 두번째 값 입력: 
// 2
// 결과
// 3
// 연산기호를 입력하세요:
// *
// 첫번째 값 입력: 
// 3
// 두번째 값 입력: 
// 4
// 결과
// 12
// 연산기호를 입력하세요:
// exit
// 종료