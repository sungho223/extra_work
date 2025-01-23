package First_Homework;

public class Q17 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int num3 = (int) (Math.random() * 100);
        int num4 = (int) (Math.random() * 100);
        int num5 = (int) (Math.random() * 100);

   
        System.out.println("num1: " + num1 + "\nnum2: " + num2 + "\nnum3: " + num3 + "\nnum4: " + num4 + "\nnum5: " + num5);
        System.out.println();
        
        if (num1 % 2 == 0 || num1 % 5 == 0 || num1 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num1);
        }
        if (num2 % 2 == 0 || num2 % 5 == 0 || num2 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num2);
        }
        if (num3 % 2 == 0 || num3 % 5 == 0 || num3 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num3);
        }
        if (num4 % 2 == 0 || num4 % 5 == 0 || num4 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num4);
        }
        if (num5 % 2 == 0 || num5 % 5 == 0 || num5 % 8 == 0) {
            System.out.println("조건을 만족하는 값: " + num5);
        }
    }
}
