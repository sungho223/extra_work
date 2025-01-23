package First_Homework.Animal;

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

}
