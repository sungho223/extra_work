package First_Homework;

/**
 * 26번 문제: Animal 클래스를 만들어보세요
 * 멤버변수
 * - 이름
 * - 종류 (강아지, 고양이 등등)
 * - 울음소리
 * 메소드
 * 생성자
 * - 소개하기
 * - 울기
 */
public class Animal {
    String animalName;
    String animalType;
    String animalSound;

    public Animal(String animalName, String animalType, String animalSound) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalSound = animalSound;
    }

    public void selfIntroduce() {
        System.out.println("나의 이름은 " + this.animalName + "이고, " + " 종은 " + this.animalType + "입니다.");
    }

    public void cry() {
        System.out.println("나의 울음소리는 " + this.animalSound + "이니까 잘 기억해둬");
    }

    public static void main(String[] args) {
        /**
         * 문제 27번 Animal 클래스로 여러가지 인스턴스를 만들어보세요
         */
        Animal cow = new Animal("말랑", "소","음메음메");
        cow.selfIntroduce();
        cow.cry();

        System.out.println();

        Animal chicken = new Animal("굽네굽네", "치킨", "꼬꼬꼬");
        chicken.selfIntroduce();
        chicken.cry();
    }

}
