package First_Homework;

// 실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
// 두 값 중 큰 수만 출력한다.

public class Q13 {

    public static void main(String[] args) {

        double num1 =  (Math.random() * 100);
        double num2 =  (Math.random() * 100);
        double max = (num1 > num2) ? num1 : num2;

        System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
        System.out.println("더 큰 수는 " + max);
    }
}

// num1 : 85.07502013161972
// num2 : 91.68256137053496
// 더 큰 수는 91.68256137053496