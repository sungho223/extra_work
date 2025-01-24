package First_Homework.Cat;

public class CatApplication {
    /**
     * 29번
     * Cat 클래스로 여러가지 인스턴스를 만들어보세요
     */
    public static void main(String[] args) {
        Cat c1 = new Cat("유미", "놀숲", "대형");

        c1.selfIntroduce();
        // 안녕 내 이름은 유미라고 불러줘
        // 나는 놀숲종이고, 크기는 대형라고 하더라고

        c1.cry();
        // 유미가 우와와앙아 하고 울고 있습니다!

        System.out.println();

        Cat c2 = new Cat("나미", "코숏", "소형");

        c2.selfIntroduce();
        // 안녕 내 이름은 나미라고 불러줘
        // 나는 코숏종이고, 크기는 소형라고 하더라고

        c2.cry();
        // 나미가 우와와앙아 하고 울고 있습니다!
        
        System.out.println();

        c1.setCatName("라라");
        c2.setCatName("로로");

        c1.selfIntroduce();
        // 안녕 내 이름은 라라라고 불러줘
        // 나는 놀숲종이고, 크기는 대형라고 하더라고
        System.out.println();

        c2.selfIntroduce();
        // 안녕 내 이름은 로로라고 불러줘
        // 나는 코숏종이고, 크기는 소형라고 하더라고
    }

}
