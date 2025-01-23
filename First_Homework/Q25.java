package First_Homework;

public class Q25 {

    public static boolean isPrime2(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 1000; // 1부터 1000까지
        for (int i = 1; i <= limit; i++) {
            
            if (isPrime2(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
