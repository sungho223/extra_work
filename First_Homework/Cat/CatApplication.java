package First_Homework.Cat;

public class CatApplication {
    /**
     * 29번
     * Cat 클래스로 여러가지 인스턴스를 만들어보세요
     */
    public static void main(String[] args) {
        Cat c1 = new Cat("유미", "놀숲", "대형");
        c1.selfIntroduce();
        c1.cry();

        System.out.println();

        Cat c2 = new Cat("나미", "코숏", "소형");
        c2.selfIntroduce();
        ;
        c2.cry();
    }

}
