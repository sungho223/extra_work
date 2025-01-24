package First_Homework;

// 실수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
// 다섯 값의 평균보다 큰 수들을 출력한다.

public class Q15 {
    static double num1 = (Math.random() * 100);
    static double num2 = (Math.random() * 100);
    static double num3 = (Math.random() * 100);
    static double num4 = (Math.random() * 100);
    static double num5 = (Math.random() * 100);

    public static double avg() {
        double sum = num1 + num2 + num3 + num4 + num5;
        return sum / 5;
    }

    public static void main(String[] args) {

        System.out.println("1번째 값: " + num1);
        System.out.println("2번째 값: " + num2);
        System.out.println("3번째 값: " + num3);
        System.out.println("4번째 값: " + num4);
        System.out.println("5번째 값: " + num5);
        System.out.println("평균은 " + avg());
        System.out.println();

        if (num1 > avg())
        System.out.println("1번째 값: " + num1);
        if (num2 > avg())
        System.out.println("2번째 값: " + num2);
        if (num3 > avg())
        System.out.println("3번째 값: " + num3);
        if (num4 > avg())
        System.out.println("4번째 값: " + num4);
        if (num5 > avg())
        System.out.println("5번째 값: " + num5);

    }

}

// 1번째 값: 59.15714782389462
// 2번째 값: 18.08658401304276
// 3번째 값: 2.7931111139094744
// 4번째 값: 80.42008069855495
// 5번째 값: 54.602539595217834
// 평균은 43.011892648923926

// 1번째 값: 59.15714782389462
// 4번째 값: 80.42008069855495
// 5번째 값: 54.602539595217834