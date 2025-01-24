package First_Homework;

// 구구단 2, 3단을 출력한다.

public class Q23 {
    public static void main(String[] args) {
        for (int i = 2; i < 4; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

// 2 X 1 = 2
// 2 X 2 = 4
// 2 X 3 = 6
// 2 X 4 = 8
// 2 X 5 = 10
// 2 X 6 = 12
// 2 X 7 = 14
// 2 X 8 = 16

// 3 X 1 = 3
// 3 X 2 = 6
// 3 X 3 = 9
// 3 X 4 = 12
// 3 X 5 = 15
// 3 X 6 = 18
// 3 X 7 = 21
// 3 X 8 = 24