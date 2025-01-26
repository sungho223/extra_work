package First_Homework;

// 1 부터 10000 사이에 몇 개의 소수(Prime Number)가 있는지 세어 출력하는
// 메소드를 만들고 호출해보세요

public class Q4 {

    static int count = 0;

    public static void isPrime3() {
        for (int i = 2; i < 1001; i++) { 
            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {   // 2부터 √i까지 나눠봄
                if (i % j == 0) {                       // 나눠지는 경우 소수가 아님
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                count++;                                // 소수일 경우 카운트 증가
            }
        }
    }

    public static void main(String[] args) {
        isPrime3();                                     // 소수 계산 메서드 호출
        System.out.println("1부터 1000까지의 소수 개수는: " + count);
    }
}

// 1부터 1000까지의 소수 개수는: 168