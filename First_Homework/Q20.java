package First_Homework;

// Scanner 이용.
// 정수형 변수 enemyHealthPoint 를 만들고 Scanner의 nextInt() 함수를 이용해 값을 할당한다.
// 무한히 반복을 하면서 난수를 생성해 enemyHealthPoint의 값을 감소 시킨다.
// 만약 enemyHealthPoint의 값이 0이 되거나 음수가 되면 "Victory!" 를 출력하며 반복문을 종료한다.

import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int count = 0;
        System.out.println("초기값을 입력하세요: ");
        int enemyHealthPoint = sc.nextInt();

        while (true) {

            int damage = random.nextInt(10) + 1; // random의 범위 = 1 ~ 10
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

// 초기값을 입력하세요: 
// 100
// 4
// 8
// 1
// 8
// 7
// 1
// 7
// 2
// 2
// 3
// 2
// 3
// 9
// 7
// 7
// 9
// 10
// 5
// 5

// Victory
// 반복된 된 횟수: 19