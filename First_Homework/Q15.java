package First_Homework;

public class Q15 {
    static double num1 = (Math.random() * 100);
    static double num2 = (Math.random() * 100);
    static double num3 = (Math.random() * 100);
    static double num4 = (Math.random() * 100);
    static double num5 = (Math.random() * 100);

    public static double avg() {
        double sum = num1 + num2 + num3 + num4 + num5;
        double result = sum / 5;
        return Math.round(result * 100) / 100.0;
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
