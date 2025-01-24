package First_Homework;

// 손님이 영화관에 10000원을 가지고 입장했습니다.
// 손님은 관람비가 18000원인 영화를 관람하려 합니다.
// 손님은 영화를 관람할 수 있을까요?
// 관람할 수 있다면, "관람가능"을 출력하고 지불하고 남은 금액을 출력합니다.
// 관람할 수 없다면, "관람불가능"을 출력하고 모자란 금액을 출력합니다.

public class Q1 {

    public static void main(String[] args) {

        int wallet = 10000;
        int movieCost = 18000;
        String status = "";

        if (wallet >= movieCost) {
            status = "관람가능";
        } else {
            status = "관람불가능";
        }

        System.out.println(status);

    }

}

// 관람불가능