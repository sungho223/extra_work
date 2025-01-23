package First_Homework;

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
