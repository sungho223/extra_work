package extra_work;
public class demo2 {
    public static void main(String[] args) {
        int num = 7237;
        int result = 0;

        // int a = num/1000;
        // int b = (num%1000)/100;
        // int c = (num%100)/10;
        // int d = (num%10);

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // int result = a+b+c+d;

        for (int i = num; i > 0; i /= 10) {
            result += i % 10; // 현재 자릿수를 더함
        }
        int length = Integer.toString(num).length();
        System.out.println("몇 자리 수인가? " + length);

        System.out.println(result);
    }
}
