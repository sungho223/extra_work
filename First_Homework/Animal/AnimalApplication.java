package First_Homework.Animal;

public class AnimalApplication {
    public static void main(String[] args) {
        /**
         * 문제 27번 Animal 클래스로 여러가지 인스턴스를 만들어보세요
         */
        Animal cow = new Animal("말랑", "소", "음메음메");
        cow.selfIntroduce();
        cow.cry();

        System.out.println();

        Animal chicken = new Animal("굽네굽네", "치킨", "꼬꼬꼬");
        chicken.selfIntroduce();
        chicken.cry();
    }
}
