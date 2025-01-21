package academy_extra_work;
import java.util.Scanner;

class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println("몇자리 수인가:" + cNum.length + "자리수");
        System.out.println(sum);
        sc.close();
    }
}