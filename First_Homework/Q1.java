package First_Homework;

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
