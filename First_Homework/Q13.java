package First_Homework;

public class Q13 {

    public static void main(String[] args) {

        double num1 =  (Math.random() * 100);
        double num2 =  (Math.random() * 100);
        double max = (num1 > num2) ? num1 : num2;

        System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
        System.out.println("더 큰 수는 " + max);
    }
}
