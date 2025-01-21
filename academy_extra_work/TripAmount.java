package academy_extra_work;

public class TripAmount {

    public static void main(String[] args) {
        int money = generateRandomAmount(700_000, 300_000);
        System.out.println("여행경비: " + money);
        System.out.println();

        int fatherAge = generateRandomAge(30, 50);
        int motherAge = generateRandomAge(30, 50);
        int kidAge = generateRandomAge(0, 30);

        System.out.println("아빠의 나이: " + fatherAge);
        System.out.println("엄마의 나이: " + motherAge);
        System.out.println("자식의 나이: " + kidAge);
        System.out.println();

        int adultOneWayFlightFare = generateRandomAmount(200_000, 500_000);
        int kidOneWayFlightFare = generateRandomAmount(100_000, 200_000);

        System.out.println("어른 여행 가격: " + adultOneWayFlightFare);
        System.out.println("아이 여행 가격: " + kidOneWayFlightFare);
        System.out.println();

        int[] counts = calculateAdultsAndKids(fatherAge, motherAge, kidAge);
        int countAdult = counts[0];
        int countKid = counts[1];

        System.out.println("어른의 수: " + countAdult + " 아이의 수: " + countKid);
        System.out.println();

        int totalAmount = calculateTotalAmount(countAdult, countKid, adultOneWayFlightFare, kidOneWayFlightFare);
        System.out.println("금액의 합계: " + totalAmount);
        System.out.println();

        checkIfCanTravel(money, totalAmount);
    }

    public static int generateRandomAmount(int base, int range) {
        return (int) (Math.random() * range) + base;
    }

    public static int generateRandomAge(int base, int range) {
        return (int) (Math.random() * range) + base;
    }

    public static int[] calculateAdultsAndKids(int fatherAge, int motherAge, int kidAge) {
        int countAdult = 0;
        int countKid = 0;

        if (fatherAge >= 19) {
            countAdult++;
        } else {
            countKid++;
        }

        if (motherAge >= 19) {
            countAdult++;
        } else {
            countKid++;
        }

        if (kidAge >= 19) {
            countAdult++;
        } else {
            countKid++;
        }

        return new int[] { countAdult, countKid };
    }

    public static int calculateTotalAmount(int countAdult, int countKid, int adultFare, int kidFare) {
        return (adultFare * countAdult) + (kidFare * countKid);
    }

    public static void checkIfCanTravel(int money, int totalAmount) {
        if (totalAmount < money) {
            System.out.println("여행가자!");
        } else {
            System.out.println("다음에 가자!");
        }
    }
}
