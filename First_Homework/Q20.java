package First_Homework;

import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int count = 0;
        System.out.println("초기값을 입력하세요: ");
        int enemyHealthPoint = sc.nextInt();

        while (true) {

            int damage = random.nextInt(10) + 1;
            enemyHealthPoint -= damage;
            System.out.println(damage);
            count++;


            if (enemyHealthPoint <= 0) {
                System.out.println();
                System.out.println("Victory");
                System.out.println("반복된 된 횟수: " + count);
                break;
            }
        }
        sc.close();
    }
}
