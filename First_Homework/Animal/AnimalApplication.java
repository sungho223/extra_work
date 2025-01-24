package First_Homework.Animal;

// Animal 클래스로 여러가지 인스턴스를 만들어보세요.
// - 강아지 인스턴스 여러개
// - 고양이 인스턴스 여러개 등등

public class AnimalApplication {
    public static void main(String[] args) {
        /**
         * 문제 27번 Animal 클래스로 여러가지 인스턴스를 만들어보세요
         */
        Animal cow = new Animal("말랑", "소", "음메음메");
        cow.selfIntroduce();
        // 나의 이름은 말랑이고, 종은 소입니다.

        cow.cry();
        // 나의 울음소리는 음메음메이니까 잘 기억해둬

        System.out.println();

        Animal chicken = new Animal("굽네굽네", "치킨", "꼬꼬꼬");
        chicken.selfIntroduce();
        // 나의 이름은 굽네굽네이고, 종은 치킨입니다.

        chicken.cry();
        // 나의 울음소리는 꼬꼬꼬이니까 잘 기억해둬
        System.out.println();

        cow.setAnimalName("아라비따");
        cow.selfIntroduce();
        // 나의 이름은 아라비따이고, 종은 소입니다.
        System.out.println();

        chicken.setAnimalType("칠면조");
        // 나의 이름은 굽네굽네이고, 종은 칠면조입니다.
        chicken.selfIntroduce();
    }
}






