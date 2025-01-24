package First_Homework;

// 실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
// 세 값 중 가장 작은 수만 출력한다.

public class Q14 {
    public static void main(String[] args) {
        float num1 = (float) (Math.random() * 100);
        float num2 = (float) (Math.random() * 100);
        float num3 = (float) (Math.random() * 100);
        float min = 0;

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num1 && num3 < num1) {
            min = num3;
        }
        System.out.println("num1 : " + num1 + "\nnum2 : " + num2 + "\nnum3 : " + num3);
        System.out.println("최소값은 " + min);
    }
}

// num1 : 19.936106
// num2 : 32.5669
// num3 : 31.87729
// 최소값은 19.936106