package First_Homework;

/**
 * 정수형 변수 2개를 선언하고 값을 할당한다.
 * 값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
 * 나누기 결과가 할당된 변수의 값을 출력해본다.
 * 단, 소수점 이하의 자리수는 2자리만 저장해 출력한다.
 * 예> 10.3333333 => 10.34
 */

public class Q12 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        double result = (double) num1 / num2;
        double output = Math.round(result*100)/100.0;

        System.out.println("결과는 " + output);
    }
}
// 결과는 1.67